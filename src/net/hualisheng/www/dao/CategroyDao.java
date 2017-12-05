package net.hualisheng.www.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import net.hualisheng.www.bean.Categroy;

public interface CategroyDao {

	List<Categroy> getCategroys(DetachedCriteria detachedCriteria);

}
