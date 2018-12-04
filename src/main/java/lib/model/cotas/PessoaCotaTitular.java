package lib.model.cotas;

import lib.model.pessoa.Pessoa;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class PessoaCotaTitular extends Pessoa {
    @OneToMany
    protected List<Cota> cotas;
    public List<Cota> getCotas() {
        return cotas;
    }

    public void setCotas(List<Cota> cotas) {
        this.cotas = cotas;
    }


}
