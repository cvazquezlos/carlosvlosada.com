package carlosvlosada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}