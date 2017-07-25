package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from tb_user where username = #{username} and password = #{password}")
	User findWithLoginnameAndPassword(@Param("username")String username,
			@Param("password") String password);
	@Insert("insert into tb_user(username,nickname,telphone,email,password) values(#{username},#{nickname},#{telphone},#{email},#{password})")
	void insertInformation( @Param("username")String username,
   		 @Param("nickname")String nickname, 
   		  @Param("telphone")String telphone,
   		  @Param("email")String email,
   		  @Param("password")String password);
	
	//修改密码
	@Update("update tb_user"
			+ " set password=#{latter} where username =#{username}")
	    void updatePassword(@Param("latter") String latter,
	    		   @Param("username") String username);

	//找回密码
	@Select("select password from tb_user where username=#{username} and email=#{email}")
	String findpwd(@Param("username") String username,
			 @Param("email") String email);
	
	
}

