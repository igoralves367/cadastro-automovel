package br.com.tinnova.cadastroautomovel.veiculo.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class VeiculoResponse {
	private UUID idVeiculo;
}
