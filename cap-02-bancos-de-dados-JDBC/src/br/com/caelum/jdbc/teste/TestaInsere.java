package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.ContatoDao;

public class TestaInsere {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome ("Fulano");
		contato.setEndereco ("Rua 2");
		contato.setEmail("contato@email.com");
		contato.setDataNascimento(Calendar.getInstance());
		
		//gravar nessa conexão
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		System.out.println("Adicionado.");
	}
}
