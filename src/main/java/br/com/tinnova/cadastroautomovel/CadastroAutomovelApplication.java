package br.com.tinnova.cadastroautomovel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class CadastroAutomovelApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cadastro Automovel - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastroAutomovelApplication.class, args);
	}
}
