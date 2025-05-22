package com.arthurRafael.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthurRafael.dsList.dto.GameListDTO;
import com.arthurRafael.dsList.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService service;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = service.findall();
		return result;
	}

}
