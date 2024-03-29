package br.com.openfeign.controller;

import br.com.openfeign.dto.PaisesDTO;
import br.com.openfeign.service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/paises")
public class PaisesController {

    @Autowired
    private PaisesService paisesService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<PaisesDTO>> getPaises(){
        return ResponseEntity.ok(paisesService.getPaises());
    }
}
