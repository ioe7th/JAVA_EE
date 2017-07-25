package org.fkit.hrm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fkit.hrm.dao.UserDao;
import org.fkit.hrm.dao.ManagerDao;
import org.fkit.hrm.dao.ProductDao;
import org.fkit.hrm.domain.User;
import org.fkit.hrm.domain.Manager;
import org.fkit.hrm.domain.Product;
import org.fkit.hrm.service.HrmService;
import org.fkit.hrm.util.tag.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("hrmService")
public class HrmServiceImpl implements HrmService{

    //自动注入持久层DAO对象
    @Autowired
    private ManagerDao managerDao;
    @Autowired
    private UserDao  userDao;
    @Autowired 
    private ProductDao productDao;
    /******************用户服务接口实现***************************/
     /**hrmServiceImpl接口login方法实现
     *@see{hrmService}
     **/
    @Transactional(readOnly=true)
   @Override
  public Manager login(String name, String password){
      return managerDao.selectByNameAndPassword(name,password);
  }
    /**hrmServiceImpl接口findManager方法实现
     *@see{hrmService}
     **/
   @Transactional(readOnly=true)
   @Override
     public List<Manager> findManager(Manager manager,PageModel pageModel){
      //当前需要分页的总数据条数
      Map<String,Object> params=new HashMap<>();
      params.put("Manager",manager);
      int recordCount =managerDao.count(params);

     pageModel.setRecordCount(recordCount);
     if(recordCount>0){
          //开始分页查询数据，查询第几页数据
          params.put("pageModel",pageModel);
      }
      List<Manager> managers=managerDao.selectByPage(params);
      return managers;
   }
    /**hrmServiceImpl接口findManagerByID方法实现
     *@see{hrmService}
     **/
   @Transactional(readOnly=true)
   @Override
    public Manager findManagerById(Integer id){
           return managerDao.selectById(id);
          }
    /**hrmServiceImpl接口removeManagerByID方法实现
     *@see{hrmService}
     **/
      @Override
    public void removeManagerById(Integer id){
           managerDao.deleteById(id);
    }
    /**hrmServiceImpl接口addManageer方法实现
     *@see{hrmService}
     **/
   @Override
   public void addManager(Manager manager){
          managerDao.save(manager);
   }
    /**hrmServiceImpl接口modifyManageer方法实现
     *@see{hrmService}
     **/
   @Override
   public void modifyManager(Manager manager){
          managerDao.update(manager);
   }
   /*******************用户服务接口实现************************************/
   @Override
   @Transactional(readOnly=true)
   
   public List<User> findAllUser(){
          return userDao.selectAllUser();
          }
   
     /**hrmServiceImpl接口findUser方法实现
     *@see{hrmService}
     **/
   @Transactional(readOnly=true)
   @Override
      public List<User> findUser(User user,PageModel pageModel){
      //当前需要分页的总数据条数
      Map<String,Object> params=new HashMap(){};
      params.put("User",user);
      int recordCount =userDao.count(params);

     pageModel.setRecordCount(recordCount);
     if(recordCount>0){
          //开始分页查询数据，查询第几页数据
          params.put("pageModel",pageModel);
      }
      List<User> users=userDao.selectByPage(params);
      return users;
   }
    /**hrmServiceImpl接口removeUserById方法实现
     *@see{hrmService}
     **/
     @Override
    public void removeUserById(Integer id){
        userDao.deleteById(id);
   }
     /**hrmServiceImpl接口findUserByID方法实现
     *@see{hrmService}
     **/
   @Transactional(readOnly=true)
   @Override
    public User findUserById(Integer id){
           return userDao.selectById(id);
          }
  /**hrmServiceImpl接口addUser方法实现
     *@see{hrmService}
     **/
//   @Override
//   public void addUser(User user){
//         userDao.save(user);
//   }
    /**hrmServiceImpl接口modifyUser方法实现
     *@see{hrmService}
     **/
   @Override
   public void modifyUser(User user){
         userDao.update(user);
   }
   /*******************商品管理接口实现************************************/
	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return productDao.selectAllProduct();
	}
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
	}
	@Override
	public void modifyProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}
	@Override
	public void removeProductById(Integer pid) {
		// TODO Auto-generated method stub
		productDao.deleteById(pid);
	}
	@Override
	public Product findProductById(Integer pid) {
		// TODO Auto-generated method stub
		return productDao.selectById(pid);
	}


	
}
