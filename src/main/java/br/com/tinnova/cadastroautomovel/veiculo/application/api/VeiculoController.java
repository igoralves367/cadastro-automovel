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
	public VeiculoDetalhadoResponse getVeiculoAtravesId(UUID idVeiculos) {
		log.info("[inicia] VeiculoController - getVeiculoAtravesId");
		log.info("{idVeiculo} {}", idVeiculos);
		VeiculoDetalhadoResponse veiculoDetalhado = veiculoService.buscaVeiculoAtravesId(idVeiculos);
		log.info("[inicia] VeiculoController - getVeiculoAtravesId");
		return veiculoDetalhado;
	}
}
