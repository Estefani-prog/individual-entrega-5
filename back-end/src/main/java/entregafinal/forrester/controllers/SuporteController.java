package entregafinal.forrester.controllers;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;
import entregafinal.forrester.models.Suporte;
import entregafinal.forrester.services.SuportesService;

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
@RequestMapping(value = "/suporte")
public class SuporteController {
    
    @Autowired
    private SuportesService suporteService;
    
    @GetMapping
    public List<Suporte> findAll() {
        return suporteService.findAll();
    }

    @PostMapping("/novo")
    public ResponseEntity<Suporte> save(@RequestBody Suporte suporte) {
        suporteService.save(suporte);
        return ResponseEntity.ok().body(suporte);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Suporte> edit(@PathVariable Long id, @RequestBody Suporte suporte) {
        var ticketkeep = suporteService.edit(id, suporte);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ticketkeep.getId()).toUri();

        return ResponseEntity.created(uri).body(ticketkeep);
    }

    @DeleteMapping("/apagar/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        suporteService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
