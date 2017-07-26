package org.fkit.hrm.service;

import java.util.List;

import org.fkit.hrm.domain.User;
import org.fkit.hrm.domain.Bill;
import org.fkit.hrm.domain.Manager;
import org.fkit.hrm.domain.Product;
import org.fkit.hrm.util.tag.PageModel;
public interface HrmService {

	/**
	    *管理员登录
	    *@Param name
	    *@Param password
	    *@return Manager 对象
	    **/
	Manager login(String name,String password);
	   /**
	    *@根据ID查询管理员
	    *@param  id
	    *return  管理员对象
	    **/
	Manager findManagerById(Integer id);
	   /**
	    *获得所有用户
	    *@return Manager 对象的List集合
	    **/
	List<Manager> findManager(Manager manager,PageModel pageModel);
	   /**
	    *根据ID删除管理员
	    *@param ID
	    **/
	  void removeManagerById(Integer id);
	 /**
	    *添加管理员
	    *@param Manager用户对象
	    **/
	void addManager(Manager manager);
	 /**
	    *修改管理员
	    *@param Manager用户对象
	    **/
	void modifyManager(Manager manager);


//	-------------------------------------------------------------
	/**
	    *获得所有角色
	    *@return User对象的List集合
	    **/
	List<User>findUser(User user,PageModel pageModel);
	/**
	    *根据Id删除角色
	    *@param id
	    **/
 void removeUserById(Integer id);
	/**
	    *添加角色
	    *@param 　User角色对象
	    **/
//	void addUser(User user);
	/**
	    *根据id查询角色
	    *@param id 
	    *return 角色对象
	    **/
	User findUserById(Integer id);
	/**
	    *修改角色
	    *@param User对象
	    **/
	void modifyUser(User user);
	List<User> findAllUser();
//----------------------商品服务---------------------------
	//查询所有商品
	List<Product> findAllProduct();
	//动态添加商品
	void addProduct(Product product);
	//动态修改商品
	void modifyProduct(Product product);
	//根据pid删除商品
	  void removeProductById(Integer pid);
	//根据pid查询商品
	  Product findProductById(Integer pid);
//----------------------订单服务--------------------------------
	//查询所有订单
	  List<Bill> findAllBill();
	//动态修改商品
	void modifyBill(Bill bill);
	
	 Bill findBillById(Integer bid);
}