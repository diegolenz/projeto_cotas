package lib.dao.imp.pessoa;

import lib.dao.AbstractDao;
import lib.model.pessoa.Pessoa;
import org.hibernate.HibernateException;

import java.sql.ResultSet;
import java.util.List;

public class PessoaDao extends AbstractDao {
    public void Inserir(Object obj) throws Exception {
        super.Inserir(obj);

    }

    @Override
    public Object carregar(int id) {
            Object p=new Object();
            p=em.find(Pessoa.class, id);
            return p;

    }

    @Override
    public void Alterar(Object obj) throws Exception {
        super.Alterar(obj);
    }

    @Override
    public void rollBack() {
        super.rollBack();
    }

    @Override
    public void Deletar(Object obj) throws Exception {
        super.Deletar(obj);
    }

    @Override
    public List listar( ) {

            List <Pessoa> list = null;
            try {
                em.getTransaction().begin();
                list= em.createQuery
                        ("from Pessoa ").getResultList();
                em.getTransaction().commit();

                return list;

            } catch ( HibernateException e ) {
                if ( em.getTransaction() != null )
                    em.getTransaction().rollback();
            } finally {
                 //  em.close();
            }
            return list;

        }
    public List<Pessoa> getByCpfCnpjExato(String cpfCnpj) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }

        List<Pessoa> obj= em.createQuery
                ("from Pessoa where cpfcnpj = '" + cpfCnpj +"'").getResultList();
        return obj;

}



    @Override
    public Object listar(Class clazz, String pk) {
        return super.listar(clazz, pk);
    }

    @Override
    public void closeConnection() {
        super.closeConnection();
    }

    @Override
    public void beginTransaction() throws Exception {
        super.beginTransaction();
    }
}
