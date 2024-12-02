package br.com.anamarques.gerenciamento.de.tarefas.repository;

import br.com.anamarques.gerenciamento.de.tarefas.entity.GerenciadorTarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerenciadorTarefasRepository extends JpaRepository<GerenciadorTarefas, Long> {
}
