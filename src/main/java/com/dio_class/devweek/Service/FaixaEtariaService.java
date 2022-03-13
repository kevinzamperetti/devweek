package com.dio_class.devweek.Service;

import com.dio_class.devweek.Entity.FaixaEtaria;

public interface FaixaEtariaService {

    FaixaEtaria findById(Long id);

    void delete(Long id);

}
