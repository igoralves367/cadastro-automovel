package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
import lombok.Value;
@Value
public class VeiculoListResponse {
	private UUID idVeiculo;
	private String veiculo;
	private String marca;
	private String cor;
	private Integer ano;
	private String descricao;
	
	
	public static List<VeiculoListResponse> converte(List<Veiculo> veiculo2) {
		return veiculo2.stream()
				.map(VeiculoListResponse::new)
				.collect(Collectors.toList());
	}

	public VeiculoListResponse(Veiculo veiculo) {
		this.idVeiculo = veiculo.getIdVeiculo();
		this.veiculo = veiculo.getVeiculo();
		this.marca = veiculo.getMarca();
		this.cor = veiculo.getCor();
		this.ano = veiculo.getAno();
		this.descricao = veiculo.getDescricao();
	}
}
