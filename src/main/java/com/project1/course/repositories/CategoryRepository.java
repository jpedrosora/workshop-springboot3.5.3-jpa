package com.project1.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.course.entities.Category;

//camada mais baixa da arquitetura
//Repository responsavel por fazer operações com a entidade User, reutilizando JPARepository que é uma interface
//somente com isso o Spring faz a implementação padrao da entidade
//é opcional @Repository pois ja esta herdando de JPARepository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
