package lib.model.cotas;

import lib.model.pessoa.Pessoa;

import javax.persistence.*;
import java.util.List;
@Entity
public class  PessoaCota extends Pessoa{
    @ManyToMany
    @JoinTable(name="pessoacota_cota", joinColumns=
            {@JoinColumn(name="pessoacota_id")}, inverseJoinColumns=
            {@JoinColumn(name="cota_id")})
    protected List<Cota> cotas;
    protected String Tipo_status;

    public String getTipo_status() {
        return Tipo_status;
    }

    public void setTipo_status(String tipo) {
        Tipo_status = tipo;
    }

    public List<Cota> getCotas() {
        return cotas;
    }

    public void setCotas(List<Cota> cotas) {
        this.cotas = cotas;
    }
}
