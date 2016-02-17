package com.project.hotel.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.project.hotel.domain.Cidade;
import com.project.hotel.domain.Estado;

/*
 * Classe CidadeDAOteste a fim de realizar testes de CRUD no banco de dados
 * @author Gabriel Zanlorenzi
 * @since Classe criada em 16/02/2016
 */

public class CidadeDAOTest {

	@Test
	@Ignore
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();

		Estado estado = estadoDAO.buscar(2L);

		Cidade cidade = new Cidade();
		cidade.setNome("Londrina");
		cidade.setEstado(estado);

		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}

	@Test
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Código da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 5L;

		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		if (cidade == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Código da Cidade: " + cidade.getCodigo());
			System.out.println("Nome da Cidade: " + cidade.getNome());
			System.out.println("Código do Estado: " + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado: " + cidade.getEstado().getNome());
		}
	}
	
}