package lib.dao.imp.cotas;

import lib.dao.AbstractDao;
import lib.model.cotas.ModeloPeriodo;
import org.hibernate.HibernateException;

import java.util.List;

public class ModeloPeriodoDao extends AbstractDao {
    @Override
    public Object carregar(int id) {
        Object p=new Object();
        if (!em.getTransaction().isActive()){
            em.getTransaction().begin();
        }
        p=em.find(ModeloPeriodo.class, id);
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

        List <ModeloPeriodo> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from ModeloPeriodo ").getResultList();
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



}
