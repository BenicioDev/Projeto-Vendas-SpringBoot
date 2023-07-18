package io.github.BenicioDev;

import io.github.BenicioDev.domain.entity.Cliente;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.github.BenicioDev.domain.repositorio.Clientes;

import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    String Message = "teste";

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
          Cliente cliente = new Cliente();
          cliente.setNome("Benicio");
          clientes.salvar(cliente);

            Cliente cliente1 = new Cliente();
            cliente.setNome("Gabriel");
            clientes.salvar(cliente);

            List <Cliente> todosClientes = clientes.obterLista();
            todosClientes.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}
