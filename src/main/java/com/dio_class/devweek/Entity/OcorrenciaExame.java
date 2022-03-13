package com.dio_class.devweek.Entity;

import javax.persistence.*;

@Entity
public class OcorrenciaExame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(name = "regiao_id")
    private Integer regiaoId;

    @Column
    private Integer mes;

    @Column(name = "faixa_id")
    private Integer faixaId;

    @Column(name = "qnt_exames")
    private Long qntExames;

    public OcorrenciaExame(Long id, Integer regiaoId, Integer mes, Integer faixaId, Long qntExames) {
        this.id = id;
        this.regiaoId = regiaoId;
        this.mes = mes;
        this.faixaId = faixaId;
        this.qntExames = qntExames;
    }

    public OcorrenciaExame() {
    }

    public Long getId() {
        return id;
    }

    public Integer getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getFaixaId() {
        return faixaId;
    }

    public void setFaixaId(Integer faixaId) {
        this.faixaId = faixaId;
    }

    public Long getQntExames() {
        return qntExames;
    }

    public void setQntExames(Long qntExames) {
        this.qntExames = qntExames;
    }
}
