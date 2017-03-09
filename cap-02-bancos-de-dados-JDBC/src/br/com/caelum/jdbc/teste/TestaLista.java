package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.ContatoDao;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		//adiciona contato
		Contato novo = new Contato();
		/*novo.setNome("Fulano2");
		novo.setDataNascimento(Calendar.getInstance());
		novo.setEmail("email@email.com");
		novo.setEndereco("Rua 3");*/
		novo.setId(new Long(1));
		//dao.adiciona(novo);
		
		dao.remove(novo);
		//get list
		List<Contato> contatos = dao.getLista();
		
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " +
			contato.getDataNascimento().getTime() + "\n\n");
		}

	}

}
