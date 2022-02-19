package dk.ufst.bam.userservice.reposiory.entity;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends ReactiveCassandraRepository<UserEntity, String> {
}
