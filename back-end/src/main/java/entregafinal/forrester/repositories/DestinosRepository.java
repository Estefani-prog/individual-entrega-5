package entregafinal.forrester.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entregafinal.forrester.models.Destinos;

@Repository
public interface DestinosRepository extends JpaRepository<Destinos, Long> {

}
