package lib.model.hotel;


import lib.model.apartamento.Apartamento;
import lib.model.bloco.Bloco;
import lib.model.pessoa.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hotel extends Pessoa {
    /**
     *
     */
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private Integer id;


    @OneToMany( cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Bloco> blocos;

    public Integer getId() {
        return id;
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Bloco> blocos) {
        this.blocos = blocos;
    }

    public void setId(Integer id) {

        this.id = id;
    }
}
