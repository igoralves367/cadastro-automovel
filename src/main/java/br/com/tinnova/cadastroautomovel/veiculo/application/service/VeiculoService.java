package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import java.util.List;
import java.util.UUID;

import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoAlteraRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoAlteracaoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoDetalhadoResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoListParametro;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoResponse;

public interface VeiculoService {
	VeiculoResponse criaVeiculo(VeiculoRequest veiculoRequeste);
	List<VeiculoListResponse> buscaTodosVeiculos();
	VeiculoDetalhadoResponse buscaVeiculoAtravesId(UUID idVeiculo);
	void deletaVeiculoAtravesId(UUID idVeiculo);
	void putAlteraVeiculo(UUID idVeiculo, VeiculoAlteracaoRequest veiculoAlteracaoRequest);
	void pathAlteraVeiculo(UUID idVeiculo, VeiculoAlteraRequest veiculoAlteraRequest);
	List<VeiculoListParametro> buscaVeiculoParametro();
}