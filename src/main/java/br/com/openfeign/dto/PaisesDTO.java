package br.com.openfeign.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaisesDTO {


    @JsonProperty("pais-M49")
    private Long id;

    @JsonProperty("pais-nome")
    private String nome;

    @JsonProperty("pais-ISO-ALPHA-2")
    private String sigla;

    @JsonProperty("regiao-nome")
    private String regiao;

}
