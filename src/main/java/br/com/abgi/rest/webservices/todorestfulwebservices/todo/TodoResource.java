package br.com.abgi.rest.webservices.todorestfulwebservices.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.abgi.rest.webservices.todorestfulwebservices.todo.service.TodoHardCodedService;

@CrossOrigin(origins="http://localhost:4200") // Permite que uma porta específica em um dado servidor tenha acesso
@RestController
public class TodoResource {

	@Autowired
	private TodoHardCodedService todoService;

	@GetMapping("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username) {
		return todoService.findAll();
	}
}
