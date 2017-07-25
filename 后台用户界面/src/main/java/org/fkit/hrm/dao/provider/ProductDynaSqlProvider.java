package org.fkit.hrm.dao.provider;

import static org.fkit.hrm.util.common.HM.MANAGERTABLE;
import static org.fkit.hrm.util.common.HM.PRODUCTTABLE;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import org.fkit.hrm.domain.Manager;
import org.fkit.hrm.domain.Product;

public class ProductDynaSqlProvider {
	//分页动态查询
		 public String selectWhitParam(Map<String,Object> params){
		          String sql=new SQL(){
		                {
		                    SELECT("*");
		                    FROM(PRODUCTTABLE);
		                       if(params.get("product")!=null){
		                             Product product=(Product)params.get("product");
		                                  if(product.getPname()!=null && !product.getPname().equals("")){
		                                           WHERE("pname LIKE CONCAT('%',#{product.pname},'%')");
		                                        }
		                                 if(product.getPid()!=null && ! product.getPid().equals("")){
		                                           WHERE("pid LIKE  CONCAT('%',#{product.pid},'%')");
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
			          FROM (PRODUCTTABLE);
			 if(params.get("product")!=null){
			                             Product product=(Product)params.get("product");
			                                  if(product.getInventory()!=null && !product.getInventory().equals("")){
			                                           WHERE("inventory");
			                                        }
			                                 if(product.getPid()!=null && ! product.getPid().equals("")){
			                                           WHERE("pid LIKE  CONCAT('%',#{product.pid},'%')");
			                                   }
			                                 if(product.getPname()!=null && ! product.getPname().equals("")){
			                                           WHERE("pname=#{product.pname}");
			                                   }
			                                
			                              }
			                    }
			               }.toString(); 
			     }
			//动态更新
			  public String updateProduct(Product product){
					
					return new SQL(){
						{
							UPDATE(PRODUCTTABLE);
							  if(product.getPname()!=null){
					               SET("pname=#{pname}");
					        }
					     
					      if(product.getShop_price()!=null){
					               SET("shop_price=#{shop_price}");
					        }
					      if(product.getInventory()!=null){
					               SET("inventory=#{inventory}");
					        }
					      if(product.getSaleamount()!=null){
				               SET("saleamount=#{saleamount}");
				        }
			             WHERE ("pid=#{pid}");
					      }		      
					}.toString();
				}
			//动态插入
			  public String  insertProduct(Product product){
				  return new SQL(){
			               {
			                 INSERT_INTO(PRODUCTTABLE);
			                 if(product.getPname()!=null && ! product.getPname().equals("")){
			                         VALUES("pname","#{pname}");
			                    }
			                    if(product.getShop_price()!=null && ! product.getShop_price().equals("")){
			                         VALUES("shop_price","#{shop_price}");
			                    }
			                    if(product.getInventory()!=null && ! product.getInventory().equals("")){
			                         VALUES("inventory","#{inventory}");
			                    }
			               }

			          }.toString();
			          
			     }

}
