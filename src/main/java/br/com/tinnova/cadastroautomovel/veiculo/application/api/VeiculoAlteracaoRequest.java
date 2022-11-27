package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Value;
@Value
public class VeiculoAlteracaoRequest {
	@NotBlank
	private String veiculo;
	@NotBlank
	private String marca;
	@NotBlank
	private String cor;
	@NotNull
	private Integer ano;
	private String descricao;
	@NotNull
	private Boolean vendido;
}
