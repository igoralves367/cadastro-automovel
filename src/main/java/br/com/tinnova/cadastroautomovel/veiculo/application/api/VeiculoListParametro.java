package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
import lombok.Value;

@Value
public class VeiculoListParametro {
	private String marca;
	private String cor;
	private Integer ano;
	
	
	public static List<VeiculoListParametro> converte(List<Veiculo> veiculo) {
		return veiculo.stream()
				.map(VeiculoListParametro::new)
				.collect(Collectors.toList());
	}

	public VeiculoListParametro(Veiculo veiculo) {
		this.marca = veiculo.getMarca();
		this.cor = veiculo.getCor();
		this.ano = veiculo.getAno();
	}	
}
