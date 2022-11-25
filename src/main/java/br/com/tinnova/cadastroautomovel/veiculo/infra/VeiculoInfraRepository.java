package br.com.tinnova.cadastroautomovel.veiculo.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.tinnova.cadastroautomovel.handler.APIException;
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
		List<Veiculo> todosVeiculos = veiculoSpringDataJPARepository.findAll();
		log.info("[finaliza] VeiculoInfraRepository - buscaTodosVeiculos");
		return todosVeiculos;
	}

	@Override
	public Veiculo buscaVeiculoAtravesId(UUID idVeiculo) {
		log.info("[inicia] VeiculoInfraRepository - buscaVeiculoAtravesId");
		Veiculo veiculo = veiculoSpringDataJPARepository.findById(idVeiculo)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente não encontrato"));
		log.info("[finaliza] VeiculoInfraRepository - buscaVeiculoAtravesId");
		return veiculo;
	}

	@Override
	public void deletaVeiculo(Veiculo veiculo) {
		log.info("[inicia] VeiculoInfraRepository - deletaVeiculo");
		veiculoSpringDataJPARepository.delete(veiculo);
		log.info("[finaliza] VeiculoInfraRepository - deletaVeiculo");		
	}
}
