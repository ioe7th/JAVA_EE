package org.fkit.hrm.dao;
import static org.fkit.hrm.util.common.HM.PRODUCTTABLE;


import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.hrm.dao.provider.ProductDynaSqlProvider;

import org.fkit.hrm.domain.Product;


public interface ProductDao {
	//查询所有商品
	@Select("select * from "+PRODUCTTABLE+" ")
 List<Product> selectAllProduct();
	//动态增加商品
@SelectProvider(type=ProductDynaSqlProvider.class,method="insertProduct")
void save(Product product);
//根据ID删除商品 
	@Delete("delete from tb_product where pid=#{pid}")
	     void deleteById(Integer pid);
//动态修改商品信息
	@SelectProvider(type=ProductDynaSqlProvider.class,method="updateProduct")
	   void update(Product product);
//动态查询
	@SelectProvider(type=ProductDynaSqlProvider.class,method="selectWhitParam")
	List<Product> selectByPage(Map<String,Object> params);
//根据参数查询商品数量
	@SelectProvider(type=ProductDynaSqlProvider.class,method="count")
	Integer count (Map <String,Object> params);
	//根据pid 查询商品
	@Select("select * from "+PRODUCTTABLE+" where pid=#{pid}")
	Product selectById(Integer pid);
}
