package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Like;

public interface ILikeService {
	List<Like> retreiveAllLikes();
	Like addLike(Like f);
	void deleteLike(long id);
	Like updateLike(Like f);
	Like retrieveLike(long id);


}
