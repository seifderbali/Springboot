package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Like;

@Repository
public interface LikeRepository extends CrudRepository<Like, Long>{

}
