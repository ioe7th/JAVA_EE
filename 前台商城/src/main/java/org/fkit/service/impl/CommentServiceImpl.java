package org.fkit.service.impl;

import org.fkit.service.CommentService;

import java.util.List;

import org.fkit.domain.Comment;
import org.fkit.mapper.CommentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	 @Autowired
	    private CommentMapper commentMapper;
	@Override
	public void insertComment(String tra, String pro, String ser, String comment,String path, String pno) {
		// TODO Auto-generated method stub
		commentMapper.insertcomment(tra, pro, ser, comment, path,pno);

	}
	@Override
	public List<Comment> SelectALL() {
		// TODO Auto-generated method stub
		return commentMapper.selctAll();
	}


}
