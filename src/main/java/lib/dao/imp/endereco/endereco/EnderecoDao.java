package lib.dao.imp.endereco.endereco;

import lib.dao.AbstractDao;
import lib.model.endereco.Endereco;
import lib.model.endereco.pais.Pais;
import lib.model.hotel.Hotel;
import org.hibernate.HibernateException;

import java.util.List;

public class EnderecoDao  extends AbstractDao {
    public void Inserir(Object obj) throws Exception {
        super.Inserir(obj);
    }

    @Override
    public Object carregar(int id) {
        Object p=new Object();
        p=em.find(Endereco.class, id);
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

        List <Endereco> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Endereco ").getResultList();
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
