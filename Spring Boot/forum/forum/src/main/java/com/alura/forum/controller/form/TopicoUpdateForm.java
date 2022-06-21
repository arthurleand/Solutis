package com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.TopicoRepository;

public class TopicoUpdateForm {

	@NotNull
	@NotEmpty
	@Length(min = 10)
	private String mensagem;

	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String titulo;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getReferenceById(id);

		topico.setTitulo(titulo);
		topico.setMensagem(mensagem);

		return topico;
	}

}
