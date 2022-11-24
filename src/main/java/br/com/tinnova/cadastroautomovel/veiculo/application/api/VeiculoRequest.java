package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import lombok.Value;

@Value
public class VeiculoRequest {
	private String veiculo;
	private String marca;
	private Integer ano;
	private String descricao;
	private Boolean vendido;
}
