package lib.dao.imp.cotas;

import lib.dao.AbstractDao;
import lib.model.apartamento.Apartamento;
import lib.model.cotas.Cota;
import org.hibernate.HibernateException;

import java.util.List;

public class CotasDao extends AbstractDao {
    @Override
    public Object carregar(int id) {
        Object p=new Object();
        p=em.find(Cota.class, id);
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

        List <Cota> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Cota ").getResultList();
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

    public List listarporapartamento(Apartamento obj) {

        List <Cota> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Cota where apartamento_id ="+ obj.getId()).getResultList();
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
