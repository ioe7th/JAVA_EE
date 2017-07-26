package org.fkit.hrm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.hrm.dao.provider.ManagerDynaSqlProvider;
import org.fkit.hrm.domain.Manager;
import static org.fkit.hrm.util.common.HM.MANAGERTABLE;
public interface ManagerDao {
    // 根据用户名和密码查询管理员
@Select("select * from " +MANAGERTABLE+" where name =#{name} and password =#{password}")
Manager selectByNameAndPassword(
     @Param("name") String name,
     @Param("password") String password);
   //根据ID删除管理员
@Delete("delete from "+MANAGERTABLE+"where ID=#{id}")
void deleteById(Integer id);
  //根据id 查询用户
@Select("select * from "+MANAGERTABLE+" where ID=#{id}")
Manager selectById(Integer id);
//动态修改管理员信息
@SelectProvider(type=ManagerDynaSqlProvider.class,method="updateManager")
   void update(Manager manager);
//动态查询
@SelectProvider(type=ManagerDynaSqlProvider.class,method="selectWhitParam")
List<Manager> selectByPage(Map<String,Object> params);
//根据参数查询管理员人数
@SelectProvider(type=ManagerDynaSqlProvider.class,method="count")
Integer count (Map <String,Object> params);
//动态插入管理员
@SelectProvider(type=ManagerDynaSqlProvider.class,method="insertManager")
void save(Manager manager);

}
