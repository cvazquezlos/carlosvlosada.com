package carlosvlosada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}