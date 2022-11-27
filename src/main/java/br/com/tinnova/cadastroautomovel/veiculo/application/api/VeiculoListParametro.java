package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.List;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
import lombok.Value;

@Value
public class VeiculoListParametro {
	private String marca;
	private String cor;
	private Integer ano;
	
	
	public static List<VeiculoListParametro> converte(List<Veiculo> veiculo) {
		// TODO Auto-generated method stub
		return null;
	}
}
