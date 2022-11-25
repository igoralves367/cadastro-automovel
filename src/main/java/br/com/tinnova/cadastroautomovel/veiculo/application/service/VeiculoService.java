package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import java.util.List;

import javax.validation.Valid;

import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoResponse;

public interface VeiculoService {
	VeiculoResponse criaVeiculo(@Valid VeiculoRequest veiculoRequeste);
	List<VeiculoListResponse> buscaTodosVeiculos();
}
