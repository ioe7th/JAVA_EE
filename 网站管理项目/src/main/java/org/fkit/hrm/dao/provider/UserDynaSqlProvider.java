package org.fkit.hrm.dao.provider;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import org.fkit.hrm.domain.User;
import static org.fkit.hrm.util.common.HM.USERTABLE;
public class UserDynaSqlProvider {
	
	//分页动态查询
    public String selectWithParam(Map<String,Object> params){
             String sql=new SQL(){
                   {
                       SELECT("*");
                       FROM(USERTABLE);
                          if(params.get("user")!=null){
                                
                                     User user=(User)params.get("user");
                                     System.out.println("输出到这里了");
                                     if(user.getUsername()!=null && !user.getUsername().equals("")){
                                              WHERE("username LIKE CONCAT('%',#{user.username},'%')");
                                           }
                                    if(user.getEmail()!=null && ! user.getEmail().equals("")){
                                              WHERE("email LIKE  CONCAT('%',#{user.email},'%')");
                                      }
                                    if(user.getId()!=null && ! user.getId().equals("")){
                                              WHERE("id=#{user.id}");
                                      }
                                    if(user.getNickname()!=null && ! user.getNickname().equals("")){
                                    	  WHERE("nickname=#{user.nickname}");
                                    }if(user.getPassword()!=null && ! user.getPassword().equals("")){
                                    	WHERE("password=#{user.password}");
                                    }
                                 }
                       }
                  }.toString();
                  if(params.get("pageModel")!=null){
                       sql+="limit #{pageModol.firstLimitParam},#{pageModel.pageSize}";
                  }
                  return sql;
         }
        //动态查询用户数量
   public String count (Map<String ,Object> params){
         return new SQL(){
           {
             SELECT("count(*)");
             FROM (USERTABLE);
    if(params.get("user")!=null){
                             User user=(User)params.get("user");
                               
                                     if(user.getUsername()!=null && !user.getUsername().equals("")){
                                              WHERE("username LIKE CONCAT('%',#{user.username},'%')");
                                           }
                                    if(user.getEmail()!=null && ! user.getEmail().equals("")){
                                              WHERE("email LIKE  CONCAT('%',#{user.email},'%')");
                                      }
                                    if(user.getId()!=null && ! user.getId().equals("")){
                                              WHERE("id=#{user.id}");
                                      }
                                 }
                       }
                  }.toString();

        }
   //动态更新
     public String updateUser(User user){

            return new SQL(){
                {
                     UPDATE(USERTABLE);
                       if(user.getUsername()!=null){
                           SET("username=#{username}");
                    }
                  if(user.getEmail()!=null){
                           SET("email=#{email}");
                  }
                  if(user.getPassword()!=null){
                      SET("password=#{password}");
             }
                  if(user.getTelphone()!=null){
                      SET("telphone=#{telphone}");
             }
                  if(user.getNickname()!=null){
                      SET("nickname=#{nickname}");
             }
                WHERE ("id=#{id}");
                } 
            }.toString();
       }

   //动态插入
     public String  insertuser(User user){
         return new SQL(){
                  {
                    INSERT_INTO(USERTABLE);
                    if(user.getUsername()!=null && user.getUsername().equals("")){
                            VALUES("name","#{name}");
                       }if(user.getEmail()!=null && ! user.getEmail().equals("")){
                    	   VALUES("email","#{email}");
                       }if(user.getTelphone()!=null && ! user.getTelphone().equals("")){
                    	   VALUES("telphone","#{telphone}");
                       }if(user.getNickname()!=null && ! user.getNickname().equals("")){
                    	   VALUES("nickname","#{nickname}"); 
                       }if(user.getPassword()!=null  &&!user.getPassword().equals("")){
                    	   VALUES("password","#{password}");
                          }
                        }
             }.toString();
        }

	}


