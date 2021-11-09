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
	private long id_tema;
	
	@NotBlank (message = "Campo obrigatório")
	@Size (min = 1, max = 50, message = "Digite no mínimo 1 caractere e no máximo 50")
	private String nome_categoria;
	
	@NotBlank(message = "Campo obrigatório")
	@Size (min = 3, max = 500, message = "Digite no mínimo 3 caracteres e no máximo 500")
	private String descricao_categoria;
	
	@NotBlank
	private boolean postagens_salvas;

	public long getId_tema() {
		return id_tema;
	}

	public void setId_tema(long id_tema) {
		this.id_tema = id_tema;
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public String getDescricao_categoria() {
		return descricao_categoria;
	}

	public void setDescricao_categoria(String descricao_categoria) {
		this.descricao_categoria = descricao_categoria;
	}

	public boolean isPostagens_salvas() {
		return postagens_salvas;
	}

	public void setPostagens_salvas(boolean postagens_salvas) {
		this.postagens_salvas = postagens_salvas;
	}
}
