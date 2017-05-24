package carlosvlosada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carlosvlosada.model.Post;
import carlosvlosada.model.User;
import carlosvlosada.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Post findByTitle(String title) {
		return postRepository.findByTitle(title);
	}

	public List<Post> findByWriter(User writer) {
		return postRepository.findByWriter(writer);
	}
}