
package info.emmerick.at_desenvolvimentoservicosspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.emmerick.at_desenvolvimentoservicosspringboot.model.Departamento;
import info.emmerick.at_desenvolvimentoservicosspringboot.repository.DepartamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<Departamento> getAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    public Optional<Departamento> getDepartamentoById(Long id) {
        return departamentoRepository.findById(id);
    }

    public Departamento createDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public Optional<Departamento> updateDepartamento(Long id, Departamento departamentoDetails) {
        Optional<Departamento> departamento = departamentoRepository.findById(id);
        if (departamento.isPresent()) {
            Departamento updatedDepartamento = departamento.get();
            updatedDepartamento.setNome(departamentoDetails.getNome());
            return Optional.of(departamentoRepository.save(updatedDepartamento));
        } else {
            return Optional.empty();
        }
    }

    public boolean deleteDepartamento(Long id) {
        if (departamentoRepository.existsById(id)) {
            departamentoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
