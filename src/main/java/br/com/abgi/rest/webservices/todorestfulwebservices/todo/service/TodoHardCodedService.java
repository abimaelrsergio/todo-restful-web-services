package br.com.abgi.rest.webservices.todorestfulwebservices.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.abgi.rest.webservices.todorestfulwebservices.todo.Todo;

@Service
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "Guarda Civil", "Uma imagem na camisa de um artista", new Date(), false));
		todos.add(new Todo(++idCounter, "Guarda Militar", "No brasil nao esta funcionando", new Date(), false));
		todos.add(new Todo(++idCounter, "Guarda-Chuva", "Esse funciona", new Date(), false));
		todos.add(new Todo(++idCounter, "Guarda-costas", "Só pra ricos", new Date(), false));
	}

	public Todo save(Todo todo) {

		if (todo.getId() == -1) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

	public List<Todo> findAll() {
		return todos;
	}

	public Todo deleteById(long id) {

		Todo todo = findById(id);

		if (todo == null)
			return null;

		if (todos.remove(todo))
			return todo;

		return null;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}

}
