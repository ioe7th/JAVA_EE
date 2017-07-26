package org.fkit.hrm.dao.provider;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import org.fkit.hrm.domain.Manager;


import static org.fkit.hrm.util.common.HM.MANAGERTABLE;

public class ManagerDynaSqlProvider {
	//分页动态查询
	 public String selectWhitParam(Map<String,Object> params){
	          String sql=new SQL(){
	                {
	                    SELECT("*");
	                    FROM(MANAGERTABLE);
	                       if(params.get("manager")!=null){
	                             Manager manager=(Manager)params.get("manager");
	                                  if(manager.getName()!=null && !manager.getName().equals("")){
	                                           WHERE("name LIKE CONCAT('%',#{manager.name},'%')");
	                                        }
	                                 if(manager.getPhone()!=null && ! manager.getPhone().equals("")){
	                                           WHERE("phone LIKE  CONCAT('%',#{manager.phone},'%')");
	                                   }
	                              }
	                    }
	               }.toString();
	               System.out.println(sql);
	               if(params.get("pageModel")!=null){
	                    sql+=" limit #{pageModel.firstLimitParam}, #{pageModel.pageSize}";
	               }
	               System.out.println(sql);
	               return sql;
	      }
	     //动态查询管理员总数量
	public String count (Map<String ,Object> params){
	      return new SQL(){
	        {
	          SELECT("count(*)");
	          FROM (MANAGERTABLE);
	 if(params.get("manager")!=null){
	                             Manager manager=(Manager)params.get("manager");
	                                  if(manager.getName()!=null && !manager.getName().equals("")){
	                                           WHERE("name LIKE CONCAT('%',#{manager.name},'%')");
	                                        }
	                                 if(manager.getPhone()!=null && ! manager.getPhone().equals("")){
	                                           WHERE("phone LIKE  CONCAT('%',#{manager.phone},'%')");
	                                   }
	                                 if(manager.getId()!=null && ! manager.getId().equals("")){
	                                           WHERE("id=#{manager.id}");
	                                   }
	                                
	                              }
	                    }
	               }.toString(); 
	     }
	//动态更新
	  public String updateManager(Manager manager){
			
			return new SQL(){
				{
					UPDATE(MANAGERTABLE);
					  if(manager.getName()!=null){
			               SET("name=#{name}");
			        }
			     
			      if(manager.getPassword()!=null){
			               SET("password=#{password}");
			        }
			      if(manager.getPhone()!=null){
			               SET("phone=#{phone}");
			        }
			     
	             WHERE ("id=#{id}");
			      }		      
			}.toString();
		}
	      
	//动态插入
	  public String  insertManager(Manager manager){
		  return new SQL(){
	               {
	                 INSERT_INTO(MANAGERTABLE);
	                 if(manager.getName()!=null && ! manager.getName().equals("")){
	                         VALUES("name","#{name}");
	                         System.out.println(manager.getName());
	                         System.out.println("ahsuiah");
	                    }
	                    if(manager.getPassword()!=null && ! manager.getPassword().equals("")){
	                         VALUES("password","#{password}");
	                    }
	                    if(manager.getPhone()!=null && ! manager.getPhone().equals("")){
	                         VALUES("phone","#{phone}");
	                    }

	               }

	          }.toString();
	          
	     }
	}
		
