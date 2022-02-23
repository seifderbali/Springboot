package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Comment;


public interface ICommentService {
		List<Comment> retreiveAllComments();
		Comment addComment(Comment f);
		void deleteComment(long id);
		Comment updateComment(Comment f);
		Comment retrieveComment(long id);
}


