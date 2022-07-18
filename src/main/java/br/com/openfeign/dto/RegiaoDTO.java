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
public class RegiaoDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("sigla")
    private String sigla;

    @JsonProperty("nome")
    private String nome;
}
