package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Fabricante;


public interface IFabricanteService {
	
		//Listar todos
		public List<Fabricante> listarFabricantes();
		
		//Listar por id
		public Fabricante fabricanteXID(Integer id); 
		
		//Guardar
		public Fabricante guardarFabricante(Fabricante fabricante);
		
		//Actualizar
		public Fabricante actualizarFabricante(Fabricante fabricante);
		
		//Eliminar
		public void eliminarFabricante(Integer id);

}