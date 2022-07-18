package br.com.openfeign.controller;

import br.com.openfeign.dto.RegiaoDTO;
import br.com.openfeign.service.RegioesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regioes")
public class RegiaoController {

    @Autowired
    private RegioesService regioesService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<RegiaoDTO>> gerRegioes(){
        return ResponseEntity.ok(regioesService.getRegioes());
    }
}
