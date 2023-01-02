package br.com.maratonajava.poo.associacao.test;

import br.com.maratonajava.poo.associacao.dominio.Aluno;
import br.com.maratonajava.poo.associacao.dominio.Local;
import br.com.maratonajava.poo.associacao.dominio.Professor;
import br.com.maratonajava.poo.associacao.dominio.Seminario;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Local local = new Local("Rua da prata");
        Seminario seminario = new Seminario("Apresentação Java", local);
        Seminario seminario2 = new Seminario("Apresentação Banco de dados", local);

        Aluno aluno = new Aluno("Alison", 18, seminario);
        Aluno aluno2 = new Aluno("Luiz", 25, seminario2);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Professor professor = new Professor("Ivison", "Backend", new Seminario[]{seminario, seminario2});

        professor.imprimir();

    }
}
