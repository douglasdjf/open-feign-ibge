package br.com.openfeign.client;


import br.com.openfeign.client.config.AutoConfiguration;
import br.com.openfeign.dto.MunicipioDTO;
import br.com.openfeign.dto.PaisesDTO;
import br.com.openfeign.dto.RegiaoDTO;
import br.com.openfeign.dto.UfDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/***
 *
 * Api base de consulta site: https://servicodados.ibge.gov.br/api/docs/localidades
 *  https://servicodados.ibge.gov.br/api/v1/localidades/paises
 */

@FeignClient(name = "ibgeLocalidades",
            url = "${ibgeLocalidades.url}",
            configuration = AutoConfiguration.class)
public interface IBGELocalidadesClient {

    @GetMapping(value = "/paises?view=nivelado&orderBy=nome")
    List<PaisesDTO> getPaises();

    @GetMapping(value = "/municipios?view=nivelado&orderBy=nome")
    List<MunicipioDTO> getMunicipios();

    @GetMapping(value = "/municipios/{id}?view=nivelado")
    MunicipioDTO getMunicipioPorId(@PathVariable("id") Long id);

    @GetMapping(value = "estados/{id}/municipios?view=nivelado&orderBy=nome")
    List<MunicipioDTO> getMunicipiosPoUfId(@PathVariable("id") Long id);

    @GetMapping(value = "/estados?orderBy=nome")
    List<UfDTO> getUfs();

    @GetMapping(value = "/estados/{id}")
    UfDTO getUfPorId(@PathVariable("id") Long id);

    @GetMapping(value = "/regioes?orderBy=nome")
    public List<RegiaoDTO> gerRegioes();
}
