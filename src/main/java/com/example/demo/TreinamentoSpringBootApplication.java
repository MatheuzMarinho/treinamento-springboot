package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Model.Cliente;
import com.example.demo.Repository.ClienteRepository;

@SpringBootApplication
public class TreinamentoSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TreinamentoSpringBootApplication.class, args);
		clienteConfiguracao(context);
	}

	public static void clienteConfiguracao(ConfigurableApplicationContext context) {

		Cliente cliente = new Cliente("Matheus Marinho", 1, 1, "Observação Matheus", false);
		context.getBean(ClienteRepository.class).save(cliente);
		cliente = new Cliente("Lucas Marinho", 1, 1, "Observação Lucas", false);
		context.getBean(ClienteRepository.class).save(cliente);
		cliente = new Cliente("Avelino Gomez", 0, 1, "Observação Avelino", true);
		context.getBean(ClienteRepository.class).save(cliente);
		cliente = new Cliente("Maria José", 0, 0, "Observação Maria", true);
		context.getBean(ClienteRepository.class).save(cliente);


	}

}
