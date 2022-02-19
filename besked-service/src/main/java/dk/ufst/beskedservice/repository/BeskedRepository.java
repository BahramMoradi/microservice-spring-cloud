package dk.ufst.beskedservice.repository;

import dk.ufst.beskedservice.repository.entity.BeskedEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeskedRepository extends MongoRepository<BeskedEntity,String> {
}
