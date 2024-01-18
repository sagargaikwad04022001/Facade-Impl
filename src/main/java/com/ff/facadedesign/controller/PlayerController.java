package com.ff.facadedesign.controller;

import com.ff.facadedesign.dto.RequestDto;
import com.ff.facadedesign.dto.ResponseDto;
import com.ff.facadedesign.facade.PlayerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("players")
public class PlayerController {

    @Autowired
    private PlayerFacade playerFacade;

    @PostMapping("/players")
    public ResponseEntity<ResponseDto> savePlayer(@RequestBody RequestDto requestDto)
    {
        return playerFacade.savePlayer(requestDto);
    }

    @GetMapping("/players/{id}")
    public ResponseEntity<ResponseDto> getPlayer(@PathVariable String id)
    {
        return playerFacade.getPlayer(id);
    }

    @GetMapping("/players")
    public ResponseEntity<List<ResponseDto>> getPlayers()
    {
        return playerFacade.getPlayers();
    }
}
