package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoDetalhadoResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class VeiculoApplicationService implements VeiculoService {
	private final VeiculoRepository veiculoRepository;

	@Override
	public VeiculoResponse criaVeiculo(@Valid VeiculoRequest veiculoRequest) {
		log.info("[inicia] VeiculoApplicationService - criaVeiculo");
		Veiculo veiculo = veiculoRepository.salva( new Veiculo(veiculoRequest));
		log.info("[finaliza] VeiculoApplicationService - criaVeiculo");
		return VeiculoResponse.builder()
				.idVeiculo(veiculo.getIdVeiculo())
				.build();
	}

	@Override
	public List<VeiculoListResponse> buscaTodosVeiculos() {
		log.info("[inicia] VeiculoApplicationService - buscaTodosVeiculos");
		List<Veiculo> veiculo = veiculoRepository.buscaTodosVeiculos();
		log.info("[finaliza] VeiculoApplicationService - buscaTodosVeiculos");
		return VeiculoListResponse.converte(veiculo);
	}

	@Override
	public VeiculoDetalhadoResponse buscaVeiculoAtravesId(UUID idVeiculo) {
		log.info("[inicia] VeiculoApplicationService - buscaVeiculoAtravesId");
		Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
		log.info("[finaliza] VeiculoApplicationService - buscaVeiculoAtravesId");
		return new VeiculoDetalhadoResponse(veiculo);
	}

	@Override
	public void deletaVeiculoAtravesId(UUID idVeiculo) {
		log.info("[inicia] VeiculoApplicationService - deletaVeiculoAtravesId");
		log.info("[finaliza] VeiculoApplicationService - deletaVeiculoAtravesId");
		
	}
}
