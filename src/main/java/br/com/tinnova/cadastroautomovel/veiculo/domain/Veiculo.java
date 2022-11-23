package br.com.tinnova.cadastroautomovel.veiculo.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;

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
	//private Text descricao; //text ?
	private Boolean vendido;
	
	private LocalDateTime created;
	private LocalDateTime updated;
	
	public Veiculo(@Valid VeiculoRequest veiculoRequeste) {
		this.veiculo = veiculoRequeste.getVeiculo();
		this.marca = veiculoRequeste.getMarca();
		this.ano = veiculoRequeste.getAno();
		this.vendido = veiculoRequeste.getVendido();
		this.created = LocalDateTime.now();
		this.updated = LocalDateTime.now();
	}	
}
