package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
public class VeiculoController implements VeiculoAPI {

	@Override
	public VeiculoResponse postVeiculo(@Valid VeiculoRequest veiculoRequeste) {
		log.info("[inicia] VeiculoController - postVeiculo");
		log.info("[finaliza] VeiculoController - postVeiculo");
		return null;
	}

}
