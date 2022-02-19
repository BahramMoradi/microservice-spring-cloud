package dk.ufst.bam.userservice.reposiory.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Table("user")
@Data
@Audited
public class UserEntity {
    @PrimaryKey
    private String id = UUID.randomUUID().toString();
    private String fornavn;
    private String efternavn;
    private String email;
}
