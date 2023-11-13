package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Articulo;
import com.example.demo.services.ArticuloService;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloService articuloService;

	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		return articuloService.listarArticulos();
	}

	@GetMapping("/articulo/{id}")
	public Articulo articuloXID(@PathVariable(name = "id") Integer id) {
		return articuloService.articuloXID(id);
	}

	@PostMapping("/articulo")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloService.guardarArticulo(articulo);
	}

	@PutMapping("/articulo/{id}")
	public Articulo actualizarArticulo(@PathVariable(name = "id") Integer id, @RequestBody Articulo articulo) {

		Articulo articulo_seleccionado = articuloService.articuloXID(id);
		Articulo articulo_actualizado = new Articulo();

		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());

		articulo_actualizado = articuloService.actualizarArticulo(articulo_seleccionado);

		return articulo_actualizado;
	}

	@DeleteMapping("/articulo/{id}")
	public void eliminarArticulo(@PathVariable Integer id) {
		articuloService.eliminarArticulo(id);
	}

}
