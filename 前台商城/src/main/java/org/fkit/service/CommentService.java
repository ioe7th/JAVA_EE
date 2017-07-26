package org.fkit.service;

import java.util.List;

import org.fkit.domain.Comment;

public interface CommentService {
   void insertComment(String tra,String pro,String ser,String comment,String path,String pno);
   List<Comment> SelectALL();
}
