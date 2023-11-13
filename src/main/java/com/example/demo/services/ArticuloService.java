package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloService implements IArticuloService{
	
	@Autowired
	IArticuloDAO iArticuloDAO;

		//Listar todos
		public List<Articulo> listarArticulos(){
			return iArticuloDAO.findAll();
		};
		
		//Listar por id
		public Articulo articuloXID(Integer id) {
			return iArticuloDAO.findById(id).get();
		}; 
		
		//Guardar
		public Articulo guardarArticulo(Articulo articulo) {
			return iArticuloDAO.save(articulo);
		};
		
		//Actualizar
		public Articulo actualizarArticulo(Articulo articulo) {
			return iArticuloDAO.save(articulo);
		};
		
		//Eliminar
		public void eliminarArticulo(Integer id) {
			iArticuloDAO.deleteById(id);
		}		

}