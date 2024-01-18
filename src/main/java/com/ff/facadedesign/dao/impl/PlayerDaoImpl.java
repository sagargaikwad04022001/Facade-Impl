package com.ff.facadedesign.dao.impl;

import com.ff.facadedesign.dao.PlayerDao;
import com.ff.facadedesign.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDaoImpl implements PlayerDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Player savePlayer(Player player) {
        return mongoTemplate.save(player);
    }

    @Override
    public Player getPlayer(String id) {
        return mongoTemplate.findById(id,Player.class);
    }

    @Override
    public List<Player> getPlayers() {
        return mongoTemplate.findAll(Player.class);
    }
}
