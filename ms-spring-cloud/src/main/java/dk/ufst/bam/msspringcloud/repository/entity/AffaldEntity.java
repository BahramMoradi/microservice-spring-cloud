package dk.ufst.bam.msspringcloud.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "affald")
public class AffaldEntity {
    @Id
    private String id;
    private String beskrivelse;
    private String type;
}
