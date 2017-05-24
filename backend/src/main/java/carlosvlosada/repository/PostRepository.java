package carlosvlosada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import carlosvlosada.model.Post;
import carlosvlosada.model.User;

public interface PostRepository extends JpaRepository<Post, Integer> {

	Post findByTitle(String title);

	List<Post> findByWriter(User writer);
}