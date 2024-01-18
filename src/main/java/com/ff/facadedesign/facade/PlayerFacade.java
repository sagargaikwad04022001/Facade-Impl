package com.ff.facadedesign.facade;

import com.ff.facadedesign.dto.RequestDto;
import com.ff.facadedesign.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

public interface PlayerFacade {
    ResponseEntity<ResponseDto> savePlayer(RequestDto requestDto);

    ResponseEntity<ResponseDto> getPlayer(String id);

    ResponseEntity<List<ResponseDto>> getPlayers();
}
