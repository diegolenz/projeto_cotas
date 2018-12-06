package lib.dao.imp.cotas;

import lib.dao.AbstractDao;
import lib.model.apartamento.Apartamento;
import lib.model.cotas.Cota;
import lib.model.cotas.Periodo;
import org.hibernate.HibernateException;

import java.util.List;

public class PeriodoCotaDao extends AbstractDao {
    @Override
    public Object carregar(int id) {
        Object p=new Object();
        p=em.find(Periodo.class, id);
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

        List <Periodo> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Periodo ").getResultList();
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
