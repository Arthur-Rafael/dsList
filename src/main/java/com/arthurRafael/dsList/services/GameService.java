package com.arthurRafael.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arthurRafael.dsList.dto.GameDTO;
import com.arthurRafael.dsList.dto.GameMinDTO;
import com.arthurRafael.dsList.entites.Game;
import com.arthurRafael.dsList.repositories.GameRepository;


@Service
public class GameService{

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findall() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
	//Fazer posteriormente um tratamento de excessão 
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
}
