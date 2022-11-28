package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Marca;
import lombok.Value;
@Value
public class VeiculoAlteracaoRequest {
	@NotBlank
	private String veiculo;
	private Marca marca;
	@NotBlank
	private String cor;
	@NotNull
	private Integer ano;
	private String descricao;
	@NotNull
	private Boolean vendido;
}
