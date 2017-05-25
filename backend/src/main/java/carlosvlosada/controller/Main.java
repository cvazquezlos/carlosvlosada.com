package carlosvlosada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import carlosvlosada.model.Comment;
import carlosvlosada.model.Item;
import carlosvlosada.model.Post;
import carlosvlosada.service.CommentService;
import carlosvlosada.service.ItemService;
import carlosvlosada.service.PostService;
import carlosvlosada.service.UserService;

@Controller
public class Main {

	@Autowired
	private CommentService commentService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private PostService postService;
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index(Model model) {

		List<Item> portfolio = itemService.findAll();
		model.addAttribute("portfolio", portfolio);
		List<Post> blogContent = postService.findAll();
		model.addAttribute("blog", blogContent);

		return "index";
	}
	
	@RequestMapping("/{id}")
	public String work(Model model, @PathVariable Integer id) {
		
		return "work";
	}

	@RequestMapping("/blog")
	public String blog(Model model) {

		List<Post> blogContent = postService.findAll();
		model.addAttribute("posts", blogContent);

		return "blog";
	}

	@RequestMapping("/blog/{id}")
	public String post(Model model, @PathVariable Integer id) {

		Post selected = postService.findOne(id);
		List<Comment> comments = commentService.findByPost(selected);
		model.addAttribute("post", selected);
		model.addAttribute("comments", comments);

		return "post";
	}
}