package com.ff.facadedesign.service.impl;

import com.ff.facadedesign.dao.PlayerDao;
import com.ff.facadedesign.entity.Player;
import com.ff.facadedesign.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;


    @Override
    public Player savePlayer(Player player) {
        return playerDao.savePlayer(player);
    }

    @Override
    public Player getPlayer(String id) {
        return playerDao.getPlayer(id);
    }

    @Override
    public List<Player> getPlayers() {
        return playerDao.getPlayers();
    }
}
