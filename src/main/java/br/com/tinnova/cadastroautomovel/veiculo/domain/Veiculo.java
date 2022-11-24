package br.com.tinnova.cadastroautomovel.veiculo.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.tinnova.cadastroautomovel.veiculo.application.api.VeiculoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idVeiculo;
	private String veiculo;
	private String marca;
	private Integer ano;
	private String descricao;
	private Boolean vendido;
	
	private LocalDateTime created;
	private LocalDateTime updated;
	
	public Veiculo(VeiculoRequest veiculoRequest) {
		this.veiculo = veiculoRequest.getVeiculo();
		this.marca = veiculoRequest.getMarca();
		this.ano = veiculoRequest.getAno();
		this.descricao = veiculoRequest.getDescricao();
		this.vendido = veiculoRequest.getVendido();
		this.created = LocalDateTime.now();
		this.updated = LocalDateTime.now();
	}	
}
