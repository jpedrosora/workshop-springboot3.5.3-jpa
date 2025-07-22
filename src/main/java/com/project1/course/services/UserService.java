package com.project1.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.course.entities.User;
import com.project1.course.repositories.UserRepository;

//annotation para o spring identificar a injeção de dependencia @Component @Repository
@Service
public class UserService {
//criação de serviços para nao acumular na camada Repository
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		//retorna o obj do tipo declarado no Optional
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
