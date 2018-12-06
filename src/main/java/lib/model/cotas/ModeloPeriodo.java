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
}
