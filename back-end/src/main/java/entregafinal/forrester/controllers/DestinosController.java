package entregafinal.forrester.controllers;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;
import entregafinal.forrester.models.Destinos;
import entregafinal.forrester.services.DestinosService;
import entregafinal.forrester.util.DateUtil;

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
@RequestMapping(value = "/travels")
public class DestinosController {
    
    @Autowired
    private DestinosService destinosService;
    
    @GetMapping
    public List<Destinos> findAll() {
        return destinosService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Destinos> save(@RequestBody Destinos destino) {
        destinosService.save(destino);
        return ResponseEntity.ok().body(destino);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Destinos> edit(@PathVariable Long id, @RequestBody Destinos destino) {
        var destinokeep = destinosService.edit(id, destino);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(destinokeep.getId()).toUri();

        return ResponseEntity.created(uri).body(destinokeep);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        destinosService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
