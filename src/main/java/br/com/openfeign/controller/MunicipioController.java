package br.com.openfeign.controller;

import br.com.openfeign.dto.MunicipioDTO;
import br.com.openfeign.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * Lembrando que a porta está 8081
 */

@RestController
@RequestMapping("/municipios")
public class MunicipioController {

    @Autowired
    private MunicipioService municipioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<MunicipioDTO>> getMunicipios(){
        return ResponseEntity.ok(municipioService.getMunicipios());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<MunicipioDTO> getMunicipioPorId(@PathVariable("id") Long id){
      MunicipioDTO municipioDTO =  municipioService.getMunicipioPorId(id);
        return municipioDTO == null ?
                ResponseEntity.noContent().build() : ResponseEntity.ok(municipioService.getMunicipioPorId(id));
    }

}
