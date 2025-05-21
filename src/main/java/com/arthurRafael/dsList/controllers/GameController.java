package com.arthurRafael.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthurRafael.dsList.dto.GameDTO;
import com.arthurRafael.dsList.dto.GameMinDTO;
import com.arthurRafael.dsList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = service.findall();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO dto = service.findById(id);
		return dto;
	}
}
