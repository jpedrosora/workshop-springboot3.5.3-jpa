package com.project1.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.course.entities.Order;
import com.project1.course.repositories.OrderRepository;

//annotation para o spring identificar a injeção de dependencia @Component @Repository
@Service
public class OrderService {
//criação de serviços para nao acumular na camada Repository
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		//retorna o obj do tipo declarado no Optional
		return obj.get();
	}
}
