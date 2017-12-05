package net.hualisheng.www.services.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import net.hualisheng.www.bean.Categroy;
import net.hualisheng.www.bean.Product;
import net.hualisheng.www.dao.CategroyDao;
import net.hualisheng.www.services.CategroyService;
@Transactional
public class CategroyServiceImpl implements CategroyService {
	private CategroyDao dao;
	public void setDao(CategroyDao dao) {
		this.dao = dao;
	}
	@Override
	public List<Categroy> getCategroys() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Categroy.class);
		return dao.getCategroys(detachedCriteria);
		
	}
	@Override
	public List<Product> findByCid(String cid) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Product.class);
		detachedCriteria.add(Restrictions.eq("cid", cid));
		//dao.findByCid()
		return null;
	}

}
