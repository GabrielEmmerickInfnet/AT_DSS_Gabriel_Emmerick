package info.emmerick.at_desenvolvimentoservicosspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.emmerick.at_desenvolvimentoservicosspringboot.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {


}
