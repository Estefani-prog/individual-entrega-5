package entregafinal.forrester.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entregafinal.forrester.models.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    
}
