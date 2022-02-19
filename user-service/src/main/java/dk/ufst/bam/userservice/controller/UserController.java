package dk.ufst.bam.userservice.controller;

import dk.ufst.bam.userservice.command.CreateUserCommand;
import dk.ufst.bam.userservice.command.UpdateUserCommand;
import dk.ufst.bam.userservice.reposiory.entity.UserEntity;
import dk.ufst.bam.userservice.reposiory.entity.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController  implements UserOperation{
    private final UserRepository userRepository;
    @Override
    public Mono<ResponseEntity<UserEntity>> fetch(final String id) {
        return userRepository.findById(id).map(u->ResponseEntity.ok().body(u));
    }

    @Override
    public Flux<UserEntity> list() {
        return userRepository.findAll();
    }

    @Override
    public Mono<ResponseEntity<UserEntity>> create(final CreateUserCommand createUserCommand) {
        log.info("Received request for create user with data {}", createUserCommand);
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(createUserCommand,entity);

        return userRepository.save(entity).map(
                u-> ResponseEntity.created(URI.create("users/"+entity.getId())).body(u));
    }

    @Override
    public Mono<ResponseEntity<UserEntity>> update(final String id, final UpdateUserCommand updateUserCommand) {
        log.info("Received request for update user with data {}", updateUserCommand);
        return  userRepository.findById(id).map(u-> {
            u.setEmail(updateUserCommand.getEmail());
            return u;
        }).flatMap(this.userRepository::save).map(p->ResponseEntity.ok().body(p));

    }

    @Override
    public Mono<Void> delete(final String id) {
        return userRepository.deleteById(id);
    }
}
