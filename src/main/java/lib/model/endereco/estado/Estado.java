package lib.model.endereco.estado;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;


import lib.model.endereco.cidade.Cidade;
import lib.model.endereco.pais.Pais;
import lib.model.endereco.provincia.Provincia;

import java.util.Collections;
import java.util.List;

@Entity
public  class Estado implements Comparable<Estado> {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(fetch = FetchType.LAZY)
        private Integer id;

        @Basic(fetch = FetchType.LAZY, optional = false)
        @Column(nullable = false, length = 99)
        private String nome;

        @Basic(fetch = FetchType.LAZY)
        @Column(length = 3)
        private String sigla;

        @Basic(fetch = FetchType.LAZY)
        @Column(name = "CODIGO_IBGE")
        private Integer codigoIbge;

        @Basic(fetch = FetchType.LAZY)
        @Enumerated(EnumType.STRING)
        private Pais pais;

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
        private List<Cidade> cidadeList;

        @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.REFRESH})
      //  @JoinColumn(name = "provincia", referencedColumnName = "id", nullable = false)
        private Provincia provincia;

    public Estado() {
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @XmlTransient
    public Integer getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Integer codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public List<Cidade> getCidadeList() {
        Collections.sort(cidadeList);
        return cidadeList;
    }

    public void setCidadeList(List<Cidade> cidadeList) {
        this.cidadeList = cidadeList;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }

        Estado other = (Estado) obj;
        if (this.getId() == null || other.getId() == null) {
            return super.equals(obj);
        }

        return this.getId().equals(other.getId());

    }

    @Override
    public String toString() {
        return nome;
    }


    @Override
    public int compareTo(Estado o) {
        return nome.compareTo(o.nome);
    }
}
