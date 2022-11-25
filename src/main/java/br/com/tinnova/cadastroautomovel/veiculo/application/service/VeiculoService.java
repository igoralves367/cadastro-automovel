package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoDetalhadoResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoResponse;

public interface VeiculoService {
	VeiculoResponse criaVeiculo(@Valid VeiculoRequest veiculoRequeste);
	List<VeiculoListResponse> buscaTodosVeiculos();
	VeiculoDetalhadoResponse buscaVeiculoAtravesId(UUID idVeiculo);
	void deletaVeiculoAtravesId(UUID idVeiculo);
}
