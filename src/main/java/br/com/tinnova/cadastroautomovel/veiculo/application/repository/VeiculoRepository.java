package br.com.tinnova.cadastroautomovel.veiculo.application.repository;

import java.util.List;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;

public interface VeiculoRepository {
	Veiculo salva(Veiculo veiculo);
	List<Veiculo> buscaTodosVeiculos();

}
