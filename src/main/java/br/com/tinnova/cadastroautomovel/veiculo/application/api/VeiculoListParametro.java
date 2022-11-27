package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import lombok.Value;

@Value
public class VeiculoListParametro {
	private String marca;
	private String cor;
	private Integer ano;
}
