package lib.model.cotas;

import javax.persistence.*;
import java.util.List;

@Entity
public class ModeloPeriodo {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String descricao;
    @OneToMany
    private List<Periodo> periodos;
    protected Double valor;
    protected Double valormensalidade;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValormensalidade() {
        return valormensalidade;
    }

    public void setValormensalidade(Double valormensalidade) {
        this.valormensalidade = valormensalidade;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
