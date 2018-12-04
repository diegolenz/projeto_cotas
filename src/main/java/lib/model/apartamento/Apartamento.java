package lib.model.apartamento;



import javax.persistence.*;
import java.util.List;

import lib.model.bloco.Bloco;
import lib.model.cotas.Cota;
import lib.model.hotel.Hotel;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Apartamento {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private Integer id;
  //  @javax.validation.constraints.NotEmpty
    @Column(
            length = 255
    )
    @Basic(
            fetch = FetchType.LAZY
    )
    private Integer numero;
    @ManyToOne
    private Bloco bloco;


    @OneToMany
    private List<Cota> cotas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<Cota> getCotas() {
        return cotas;
    }

    public void setCotas(List<Cota> cotas) {
        this.cotas = cotas;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }
}
