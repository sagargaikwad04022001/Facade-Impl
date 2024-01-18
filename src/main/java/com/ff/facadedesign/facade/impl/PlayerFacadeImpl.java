package com.ff.facadedesign.facade.impl;

import com.ff.facadedesign.dto.RequestDto;
import com.ff.facadedesign.dto.ResponseDto;
import com.ff.facadedesign.entity.Player;
import com.ff.facadedesign.facade.PlayerFacade;
import com.ff.facadedesign.service.PlayerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PlayerFacadeImpl implements PlayerFacade {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private  ModelMapper modelMapper;



    @Override
    public ResponseEntity<ResponseDto> savePlayer(RequestDto requestDto) {
        Player player=modelMapper.map(requestDto,Player.class);
        ResponseDto responseDto=modelMapper.map(playerService.savePlayer(player),ResponseDto.class);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ResponseDto> getPlayer(String id) {
        Player player=playerService.getPlayer(id);
        ResponseDto responseDto=modelMapper.map(player,ResponseDto.class);
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<ResponseDto>> getPlayers() {
        List<Player> players=playerService.getPlayers();
        List<ResponseDto> responseDtos=new ArrayList<>();
        for(Player player:players)
        {
            ResponseDto responseDto=modelMapper.map(player,ResponseDto.class);
            responseDtos.add(responseDto);
        }
        return new ResponseEntity<List<ResponseDto>>(responseDtos,HttpStatus.FOUND);
    }
}
