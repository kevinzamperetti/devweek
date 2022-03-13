package com.dio_class.devweek.Service;

import com.dio_class.devweek.Entity.OcorrenciaExame;

public interface OcorrenciaExameService {

    OcorrenciaExame findById(Long id);

    void delete(Long id);

}
