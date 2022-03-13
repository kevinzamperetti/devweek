package com.dio_class.devweek.Repository;

import com.dio_class.devweek.Entity.OcorrenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaExameRepository extends JpaRepository<OcorrenciaExame, Long> {
}
