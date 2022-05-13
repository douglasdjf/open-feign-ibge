package br.com.openfeign.controller;

import br.com.openfeign.dto.OperacaoDTO;
import br.com.openfeign.dto.PaisesDTO;
import br.com.openfeign.dto.ProfileDTO;
import br.com.openfeign.service.PaisesService;
import br.com.openfeign.service.ProfileOperacaoService;
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
@RequestMapping("/profiles")
public class ProfileOperacaoController {

    @Autowired
    private ProfileOperacaoService profileOperacaoService;

    @GetMapping
    public List<ProfileDTO> getProfiles(){
        return profileOperacaoService.getProfiles();
    }

    @GetMapping(value = "/operacao")
    public List<OperacaoDTO> getOperacao(){
        return profileOperacaoService.getOperacoes();
    }
}
