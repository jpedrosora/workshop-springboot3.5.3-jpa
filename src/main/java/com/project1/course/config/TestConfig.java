package com.project1.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project1.course.entities.User;
import com.project1.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{//Interface q executa as intancias quando o programa for iniciado

//Classe de configuração para a instanciação do banco de dados especifica para o perfil de test
//injeção de dependencia automatica feita pelo container do framework
	//annotation que resolve a dependencia associa uma instancia, quando um servico depende de outro a injeção deve ser fraca
	@Autowired
	private UserRepository userRepository;

	//database seeding
	//executar quando o programa for iniciado
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		//saving no db
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
}
