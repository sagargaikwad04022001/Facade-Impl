package com.ff.facadedesign.service;

import com.ff.facadedesign.entity.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService{

    Player savePlayer(Player requestDto);

    Player getPlayer(String id);

    List<Player> getPlayers();
}
