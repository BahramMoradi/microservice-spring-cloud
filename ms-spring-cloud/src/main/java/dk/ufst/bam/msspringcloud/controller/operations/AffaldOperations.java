package dk.ufst.bam.msspringcloud.controller.operations;

import dk.ufst.bam.msspringcloud.repository.entity.AffaldEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping(path = "/affald")
public interface AffaldOperations {
    @GetMapping
    Flux<AffaldEntity> getAll();
    @GetMapping("/find/{id}")
    Mono<AffaldEntity> find(@PathVariable final String id);
    @PostMapping()
    void create(@RequestBody final AffaldEntity affald);
}
