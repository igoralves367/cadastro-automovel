package br.com.tinnova.cadastroautomovel.veiculo.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;

public interface VeiculoRepository {
	Veiculo salva(Veiculo veiculo);
	List<Veiculo> buscaTodosVeiculos();
	Veiculo buscaVeiculoAtravesId(UUID idVeiculos);

}
