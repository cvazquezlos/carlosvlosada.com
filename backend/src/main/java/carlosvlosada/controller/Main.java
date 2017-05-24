package carlosvlosada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}