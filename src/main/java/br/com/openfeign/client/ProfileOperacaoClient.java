package br.com.openfeign.client;


import br.com.openfeign.client.config.AutoConfiguration;
import br.com.openfeign.dto.OperacaoDTO;
import br.com.openfeign.dto.ProfileDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/***
 *
 *  Exemplo de conexão para uma api
 */

@FeignClient(name = "perfil-operation",
            url = "${microservico.perfil-operation}",
            configuration = AutoConfiguration.class)
public interface ProfileOperacaoClient {

    @GetMapping(value = "/profile")
    List<ProfileDTO> getProfiles();

    @GetMapping(value = "/operacao")
    List<OperacaoDTO> getOperacoes();
}
