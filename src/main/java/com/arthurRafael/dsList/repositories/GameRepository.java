package com.arthurRafael.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurRafael.dsList.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
