package carlosvlosada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.Comment;
import carlosvlosada.model.Post;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	List<Comment> findByPost(Post post);
}