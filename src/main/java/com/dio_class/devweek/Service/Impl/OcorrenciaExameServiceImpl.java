package com.dio_class.devweek.Service.Impl;

import com.dio_class.devweek.Entity.OcorrenciaExame;
import com.dio_class.devweek.Repository.OcorrenciaExameRepository;
import com.dio_class.devweek.Service.OcorrenciaExameService;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaExameServiceImpl implements OcorrenciaExameService {

    public final OcorrenciaExameRepository repository;

    public OcorrenciaExameServiceImpl(OcorrenciaExameRepository repository) {
        this.repository = repository;
    }

    @Override
    public OcorrenciaExame findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ocorrência de Exame não encontrada!"));
    }

    @Override
    public void delete(Long id) {
        OcorrenciaExame ocorrenciaExame = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ocorrência de Exame não encontrada!"));
        repository.delete(ocorrenciaExame);
    }
}
