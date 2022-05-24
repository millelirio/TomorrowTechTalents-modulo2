package Escola;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEscola {
    public static void main( String[] args) {
        ArrayList<Aluno> alunos =new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Escola escola = new Escola(alunos, professores, funcionarios);

        //Aluno
        System.out.println("Testando adicionar alunos");
        escola.adicionarAluno("Millena", "054874", "54414", 24, "B6",new ArrayList<>());
        escola.adicionarAluno("João", "055544", "58744", 27, "B8",new ArrayList<>());
        System.out.println("Testando atualizar alunos:");
        escola.atualizarAluno("Maria", "054874", "54574", 22, "B8",new ArrayList<>());
        String  procurarA = escola.procurarAluno("054874");
        System.out.println("Testando procurar aluno: " + procurarA );
        System.out.println("Testando lista alunos:");
        escola.listarAlunos();
        System.out.println("Testando remover aluno: ");
        escola.removerAluno("055544");
        System.out.println("Testando listar alunos depois de remover:");
        escola.listarAlunos();

        //Professor
        System.out.println("Testando adicionar professor");
        escola.adicionarProfessor("Mike", "057774", "54425", "Professor", 1500, new ArrayList<>(),new ArrayList<>());
        escola.adicionarProfessor("Kaio", "011074", "77445", "Professor", 1800, new ArrayList<>(),new ArrayList<>());
        System.out.println("Testando atualizar alunos:");
        escola.atualizarProfessor("Mike", "011074", "54425", "Professor", 1500, new ArrayList<>(),new ArrayList<>());
        String  procurarP = escola.procurarProfessor("011074");
        System.out.println("Testando procurar professor: " + procurarP);
        System.out.println("Testando lista professores:");
        escola.listarProfessores();
        System.out.println("Testando remover professor: ");
        escola.removerProfessor("057774");
        System.out.println("Testando listar professores depois de remover:");
        escola.listarProfessores();



    }
}
