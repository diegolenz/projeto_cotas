package lib.dao.imp.endereco.estado;

import lib.dao.AbstractDao;
import lib.model.endereco.estado.Estado;
import lib.model.endereco.pais.Pais;
import lib.model.hotel.Hotel;
import org.hibernate.HibernateException;

import java.util.List;

public class EstadoDao extends AbstractDao {
    public void Inserir(Object obj) throws Exception {
        super.Inserir(obj);
    }

    @Override
    public Object carregar(int id) {
        Object p=new Object();
        p=em.find(Estado.class, id);
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

        List <Estado> list = null;
        try {
            em.getTransaction().begin();
            list= em.createQuery
                    ("from Estado ").getResultList();
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

    public List<Estado> getByPais(Pais pais ) {

        List <Estado> list = null;
        //Estado estado=new Estado();
        try {
            em.getTransaction().begin();
            list=  em.createQuery
                    ("select e FROM Estado e where  e.pais  like UPPER ('"+pais.name()+"') ").getResultList();
            em.getTransaction().commit();

            return list;
           // FROM Estado WHERE Estado.pais ILIKE  '"+ pais.name() +"' ORDER BY estado.nome ").getResultList()
        } catch ( HibernateException e ) {
            if ( em.getTransaction() != null )
                em.getTransaction().rollback();
            return null;
        } finally {
            //  em.close();
        }
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
