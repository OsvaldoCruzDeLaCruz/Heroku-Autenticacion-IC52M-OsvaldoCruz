package osvaldo.cruz.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import osvaldo.cruz.org.model.Producto;
import osvaldo.cruz.org.service.IntProductoService;


@Controller
public class HomeController {
	
	@Autowired
	private IntProductoService productosService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@GetMapping("/")
	public String mostrarindex(Model model) {
		List<Producto> lista = productosService.obtenerTodos();
		model.addAttribute("productos", lista);
		
		return "home";
	}
}
