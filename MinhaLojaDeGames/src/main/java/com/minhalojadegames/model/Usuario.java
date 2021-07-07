package com.minhalojadegames.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotNull
	@Email
	private String Login;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String usuario;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String senha;
	
	@Column(name = "dt_aniversario")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataAniversario;
	
	public Usuario() {
		
	}
	
	public Usuario(long id, String nome, String login, String senha, boolean admin, LocalDate dataAniversario) {
		this.id = id;
		this.nome = nome;
		this.Login = login;
		this.senha = senha;
		this.admin = admin;
		this.dataAniversario = dataAniversario;
	}
	
	@NotNull
	private boolean admin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
