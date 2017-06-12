package carlosvlosada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import carlosvlosada.model.Post;
import carlosvlosada.model.User;
import carlosvlosada.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public List<Post> findAll() {
		return postRepository.findAll();
	}

	public Page<Post> findAll(int page) {
		return postRepository.findAll(new PageRequest(page, 3));
	}

	public Post findByTitle(String title) {
		return postRepository.findByTitle(title);
	}

	public List<Post> findByWriter(User writer) {
		return postRepository.findByWriter(writer);
	}

	public Post findOne(Integer id) {
		return postRepository.findOne(id);
	}

	public void save(Post post) {
		postRepository.save(post);
	}
}