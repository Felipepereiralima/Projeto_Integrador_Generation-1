package org.generation.projetoIntegrador.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "tb_usuario")
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Email(message = "O email digitado deverá ser um e-mail válido")
	@NotBlank(message = "Campo obrigatório")
	@Size(min = 10, max = 50, message = "O campo deverá conter no minímo 10 e no maximo 50 caracteres")
	private String email;
	
	@NotBlank(message = "Campo obrigatório")
	@Size(min = 2, max = 50, message = "O campo deverá conter no minímo 10 e no maximo 50 caracteres")
	private String nome;
	
	
	@NotBlank(message = "Campo obrigatório")
	@Size(min = 2, max = 50, message = "O campo deverá conter no minímo 10 e no maximo 50 caracteres")
	private String senha;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	
	

}
