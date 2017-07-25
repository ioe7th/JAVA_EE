package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collection;

public interface CollectionService {
	//查询数据库
	Collection SelectColect(Integer pid,Integer uid);
	//加入收藏夹
	void InsertCollection(Integer pid,Integer shop_price,
			String pname,Integer  uid,String image);
	//遍历输出
	List<Collection> selectAllcollect(Integer uid);
	//删除
    void removeCollection(Integer uid,Integer pid);
}
