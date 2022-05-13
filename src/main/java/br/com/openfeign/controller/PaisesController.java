package br.com.openfeign.controller;

import br.com.openfeign.dto.PaisesDTO;
import br.com.openfeign.service.PaisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;


/**
 *
 * Lembrando que a porta está 8081
 */


@RestController
@RequestMapping("/paises")
public class PaisesController {

    @Autowired
    private PaisesService paisesService;

    @GetMapping
    public List<PaisesDTO> getPaisesIbge(){
        return paisesService.getPaises();
    }
}
