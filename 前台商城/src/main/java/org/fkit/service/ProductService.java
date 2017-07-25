package org.fkit.service;

import java.util.List;

import org.fkit.domain.Product;

public interface ProductService {
  //遍历输出商品
	List<Product> selectProducts();
	//根据ID输出商品
	Product  selctProductbYId(Integer pid);
}
