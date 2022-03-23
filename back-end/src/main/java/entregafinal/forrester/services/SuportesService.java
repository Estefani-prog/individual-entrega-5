package entregafinal.forrester.services;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entregafinal.forrester.models.Suporte;
import entregafinal.forrester.repositories.SuporteRepository;
import entregafinal.forrester.services.exceptions.DatabaseException;
import entregafinal.forrester.services.exceptions.ResourceNotFoundException;

@Service
public class SuportesService {
    @Autowired
    private SuporteRepository suportesRepository;

    @Transactional(readOnly = true)
    public List<Suporte> findAll() {
        List<Suporte> suportes = suportesRepository.findAll();
        return suportes;
    }

    @Transactional(readOnly = true)
    public Suporte findById(Long id) {
        Optional<Suporte> suporte = suportesRepository.findById(id);
        return suporte.orElseThrow(() -> new RuntimeException("Suporte by the ID nº"+id+" was not found"));
    }

    @Transactional
    public void save(Suporte suporte) {
        suportesRepository.save(suporte);
    }

    @Transactional
    public Suporte edit(Long id, Suporte suporte) {
        Suporte suporteNovo = suportesRepository.getOne(id); 

        suporteNovo.setNome(suporteNovo.getNome());
        suporteNovo.setEmail(suporteNovo.getEmail());
        suporteNovo.setMensagem(suporteNovo.getMensagem());


        suporteNovo = suportesRepository.save(suporteNovo);

        return new Suporte();
    }

    @Transactional
    public void delete(Long id) {
        try {
            suportesRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Suporte ID: \"" + id + "\" was not found. Probably it was deleted or never existed.");
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity violation. Please, check if the Suporte ID: \"" + id + "\" was not used in any other table.");
        }
    }
}
