package entregafinal.forrester.services;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entregafinal.forrester.models.Clientes;
import entregafinal.forrester.repositories.ClientesRepository;
import entregafinal.forrester.services.exceptions.DatabaseException;
import entregafinal.forrester.services.exceptions.ResourceNotFoundException;

@Service
public class ClientesService {
    
    @Autowired
    private ClientesRepository usersRepository;

    @Transactional(readOnly = true)
    public List<Clientes> findAll() {
        List<Clientes> users = usersRepository.findAll();
        return users;
    }

    @Transactional(readOnly = true)
    public Clientes findById(Long id) {
        Optional<Clientes> user = usersRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException("User by the ID nº"+id+" was not found"));
    }

    @Transactional
    public void save(Clientes user) {
        usersRepository.save(user);
    }

    @Transactional
    public Clientes edit(Long id, Clientes usuario) {
        Clientes userToEdit = usersRepository.getOne(id); 

        userToEdit.setNome(userToEdit.getNome());
        userToEdit.setEmail(userToEdit.getEmail());
        userToEdit.setTelefone(userToEdit.getTelefone());
        userToEdit.setDataNascimento(userToEdit.getDataNascimento());
        userToEdit.setCpf(userToEdit.getCpf());

        userToEdit = usersRepository.save(userToEdit);

        return new Clientes();
    }

    @Transactional
    public void delete(Long id) {
        try {
            usersRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("ID not found: " + id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity violation");
        }
    }


}
