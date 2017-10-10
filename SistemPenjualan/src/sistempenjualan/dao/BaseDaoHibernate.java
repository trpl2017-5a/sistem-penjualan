/*
 * BaseDAOHibernate merupakan base class untuk DAO yang diintegrasikan dengan
 * library Hibernate untuk memudahkan koneksi dengan database
 * yang dibantu dengan framework Spring
 */
package sistempenjualan.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author altintop
 */
public class BaseDaoHibernate<T> {
    @SuppressWarnings ("unchecked")
    protected Class domainClass; //untuk generate class lain
    @Autowired 
    protected SessionFactory sessionFactory; //untuk memulai sesi hibernate
    
    @SuppressWarnings ("unchecked")
    public BaseDaoHibernate() {
        this.domainClass = (Class) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    public T save(T domain){
        sessionFactory.getCurrentSession().saveOrUpdate(domain);
        return domain;
    }
    @SuppressWarnings ("unchecked")
    public T getById(Long id){
        return (T) sessionFactory.getCurrentSession().get(domainClass, id);
    }
    public T delete(T domain){
        sessionFactory.getCurrentSession().delete(domain);
        return domain;
    }
    public Long count(){
        List list = sessionFactory.getCurrentSession().createQuery(
          "select count(*) from "+domainClass.getName()+" x").list();
        Long count = (Long) list.get(0);
        return count;
    }
    public List<T> getAll(){
        return sessionFactory.getCurrentSession().createSQLQuery("from "+domainClass.getName()).list();
    }
    public List<T> getAll(int start, int banyaknya){
        return sessionFactory.getCurrentSession().createSQLQuery("from "+domainClass.getName()).setFirstResult(start).setMaxResults(banyaknya).list();
    }
}
