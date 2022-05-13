package br.com.openfeign.client;


import br.com.openfeign.client.config.IBGEPaisesConfiguration;
import br.com.openfeign.dto.MunicipioDTO;
import br.com.openfeign.dto.PaisesDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Set;

/***
 *
 * Api base de consulta site: https://servicodados.ibge.gov.br/api/docs/localidades
 *  https://servicodados.ibge.gov.br/api/v1/localidades/paises
 */

@FeignClient(name = "ibgeLocalidades",
            url = "${ibgeLocalidades.url}",
            configuration = IBGEPaisesConfiguration.class)
public interface IBGEPPaisesClient {

    @GetMapping(value = "/paises?view=nivelado&orderBy=nome")
    List<PaisesDTO> getPaises();

    @GetMapping(value = "/municipios?view=nivelado&orderBy=nome")
    List<MunicipioDTO> getMunicipios();
}
