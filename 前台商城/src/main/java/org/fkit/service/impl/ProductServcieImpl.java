package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Product;
import org.fkit.mapper.ProductMapper;
import org.fkit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("productService")
public class ProductServcieImpl implements ProductService {

	 @Autowired
	    private ProductMapper productMapper;
	@Override
	public List<Product> selectProducts() {
		// TODO Auto-generated method stub
		return productMapper.selctProducts();
	}
	@Override
	public Product selctProductbYId(Integer pid) {
		// TODO Auto-generated method stub
		return productMapper.selectById(pid);
	}

}
