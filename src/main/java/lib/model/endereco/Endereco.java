package lib.model.endereco;

import lib.model.cotas.PessoaCota;
import lib.model.endereco.bairro.Bairro;
import lib.model.pessoa.Pessoa;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(fetch = FetchType.LAZY)
    private Integer id;
/*
    public Pessoa getPessoas() {
        return pessoa;
    }

    public void setPessoas(Pessoa pessoas) {
        this.pessoa = pessoas;
    } */


    @NotNull
    @ManyToOne
    @Basic(fetch = FetchType.LAZY)
    private Bairro bairro;

    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(nullable = false, length = 255)
    @Length(min = 5, max = 255)
    private String logradouro;

    @Basic(fetch = FetchType.LAZY)
    private Integer numero;

    @Column(length = 255)
    @Basic(fetch = FetchType.LAZY)
    private String complemento;

    @Column(length = 255)
    @Basic(fetch = FetchType.LAZY)
    private String referencia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
