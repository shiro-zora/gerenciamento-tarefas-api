package br.com.anamarques.gerenciamento.de.tarefas.controller;

import br.com.anamarques.gerenciamento.de.tarefas.entity.GerenciadorTarefas;
import br.com.anamarques.gerenciamento.de.tarefas.service.GerenciadorTarefasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gerenciadorTarefas")
@Validated
public class GerenciamentoController {
    @Autowired
    private GerenciadorTarefasService gerenciadorTarefasService;

    @PostMapping
    public List<GerenciadorTarefas> create(@Valid @RequestBody GerenciadorTarefas gerenciadorTarefas) {
        return gerenciadorTarefasService.create(gerenciadorTarefas);
    }

    @GetMapping
    public List<GerenciadorTarefas> list() {
        return gerenciadorTarefasService.list();
    }

    @PutMapping
    public List<GerenciadorTarefas> update(@Valid @RequestBody GerenciadorTarefas gerenciadorTarefas) {
        return gerenciadorTarefasService.update(gerenciadorTarefas);
    }

    @DeleteMapping("{id}")
    public List<GerenciadorTarefas> delete(@PathVariable("id") Long id) {
        return gerenciadorTarefasService.delete(id);
    }
}
