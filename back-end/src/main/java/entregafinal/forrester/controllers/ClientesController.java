package entregafinal.forrester.controllers;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;
import entregafinal.forrester.models.Clientes;
import entregafinal.forrester.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/users")
public class ClientesController {
    
    @Autowired
    private ClientesService clientesService;
    
    @GetMapping
    public List<Clientes> findAll() {
        return clientesService.findAll();
    }
    @PostMapping("/novo")
    public ResponseEntity<Clientes> save(@RequestBody Clientes user) {
        clientesService.save(user);
        return ResponseEntity.ok().body(user);
    }
    @PutMapping("/editar/{id}")
    public ResponseEntity<Clientes> edit(@PathVariable Long id, @RequestBody Clientes user) {
        var userkeep = clientesService.edit(id, user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();

        return ResponseEntity.created(uri).body(userkeep);
    }
    @DeleteMapping("/apagar/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clientesService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
