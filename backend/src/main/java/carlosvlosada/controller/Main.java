package carlosvlosada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import carlosvlosada.service.CommentService;
import carlosvlosada.service.UserService;

@Controller
public class Main {
	
	@Autowired
	private UserService userService;
	@Autowired
	private CommentService commentService;
}