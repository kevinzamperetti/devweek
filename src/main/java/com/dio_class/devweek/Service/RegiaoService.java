package com.dio_class.devweek.Service;

import com.dio_class.devweek.Entity.Regiao;

public interface RegiaoService {

    Regiao findById(Long id);

    void delete(Long id);

}
