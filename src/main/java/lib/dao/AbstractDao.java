package lib.dao;

import javax.persistence.*;

import lib.dao.handler.AbstractDaoEventHandler;
import util.JpaUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AbstractDao<T>   {


    protected static EntityManager em;


    public static void estanciaem() {

         em = new JpaUtil().getEM();

    }


    public Object carregar(int id) {
       return null;
    }

    public void Inserir( Object obj ) throws Exception {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        //em.close();
    }
    public void Alterar( Object obj ) throws Exception {
    }
    public void Deletar( Object obj ) throws Exception {
            try {

                em.getTransaction().begin();
                em.remove(obj);
                em.flush();
                em.getTransaction().commit();
             //   em.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                em.getTransaction().rollback();
            }
        }

    public List listar()
    {
        return null;
    }
    public Object listar(Class clazz, String pk)
    {
        return null;
    }
    public void rollBack()
    {
        em.getTransaction().rollback();
    //    em.close();
    }
    public void closeConnection()
    {


    }
    public void beginTransaction() throws Exception {
        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
    }


    private Query buildQuery(String namedQuery, Map<String, Object> parameters) {
        // Instancia objeto
        final Query query = em.createNamedQuery(namedQuery);

        // Configura parametros
        parameters.entrySet().stream().forEach((entry) -> {
            query.setParameter(entry.getKey(), entry.getValue());
        });

        return (query);
    }


    @Deprecated
    protected List<T> findAll(String namedQuery, Map<String, Object> parameters) {
        return this.findAll(namedQuery, parameters, null);
    }

    @Deprecated
    protected List<T> findAll(String namedQuery, Map<String, Object> parameters, Integer limit) {

        if (AbstractDaoEventHandler.isNextQueryCallbackQueued()) {

            AbstractDaoEventHandler.Callback callback = AbstractDaoEventHandler.getNextQueryCallback();
            if (callback.getMaxResults() != null) {
                Query query = this.buildQuery(namedQuery, parameters);

                query.setMaxResults(callback.getMaxResults() + 1);
                List results = query.getResultList();

                callback.handleQuery(namedQuery, results.size() > callback.getMaxResults(), results);

                if (!callback.isQueryToDbAllowed()) return new ArrayList<>();
                else return results;
            }
        }

        Query query = this.buildQuery(namedQuery, parameters);

        if (limit != null && limit > 0) {
            query.setMaxResults(limit);
        }

        return query.getResultList();
    }

    protected List<T> findAll(String namedQuery) {
        return this.findAll(namedQuery, new HashMap<>(), -1);
    }

    protected List<T> findAll(String namedQuery, Integer limit) {
        return this.findAll(namedQuery, new HashMap<>(), limit);
    }
    @Deprecated
    protected T findFirst(String namedQuery, Map<String, Object> parameters) {

        if (AbstractDaoEventHandler.isNextQueryCallbackQueued()) AbstractDaoEventHandler.ignore();

        try {
            return (T) this.buildQuery(namedQuery, parameters).getSingleResult();
        } catch (NonUniqueResultException ex) {
            return findAll(namedQuery, parameters, 1).get(0);
        } catch (NoResultException ex) {
            return null;
        } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}