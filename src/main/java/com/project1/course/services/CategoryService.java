package com.project1.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.course.entities.Category;
import com.project1.course.repositories.CategoryRepository;

//annotation para o spring identificar a injeção de dependencia @Component @Repository
@Service
public class CategoryService {
//criação de serviços para nao acumular na camada Repository
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		//retorna o obj do tipo declarado no Optional
		return obj.get();
	}
}
