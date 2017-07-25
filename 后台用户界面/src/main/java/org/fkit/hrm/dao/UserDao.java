package org.fkit.hrm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.hrm.dao.provider.UserDynaSqlProvider;
import org.fkit.hrm.domain.User;
import static org.fkit.hrm.util.common.HM.USERTABLE;

public interface UserDao {
	 //动态查询
	@SelectProvider(type=UserDynaSqlProvider.class,method="selectWithParam")
  List<User> selectByPage(Map <String,Object> params);
	   //根据参数查询角色数量
@SelectProvider(type=UserDynaSqlProvider.class,method="count")
	    Integer count (Map <String,Object> params);
	//根据ID查询角色
@Select("select * from "+USERTABLE+" WHERE id=#{id}")
    User selectById(int id);
	   //查询所有角色
	@Select("select * from "+USERTABLE+" ")
	    List<User> selectAllUser();
	  //动态插入管理员
//	@SelectProvider(type=UserDynaSqlProvider.class,method="insertUser")
//	   void save(User user);
	//动态修改管理员信息
	    @SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
	        void update(User user);
	 //根据ID删除角色
	@Delete("delete from "+USERTABLE+"where id=#{id}")
	     void deleteById(Integer id);

}
