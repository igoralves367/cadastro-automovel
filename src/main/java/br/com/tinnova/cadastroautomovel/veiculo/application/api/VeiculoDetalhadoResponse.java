package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.UUID;

import lombok.Value;
@Value
public class VeiculoDetalhadoResponse {
	private UUID idVeiculo;
	private String veiculo;
	private String marca;
	private String cor;
	private Integer ano;
	private String descricao;
	private Boolean vendido;
}
