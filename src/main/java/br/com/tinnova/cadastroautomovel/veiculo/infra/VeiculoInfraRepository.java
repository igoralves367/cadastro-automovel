package br.com.tinnova.cadastroautomovel.veiculo.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.tinnova.cadastroautomovel.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository {
	private final VeiculoSpringDataJPARepository veiculoSpringDataJPARepository;

	@Override
	public Veiculo salva(Veiculo veiculo) {
		log.info("[inicia] VeiculoInfraRepository - salva");
		veiculoSpringDataJPARepository.save(veiculo);
		log.info("[finaliza] VeiculoInfraRepository - salva");
		return veiculo;
	}

	@Override
	public List<Veiculo> buscaTodosVeiculos() {
		log.info("[inicia] VeiculoInfraRepository - buscaTodosVeiculos");
		log.info("[inicia] VeiculoInfraRepository - buscaTodosVeiculos");
		return null;
	}

}
