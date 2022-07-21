package br.com.cris.refinado;

import java.io.Serializable;

/*
 * Instituição:      XTI
 * Projeto:          Curso-java
 * Data de criação:  21/07/2022
 * Criador:          CrisMai
 * Revisão:          2
 */

@Cabecalho(instituicao = "XTI", projeto = "Curso-java", dataCriacao = "21/07/2022", criador = "Crismai", revisao = 2)

@ErrosCorrigidos(erros = {"0001", "0002"})
@SuppressWarnings("serial")
public class Anotacao implements Serializable {
	
	@Deprecated
	public void anotar() {}
	
	@Override
	public String toString() {
		return null;
	}

}
