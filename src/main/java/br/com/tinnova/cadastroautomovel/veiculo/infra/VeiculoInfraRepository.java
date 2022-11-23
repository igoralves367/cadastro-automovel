package br.com.tinnova.cadastroautomovel.veiculo.infra;

import org.springframework.stereotype.Repository;

import br.com.tinnova.cadastroautomovel.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
public class VeiculoInfraRepository implements VeiculoRepository {

	@Override
	public Veiculo salva(Veiculo veiculo) {
		log.info("[inicia] VeiculoInfraRepository - salva");
		log.info("[finaliza] VeiculoInfraRepository - salva");
		return null;
	}

}
