package lib.model.pessoa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sun.istack.internal.NotNull;
import lib.model.cotas.Cota;
import lib.model.endereco.Endereco;
import lib.model.pessoa.TipoPessoa;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;




@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class Pessoa {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Basic(fetch = FetchType.LAZY)
    private String nome;


    @Basic(fetch = FetchType.LAZY)
    private String razaoSocial;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.LAZY)
    private TipoPessoa tipo;

    @Basic(fetch = FetchType.LAZY)
    private String cpfCnpj;

    @Basic(fetch = FetchType.LAZY)
    private String rgIe;

    @Temporal(TemporalType.DATE)
    @Basic(fetch = FetchType.LAZY)
    private Date dataNascimento;


    @Basic(fetch = FetchType.LAZY)
    private String profissao;

    @Basic(fetch = FetchType.LAZY)
    private String localTrabalho;

    @Basic(fetch = FetchType.LAZY)
    private String nomeMae;

    @Basic(fetch = FetchType.LAZY)
    private String nomePai;

    @Basic(fetch = FetchType.LAZY)
    private String nomeConjuge;


    @Basic(fetch = FetchType.LAZY)
    private Double valorSalario;

    @Basic(fetch = FetchType.LAZY)
    private String observacoesAdicionais;


    @Basic(fetch = FetchType.LAZY)
    @ManyToMany
    private List<Endereco> enderecos;

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa  tipo) {

        this.tipo = tipo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeConjuge() {
        return nomeConjuge;
    }

    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public String getObservacoesAdicionais() {
        return observacoesAdicionais;
    }

    public void setObservacoesAdicionais(String observacoesAdicionais) {
        this.observacoesAdicionais = observacoesAdicionais;
    }


}

