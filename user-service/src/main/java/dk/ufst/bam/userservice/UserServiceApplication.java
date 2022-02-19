package dk.ufst.bam.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.addServersItem(new Server().url("/"))
				.info(new Info()
						.title("Database demo")
						.description("Demo projekt for forskellige database")
						.version("1.0.0")
				);
	}

}
