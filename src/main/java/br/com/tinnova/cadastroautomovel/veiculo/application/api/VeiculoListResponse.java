package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.List;
import java.util.UUID;

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
		// TODO Auto-generated method stub
		return null;
	}
}
