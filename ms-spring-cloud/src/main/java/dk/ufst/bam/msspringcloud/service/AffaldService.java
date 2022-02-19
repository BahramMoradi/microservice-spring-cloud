package dk.ufst.bam.msspringcloud.service;

import dk.ufst.bam.msspringcloud.repository.AffaldRepository;
import dk.ufst.bam.msspringcloud.repository.entity.AffaldEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Slf4j
@Service
public class AffaldService {
    private final AffaldRepository affaldRepository;

    public void save(AffaldEntity affald){
        affaldRepository.save(affald);
    }

    public Optional<AffaldEntity> findAffaldById(String id){
       return affaldRepository.findById(id);
    }

    public void deleteById (String id){
        affaldRepository.deleteById(id);
    }

    public List<AffaldEntity> findAll(){
        return affaldRepository.findAll();
    }
}
