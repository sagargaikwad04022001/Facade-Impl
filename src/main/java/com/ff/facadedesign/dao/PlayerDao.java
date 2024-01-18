package com.ff.facadedesign.dao;

import com.ff.facadedesign.entity.Player;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDao {
    Player savePlayer(Player player);

    Player getPlayer(String id);

    List<Player> getPlayers();
}
