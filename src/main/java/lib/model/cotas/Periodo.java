package lib.model.cotas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Periodo {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private Date dtcheckin;
    private Date dtcheckout;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrricao) {
        this.descricao = descrricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtcheckin() {
        return dtcheckin;
    }

    public void setDtcheckin(Date dtcheckin) {
        this.dtcheckin = dtcheckin;
    }

    public Date getDtcheckout() {
        return dtcheckout;
    }

    public void setDtcheckout(Date dtcheckout) {
        this.dtcheckout = dtcheckout;
    }
}
