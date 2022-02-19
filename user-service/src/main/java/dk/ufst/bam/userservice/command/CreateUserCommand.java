package dk.ufst.bam.userservice.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserCommand {
 private String fornavn;
 private String efternavn;
 private String email;
}
