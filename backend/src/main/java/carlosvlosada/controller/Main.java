package carlosvlosada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import carlosvlosada.model.Item;
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

	@RequestMapping("")
	public String home(Model model) {

		List<Item> portfolio = itemService.findAll();
		model.addAttribute("items", portfolio);

		return "index";
	}
}