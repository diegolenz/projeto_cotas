package lib.dao.imp.cotas;

import lib.dao.AbstractDao;
import lib.model.cotas.PessoaCota;
import org.hibernate.HibernateException;

import java.util.List;

public class PessoaCotaDao extends AbstractDao {

        public void Inserir(Object obj) throws Exception {
            super.Inserir(obj);
        }

        @Override
        public Object carregar(int id) {
            Object p=new Object();
            p=em.find(PessoaCota.class, id);
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

            List <PessoaCota> list = null;
            try {
                em.getTransaction().begin();
                list= em.createQuery
                        ("from PessoaCota ").getResultList();
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
