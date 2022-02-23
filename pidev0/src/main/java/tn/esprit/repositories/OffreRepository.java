package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Offre;

@Repository
public interface OffreRepository extends CrudRepository<Offre, Long>{

}
