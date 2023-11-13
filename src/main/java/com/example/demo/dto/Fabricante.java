package com.example.demo.dto;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name = "fabricantes")
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@OneToMany
    @JoinColumn(name="id")
	private List<Articulo> articulo;
	
	  public Fabricante() {
	    }
	  
	    public Fabricante(int id, String nombre) {
	    	this.id = id;
	        this.nombre = nombre;	        
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	   
}