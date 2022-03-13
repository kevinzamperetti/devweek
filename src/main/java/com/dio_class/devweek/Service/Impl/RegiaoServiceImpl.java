package com.dio_class.devweek.Service.Impl;

import com.dio_class.devweek.Entity.Regiao;
import com.dio_class.devweek.Repository.RegiaoRepository;
import com.dio_class.devweek.Service.RegiaoService;
import org.springframework.stereotype.Service;

@Service
public class RegiaoServiceImpl implements RegiaoService {

    public final RegiaoRepository repository;

    public RegiaoServiceImpl(RegiaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Regiao findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Região não encontrada!"));
    }

    @Override
    public void delete(Long id) {
        Regiao regiao = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Região não encontrada!"));
        repository.delete(regiao);
    }
}
