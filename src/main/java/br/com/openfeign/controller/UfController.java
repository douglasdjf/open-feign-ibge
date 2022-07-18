package br.com.openfeign.controller;

import br.com.openfeign.dto.MunicipioDTO;
import br.com.openfeign.dto.UfDTO;
import br.com.openfeign.service.MunicipioService;
import br.com.openfeign.service.UfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ufs")
public class UfController {

    @Autowired
    private UfService ufService;

    @Autowired
    private MunicipioService municipioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<UfDTO>> getUfs(){
        return ResponseEntity.ok(ufService.getUfs());
    }


    @GetMapping("/{id}/municipios")
    public ResponseEntity<List<MunicipioDTO>> getMunicipiosPoUfId(@PathVariable("id") Long id){
        List<MunicipioDTO> municipioDTOList = municipioService.getMunicipiosPoUfId(id);
        return CollectionUtils.isEmpty(municipioDTOList) ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(municipioDTOList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UfDTO> getUfPorId(@PathVariable("id") Long id){
        UfDTO ufDTO = ufService.getUfPorId(id);
        return ufDTO == null ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(ufDTO);

    }
}
