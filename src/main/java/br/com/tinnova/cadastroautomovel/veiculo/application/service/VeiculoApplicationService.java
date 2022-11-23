package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

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
	public VeiculoResponse criaVeiculo(@Valid VeiculoRequest veiculoRequeste) {
		log.info("[inicia] VeiculoApplicationService - criaVeiculo");
		Veiculo veiculo = veiculoRepository.salva( new Veiculo(veiculoRequeste));
		log.info("[finaliza] VeiculoApplicationService - criaVeiculo");
		return VeiculoResponse.builder()
				.idVeiculo(veiculo.getIdVeiculo())
				.build();
	}
}
