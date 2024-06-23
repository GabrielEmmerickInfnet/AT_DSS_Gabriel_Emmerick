package info.emmerick.at_desenvolvimentoservicosspringboot.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import info.emmerick.at_desenvolvimentoservicosspringboot.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}


