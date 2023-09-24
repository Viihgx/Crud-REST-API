package com.crud.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.restapi.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long>{
    
}
