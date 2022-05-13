package br.com.openfeign.controller;

import br.com.openfeign.dto.MunicipioDTO;
import br.com.openfeign.dto.PaisesDTO;
import br.com.openfeign.service.MunicipioService;
import br.com.openfeign.service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<MunicipioDTO> getMunicipiosIbge(){
        return municipioService.getMunicipios();
    }
}
