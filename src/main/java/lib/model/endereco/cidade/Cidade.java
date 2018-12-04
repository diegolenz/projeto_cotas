package lib.model.endereco.cidade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import lib.model.endereco.bairro.Bairro;
import lib.model.endereco.estado.Estado;
import lib.model.pessoa.Pessoa;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Collections;
import java.util.List;
@Entity
public class Cidade implements Comparable<Cidade>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(fetch = FetchType.LAZY)
    @Expose
    private Integer id;
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(nullable = false, length = 255)
    private String nome;
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "CODIGO_IBGE", length = 10)
    @JsonIgnore
    private String codigoIbge;
    @Column(length = 10)
    @Basic(fetch = FetchType.LAZY)
    @JsonIgnore
    private String cep;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cidade")
    @JsonIgnore
    private List<Bairro> bairroList;
    @ManyToOne
    private Estado estado;

    public Cidade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    @XmlTransient
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


   // @XmlTransient
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Bairro> getBairroList() {
        //Collections.sort(bairroList);
        return bairroList;
    }

    public void setBairroList(List<Bairro> bairroList) {
        this.bairroList = bairroList;
    }

    public String getNomeCompleto() {
        return nome + ", " + estado.getSigla();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Cidade other = (Cidade) obj;
        if (this.getId() == null || other.getId() == null) {
            return super.equals(obj);
        }

        return this.getId().equals(other.getId());

    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Cidade o) {
        return nome.compareTo(o.nome);
    }
}


