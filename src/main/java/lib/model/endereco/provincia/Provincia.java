package lib.model.endereco.provincia;

import lib.model.endereco.estado.Estado;
import lib.model.endereco.pais.Pais;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;
@Entity
public class Provincia {

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false, fetch = FetchType.LAZY)
        private Integer id;

        @Basic(optional = false, fetch = FetchType.LAZY)
        @NotEmpty
        @Size(min = 1, max = 255)
        private String descricao;

        @Basic(optional = false, fetch = FetchType.LAZY)
        @NotNull
        @Enumerated(EnumType.STRING)
        private Pais pais;

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "provincia", cascade = {CascadeType.DETACH, CascadeType.REFRESH})
        private List<Estado> estados;

        /**
         * Construtor padrão
         *
         * @author Cesar Both
         * @since 1.6.0
         */
        public Provincia() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public Pais getPais() {
            return pais;
        }

        public void setPais(Pais pais) {
            this.pais = pais;
        }

        @XmlTransient
        public List<Estado> getEstados() {
            return estados;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }

            Provincia other = (Provincia) obj;
            if (this.getId() == null || other.getId() == null) {
                return super.equals(obj);
            }

            return this.getId().equals(other.getId());

        }

        @Override
        public String toString() {
            return this.getDescricao();
        }
    }


