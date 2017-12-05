package net.hualisheng.www.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import net.hualisheng.www.bean.Categroy;
import net.hualisheng.www.dao.CategroyDao;

public class CategroyDaoImpl extends HibernateDaoSupport implements CategroyDao {
//private SessionFactory sessionFactory;
	
	/*public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Override
	public List<Categroy> getCategroys(DetachedCriteria detachedCriteria) {
		
		
	/*	Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Criteria criteria = detachedCriteria.getExecutableCriteria(session);
			List<Categroy> list = criteria.list();
			System.out.println("十几个突然回头你人家");
			System.out.println(list);
			
			transaction.commit();
			return list;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("出现异常:"+e.getMessage());
			
		}*/
		return (List<Categroy>) getHibernateTemplate().findByCriteria(detachedCriteria);
	}
	/*@Override
	public List<Categroy> getCategroys(DetachedCriteria detachedCriteria) {
		
		
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Criteria criteria = detachedCriteria.getExecutableCriteria(session);
			List<Categroy> list = criteria.list();
			System.out.println("十几个突然回头你人家");
			System.out.println(list);
			
			transaction.commit();
			return list;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("出现异常:"+e.getMessage());
			
		}
		return null;
	}*/
}
