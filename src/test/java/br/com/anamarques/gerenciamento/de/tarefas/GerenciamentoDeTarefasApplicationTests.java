package br.com.anamarques.gerenciamento.de.tarefas;

import br.com.anamarques.gerenciamento.de.tarefas.entity.GerenciadorTarefas;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GerenciamentoDeTarefasApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateSucess() {
		var todo = new GerenciadorTarefas("todo 1", "descricao", "PENDENTE");
		webTestClient
				.post()
				.uri("/gerenciadorTarefas")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].titulo").isEqualTo(todo.getTitulo())
				.jsonPath("$[0].descricao").isEqualTo(todo.getDescricao())
				.jsonPath("$[0].status").isEqualTo(todo.getStatus());
	}

	@Test
	public void testCreateFailure() {
		webTestClient
				.post()
				.uri("/gerenciadorTarefas")
				.bodyValue(
						new GerenciadorTarefas("", "", "PENDENTE"))
				.exchange()
				.expectStatus().isBadRequest();
	}
}