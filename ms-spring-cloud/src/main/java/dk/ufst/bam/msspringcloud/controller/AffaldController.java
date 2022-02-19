package dk.ufst.bam.msspringcloud.controller;

import dk.ufst.bam.msspringcloud.controller.operations.AffaldOperations;
import dk.ufst.bam.msspringcloud.repository.entity.AffaldEntity;
import dk.ufst.bam.msspringcloud.service.AffaldService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class AffaldController implements AffaldOperations {

    private  final AffaldService affaldService;

    public Flux<AffaldEntity> getAll() {
        return Flux.fromIterable(affaldService.findAll());
    }
    public Mono<AffaldEntity> find(String id){
        return Mono.just(affaldService.findAffaldById(id).get());
    }

    public void create(AffaldEntity affald){

        affaldService.save(affald);
    }

}
