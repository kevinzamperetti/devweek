package com.dio_class.devweek.Controller;

import com.dio_class.devweek.Entity.Regiao;
import com.dio_class.devweek.Repository.RegiaoRepository;
import com.dio_class.devweek.Service.RegiaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regiao")
public class RegiaoController {

    private final RegiaoRepository repository;
    private final RegiaoService service;

    public RegiaoController(RegiaoRepository repository, RegiaoService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Regiao>> getRegiao() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Regiao> getRegiaoById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/novo")
    public ResponseEntity<Regiao> postRegiao(@RequestBody Regiao newRegiao) {
        return ResponseEntity.ok(repository.save(newRegiao));
    }

    @DeleteMapping("/excluir/{id}")
    public void deleteRegiao(@PathVariable Long id) {
        service.delete(id);
    }
}
