package br.com.tinnova.cadastroautomovel.veiculo.infra;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tinnova.cadastroautomovel.veiculo.domain.Veiculo;

public interface VeiculoSpringDataJPARepository extends JpaRepository<Veiculo, UUID> {
}