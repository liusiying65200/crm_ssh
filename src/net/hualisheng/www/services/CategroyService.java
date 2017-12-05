package net.hualisheng.www.services;

import java.util.List;

import net.hualisheng.www.bean.Categroy;
import net.hualisheng.www.bean.Product;

public interface CategroyService {

	List<Categroy> getCategroys();

	List<Product> findByCid(String cid);

}
