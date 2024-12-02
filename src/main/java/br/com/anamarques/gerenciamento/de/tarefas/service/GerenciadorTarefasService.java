package br.com.anamarques.gerenciamento.de.tarefas.service;

import br.com.anamarques.gerenciamento.de.tarefas.entity.GerenciadorTarefas;
import br.com.anamarques.gerenciamento.de.tarefas.repository.GerenciadorTarefasRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import java.util.List;

@Service
@Validated
public class GerenciadorTarefasService {

    @Autowired
    private GerenciadorTarefasRepository gerenciadorTarefasRepository;

    public List<GerenciadorTarefas> create(@Valid GerenciadorTarefas gerenciadorTarefas) { // Garantindo que a validação ocorre antes de salvar
        gerenciadorTarefasRepository.save(gerenciadorTarefas);
        return list();
    }

    public List<GerenciadorTarefas> list() {
        Sort sort = Sort.by("status").descending().and(Sort.by("titulo")).ascending();
        return gerenciadorTarefasRepository.findAll(sort);
    }

    public List<GerenciadorTarefas> update(@Valid GerenciadorTarefas gerenciadorTarefas) {
        gerenciadorTarefasRepository.save(gerenciadorTarefas);
        return list();
    }


    public List<GerenciadorTarefas> delete(@NotNull Long id) {
        gerenciadorTarefasRepository.deleteById(id);
        return list();
    }
}
