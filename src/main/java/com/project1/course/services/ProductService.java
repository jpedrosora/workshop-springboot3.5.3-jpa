package com.project1.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.course.entities.Product;
import com.project1.course.repositories.ProductRepository;

//annotation para o spring identificar a injeção de dependencia @Component @Repository
@Service
public class ProductService {
//criação de serviços para nao acumular na camada Repository
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		//retorna o obj do tipo declarado no Optional
		return obj.get();
	}
}
