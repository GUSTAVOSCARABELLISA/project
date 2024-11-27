package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "bibliotech")

public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private String Autor;

	@Column(nullable = false)
	private String titulo;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private int quantidade;

//	@Column(nullable = false )
//	private long bibliotech_id;

	@Column(name = "imag_url")
	private String imagURL; // URL da imagem
	
	public Model() {
	}

	public Model(String autor, String titulo, String nome, int quantidade, String imagURL) {
		Autor = autor;
		this.titulo = titulo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.imagURL = imagURL;
	}

	public Model(Dto d) {
		Autor = d.Autor();
		this.titulo = d.titulo();
		this.nome = d.nome();
		this.quantidade = d.quantidade();
		this.imagURL = d.imagURL();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getImagURL() {
		return imagURL;
	}

	public void setImagURL(String imagURL) {
		this.imagURL = imagURL;
	}
	
	

}
