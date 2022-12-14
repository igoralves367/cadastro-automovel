package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoAlteraRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoAlteracaoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoDetalhadoResponse;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoListParametro;
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
	public VeiculoResponse criaVeiculo(VeiculoRequest veiculoRequest) {
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
		Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
		veiculoRepository.deletaVeiculo(veiculo);
		log.info("[finaliza] VeiculoApplicationService - deletaVeiculoAtravesId");		
	}

	@Override
	public void putAlteraVeiculo(UUID idVeiculo, VeiculoAlteracaoRequest veiculoAlteracaoRequest) {
		log.info("[inicia] VeiculoApplicationService - putAlteraVeiculo");
		Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
		veiculo.altera(veiculoAlteracaoRequest);
		veiculoRepository.salva(veiculo);
		log.info("[finaliza] VeiculoApplicationService - putAlteraVeiculo");
		
	}

	@Override
	public void pathAlteraVeiculo(UUID idVeiculo, VeiculoAlteraRequest veiculoAlteraRequest) {
		log.info("[inicia] VeiculoApplicationService - pathAlteraVeiculo");
		Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
		veiculo.altera(veiculoAlteraRequest);
		veiculoRepository.salva(veiculo);
		log.info("[finaliza] VeiculoApplicationService - pathAlteraVeiculo");
		
	}

	@Override
	public List<VeiculoListParametro> buscaVeiculoParametro() {
		log.info("[inicia] VeiculoApplicationService - buscaVeiculoParametro");
		List<Veiculo> veiculo = veiculoRepository.buscaVeiculoParametro();
		log.info("[finaliza] VeiculoApplicationService - buscaVeiculoParametro");
		return VeiculoListParametro.converte(veiculo);
	}
}