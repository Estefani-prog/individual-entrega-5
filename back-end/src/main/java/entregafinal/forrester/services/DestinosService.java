package entregafinal.forrester.services;

import java.util.List;
import java.util.Optional;

import entregafinal.forrester.models.Destinos;
import entregafinal.forrester.repositories.DestinosRepository;
import entregafinal.forrester.services.exceptions.DatabaseException;
import entregafinal.forrester.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DestinosService {

    @Autowired
    private DestinosRepository destinosRepository;

    @Transactional(readOnly = true)
    public List<Destinos> findAll() {
        List<Destinos> destinos = destinosRepository.findAll();
        return destinos;
    }
    @Transactional(readOnly = true)
    public Destinos findById(Long id) {
        Optional<Destinos> destinos = destinosRepository.findById(id);
        return destinos.orElseThrow(() -> new RuntimeException());
    }
    @Transactional
    public void save(Destinos destinos) {
        destinosRepository.save(destinos);
    }
    @Transactional
    public Destinos edit(Long id, Destinos destinos) {
        Destinos destinosNovo = destinosRepository.getOne(id); 

        destinosNovo.setNome(destinosNovo.getNome());
        destinosNovo.setDescricao(destinosNovo.getDescricao());
        destinosNovo.setImagem(destinosNovo.getImagem());
        destinosNovo.setPreco(destinosNovo.getPreco());

        destinosNovo = destinosRepository.save(destinosNovo);

        return new Destinos();
    }

    @Transactional
    public void delete(Long id) {
        try {
            destinosRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Travel ID: \"" + id + "\" was not found. Probably it was deleted or never existed.");
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity violation. Please, check if the Travel ID: \"" + id + "\" was not used in any other table.");
        }
    }
}
