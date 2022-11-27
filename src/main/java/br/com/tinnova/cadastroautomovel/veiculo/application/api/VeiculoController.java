package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.cadastroautomovel.veiculo.application.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class VeiculoController implements VeiculoAPI {
	private final  VeiculoService veiculoService;

	@Override
	public VeiculoResponse postVeiculo(@Valid VeiculoRequest veiculoRequest) {
		log.info("[inicia] VeiculoController - postVeiculo");
		VeiculoResponse veiculoCriado = veiculoService.criaVeiculo(veiculoRequest);
		log.info("[finaliza] VeiculoController - postVeiculo");
		return veiculoCriado;
	}

	@Override
	public List<VeiculoListResponse> getTodosVeiculos() {
		log.info("[inicia] VeiculoController - getTodosVeiculos");
		List<VeiculoListResponse> veiculo = veiculoService.buscaTodosVeiculos();
		log.info("[finaliza] VeiculoController - getTodosVeiculos");
		return veiculo;
	}

	@Override
	public VeiculoDetalhadoResponse getVeiculoAtravesId(UUID idVeiculo) {
		log.info("[inicia] VeiculoController - getVeiculoAtravesId");
		log.info("{idVeiculo} {}", idVeiculo);
		VeiculoDetalhadoResponse veiculoDetalhado = veiculoService.buscaVeiculoAtravesId(idVeiculo);
		log.info("[finaliza] VeiculoController - getVeiculoAtravesId");
		return veiculoDetalhado;
	}

	@Override
	public void deletaVeiculoAtravesId(UUID idVeiculo) {
		log.info("[inicia] VeiculoController - deletaVeiculoAtravesId");
		log.info("{idVeiculo} {}", idVeiculo);
		veiculoService.deletaVeiculoAtravesId(idVeiculo);
		log.info("[finaliza] VeiculoController - deletaVeiculoAtravesId");		
	}

	@Override
	public void putAlteraVeiculo(UUID idVeiculo, @Valid VeiculoAlteracaoRequest veiculoAlteracaoRequest) {
		log.info("[inicia] VeiculoController - putAlteraVeiculo");
		log.info("{idVeiculo} {}", idVeiculo);
		veiculoService.putAlteraVeiculo(idVeiculo, veiculoAlteracaoRequest);
		log.info("[finaliza] VeiculoController - putAlteraVeiculo");
		
	}

	@Override
	public void pathAlteraVeiculo(UUID idVeiculo, @Valid VeiculoAlteraRequest veiculoAlteraRequest) {
		log.info("[inicia] VeiculoController - pathAlteraVeiculo");
		log.info("{idVeiculo} {}", idVeiculo);
		veiculoService.pathAlteraVeiculo(idVeiculo, veiculoAlteraRequest);
		log.info("[finaliza] VeiculoController - pathAlteraVeiculo");
		
	}
}
