package lib.dao.imp.apartamento;

import java.util.List;
import lib.model.apartamento.Apartamento;
import lib.dao.AbstractDao;
import lib.model.bloco.Bloco;
import org.hibernate.HibernateException;

public class ApartamentoDao extends AbstractDao<Apartamento> {
    @Override
    public void Inserir(Object obj) throws Exception {
        super.Inserir(obj);
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
    public Object carregar(int id) {
        Object p=new Object();
        p=em.find(Apartamento.class, id);
        return p;

    }

    @Override
    public List listar() {

        List <Bloco> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Apartamento ").getResultList();
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

    public List listarporbloco(Bloco bloco) {

        List <Apartamento> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Apartamento where bloco_id = " + bloco.getId()).getResultList();
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
}

