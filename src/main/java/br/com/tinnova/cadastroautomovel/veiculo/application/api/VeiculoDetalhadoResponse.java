package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.UUID;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
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
	
	public VeiculoDetalhadoResponse(Veiculo veiculo2) {
		this.idVeiculo = veiculo2.getIdVeiculo();
		this.veiculo = veiculo2.getVeiculo();
		this.marca = veiculo2.getMarca();
		this.cor = veiculo2.getCor();
		this.ano = veiculo2.getAno();
		this.descricao = veiculo2.getDescricao();
		this.vendido = veiculo2.getVendido();
	}

}
