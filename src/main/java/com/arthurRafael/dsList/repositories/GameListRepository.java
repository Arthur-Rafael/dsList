package com.arthurRafael.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurRafael.dsList.entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
