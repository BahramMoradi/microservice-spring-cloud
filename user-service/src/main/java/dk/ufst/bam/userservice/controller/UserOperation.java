package dk.ufst.bam.userservice.controller;

import dk.ufst.bam.userservice.command.CreateUserCommand;
import dk.ufst.bam.userservice.command.UpdateUserCommand;
import dk.ufst.bam.userservice.reposiory.entity.UserEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("user")
public interface UserOperation {

    @GetMapping(path = "{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    Mono<ResponseEntity<UserEntity>> fetch(@PathVariable("id") String id);

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    Flux<UserEntity> list();

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    Mono<ResponseEntity<UserEntity>> create(@Validated @RequestBody CreateUserCommand createUserCommand);

    @PutMapping(path = "{id}", consumes = {MediaType.APPLICATION_JSON_VALUE},  produces = {MediaType.APPLICATION_JSON_VALUE})
    Mono<ResponseEntity<UserEntity>> update(@PathVariable("id") String id,@Validated @RequestBody UpdateUserCommand updateUserCommand);

    @DeleteMapping(path = "{id}")
    Mono<Void> delete(@PathVariable("id") String id);
}
