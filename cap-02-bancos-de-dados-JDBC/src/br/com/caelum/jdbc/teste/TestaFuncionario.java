package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.modelo.Funcionario;
import br.com.caelum.jdbc.modelo.FuncionarioDao;

public class TestaFuncionario {
	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Fulano de Tal");
		funcionario.setUsuario("xpto");
		funcionario.setSenha("ha@%#&*2");
		
		dao.adiciona(funcionario);
		List<Funcionario> funcionarios = dao.getLista();
		
		for (Funcionario item : funcionarios) {
			System.out.println(item.getId());
			System.out.println(item.getNome());
			System.out.println(item.getUsuario());
			System.out.println(item.getSenha() + "\n\n");
		}
	}
}
