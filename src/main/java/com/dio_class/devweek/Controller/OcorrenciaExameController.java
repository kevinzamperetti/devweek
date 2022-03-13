package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.OcorrenciaExame;
import com.dio_class.devweek.Repository.OcorrenciaExameRepository;
import com.dio_class.devweek.Service.OcorrenciaExameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ocorrencia-exame")
public class OcorrenciaExameController {

    private final OcorrenciaExameRepository repository;
    private final OcorrenciaExameService service;

    public OcorrenciaExameController(OcorrenciaExameRepository repository, OcorrenciaExameService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<OcorrenciaExame>> findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OcorrenciaExame> getOcorrenciaById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/novo")
    public ResponseEntity<OcorrenciaExame> postOcorrencia(@RequestBody OcorrenciaExame newOcorrenciaExame) {
        return ResponseEntity.ok(repository.save(newOcorrenciaExame));
    }

    @DeleteMapping("/excluir/{id}")
    public void deleteRegiao(@PathVariable Long id) {
        service.delete(id);
    }
}
