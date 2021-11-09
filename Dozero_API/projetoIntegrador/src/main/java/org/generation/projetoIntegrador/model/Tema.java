package org.generation.projetoIntegrador.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_tema")
public class Tema {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank (message = "Campo obrigatório")
	@Size (min = 1, max = 50, message = "Digite no mínimo 1 caractere e no máximo 50")
	private String nome;
	
	@NotBlank(message = "Campo obrigatório")
	@Size (min = 3, max = 500, message = "Digite no mínimo 3 caracteres e no máximo 500")
	private String descricao;
	
	@NotBlank
	private boolean postagensSalvas;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPostagensSalvas() {
		return postagensSalvas;
	}

	public void setPostagensSalvas(boolean postagensSalvas) {
		this.postagensSalvas = postagensSalvas;
	}
}
