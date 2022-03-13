package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Repository.FaixaEtariaRepository;
import com.dio_class.devweek.Service.FaixaEtariaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/faixa-etaria")
public class FaixaEtariaController {

    private final FaixaEtariaRepository repository;
    private final FaixaEtariaService service;

    public FaixaEtariaController(FaixaEtariaRepository repository, FaixaEtariaService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<FaixaEtaria>> findAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FaixaEtaria> getFaixaEtariaById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/novo")
    public ResponseEntity<FaixaEtaria> postFaixaEtaria(@RequestBody FaixaEtaria newFaixaEtaria) {
        return ResponseEntity.ok(repository.save(newFaixaEtaria));

    }

    @DeleteMapping("/excluir/{id}")
    public void deleteRegiao(@PathVariable Long id) {
        service.delete(id);
    }
}
