package com.abhi.spring.music.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abhi.spring.music.service.SpringMusicService;

@Controller
public class SpringMusicController {

	@Autowired
	private SpringMusicService musicService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage(Map<String, Object> model) {
		
		String res = musicService.getMusicAlbums();
		System.out.println("result = "+res);

		return "index";
	}

}
