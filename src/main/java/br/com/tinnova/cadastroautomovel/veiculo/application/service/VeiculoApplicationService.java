package br.com.tinnova.cadastroautomovel.veiculo.application.service;

import javax.validation.Valid;
import org.springframework.stereotype.Service;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class VeiculoApplicationService implements VeiculoService {

	@Override
	public VeiculoResponse criaVeiculo(@Valid VeiculoRequest veiculoRequeste) {
		log.info("[inicia] VeiculoApplicationService - criaVeiculo");
		log.info("[finaliza] VeiculoApplicationService - criaVeiculo");
		return null;
	}
}
