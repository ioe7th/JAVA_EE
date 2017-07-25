package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Collection;
import org.fkit.mapper.BillMapper;
import org.fkit.mapper.CollectionMapper;
import org.fkit.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService{
	 @Autowired
	    private CollectionMapper collectionMapper;

	@Override
	public void InsertCollection(Integer pid, Integer shop_price, String pname, Integer uid, String image) {
		// TODO Auto-generated method stub
		collectionMapper.insertCollection(pid, shop_price, pname, uid, image);
	}

	@Override
	public Collection SelectColect(Integer pid,Integer uid) {
		// TODO Auto-generated method stub
		return collectionMapper.selectCollect(pid,uid);
	}

	@Override
	public List<Collection> selectAllcollect(Integer uid) {
		// TODO Auto-generated method stub
		return collectionMapper.selectAllCollect(uid);
	}

	@Override
	public void removeCollection(Integer uid, Integer pid) {
		// TODO Auto-generated method stub
		collectionMapper.removecollect(uid, pid);
	}
	
}
