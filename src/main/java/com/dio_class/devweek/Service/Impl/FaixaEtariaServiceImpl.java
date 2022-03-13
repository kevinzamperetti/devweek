package com.dio_class.devweek.Service.Impl;

import com.dio_class.devweek.Entity.FaixaEtaria;
import com.dio_class.devweek.Repository.FaixaEtariaRepository;
import com.dio_class.devweek.Service.FaixaEtariaService;
import org.springframework.stereotype.Service;

@Service
public class FaixaEtariaServiceImpl implements FaixaEtariaService {

    public final FaixaEtariaRepository repository;

    public FaixaEtariaServiceImpl(FaixaEtariaRepository repository) {
        this.repository = repository;
    }

    @Override
    public FaixaEtaria findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Faixa Etaria não encontrada!"));
    }

    @Override
    public void delete(Long id) {
        FaixaEtaria faixaEtaria = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Faixa Etaria não encontrada!"));
        repository.delete(faixaEtaria);
    }
}
