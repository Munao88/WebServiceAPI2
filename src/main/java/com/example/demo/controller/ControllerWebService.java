package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerWebService {
	@RequestMapping("/topic")
	public List<Topic> Welcome() {
		return Arrays.asList(
				new Topic("spring","Spring Framework","Spring Framework Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript","javascript","Javascript Description")
				);
	}
	@RequestMapping("/test")
	public Topic getTopic() {
		Topic Topic = new Topic("java","java","java");
		return Topic;
		
	}
}
