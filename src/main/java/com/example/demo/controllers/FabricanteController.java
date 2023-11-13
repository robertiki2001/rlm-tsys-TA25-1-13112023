package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Fabricante;
import com.example.demo.services.FabricanteService;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteService fabricanteService;

	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricanteService.listarFabricantes();
	}

	@GetMapping("/fabricante/{id}")
	public Fabricante fabricanteXID(@PathVariable(name = "id") Integer id) {
		return fabricanteService.fabricanteXID(id);
	}

	@PostMapping("/fabricante")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteService.guardarFabricante(fabricante);
	}

	@PutMapping("/fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name = "id") Integer id, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_seleccionado = fabricanteService.fabricanteXID(id);
		Fabricante fabricante_actualizado = new Fabricante();

		fabricante_seleccionado.setNombre(fabricante.getNombre());

		fabricante_actualizado = fabricanteService.actualizarFabricante(fabricante_seleccionado);

		return fabricante_actualizado;
	}

	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable Integer id) {
		fabricanteService.eliminarFabricante(id);
	}

}
