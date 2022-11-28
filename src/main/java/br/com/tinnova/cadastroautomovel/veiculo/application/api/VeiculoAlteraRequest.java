package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Marca;
import lombok.Value;
@Value
public class VeiculoAlteraRequest {
	private Marca marca;
	@NotBlank
	private String cor;
	@NotNull
	private Boolean vendido;
}
