package dk.ufst.bam.msspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MsSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringCloudApplication.class, args);
	}

}
