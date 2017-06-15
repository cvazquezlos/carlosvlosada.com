package carlosvlosada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carlosvlosada.model.Comment;
import carlosvlosada.model.Post;
import carlosvlosada.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;

	public void save(Comment comment) {
		commentRepository.save(comment);
	}
}