package lib.model.cotas;

import lib.model.apartamento.Apartamento;
import lib.model.pessoa.*;


import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
public class Cota {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private Integer id;
    @OneToMany
    private List<Periodo> periodos;
    @ManyToOne
    protected PessoaCotaTitular titular;
    @ManyToMany(mappedBy="cotas")
    protected List<Pessoa> integrantes;
    @ManyToOne
    protected Apartamento apartamento;
    protected Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    public PessoaCotaTitular getTitular() {
        return titular;
    }

    public void setTitular(PessoaCotaTitular titular) {
        this.titular = titular;
    }


    public List<Pessoa> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Pessoa> integrantes) {
        this.integrantes = integrantes;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
}
