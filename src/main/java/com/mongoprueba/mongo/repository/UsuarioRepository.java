package com.mongoprueba.mongo.repository;

import com.mongoprueba.mongo.documentos.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuarios, Integer>{

}
