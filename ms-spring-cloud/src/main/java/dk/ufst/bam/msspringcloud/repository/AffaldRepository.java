package dk.ufst.bam.msspringcloud.repository;

import dk.ufst.bam.msspringcloud.repository.entity.AffaldEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AffaldRepository extends MongoRepository<AffaldEntity,String> {
}
