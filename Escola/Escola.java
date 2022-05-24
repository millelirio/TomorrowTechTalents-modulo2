package Escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    public ArrayList<Aluno> alunos;
    public ArrayList<Professor> professores;
    public  ArrayList<Funcionario> funcionarios;

    public Escola(ArrayList<Aluno> alunos, ArrayList<Professor> professores, ArrayList<Funcionario> funcionarios) {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }
    //alunos
    void adicionarAluno(String nome, String CPF, String RG, int idade, String turma, ArrayList<Disciplina> notas) {
        Aluno novoAluno = new Aluno(nome, CPF, RG, idade, turma, notas);
        if(!verificarAluno(novoAluno)){
            this.alunos.add(novoAluno);
            System.out.println("Aluno cadastrado com sucesso!");

        } else {
            System.out.println("O aluno já é cadastrado!");
        }

    }
    void atualizarAluno(String nome, String CPF, String RG, int idade, String turma, ArrayList<Disciplina> notas){
        Scanner sc = new Scanner(System.in);
        for( Aluno alunoCadastrado: alunos){
            if(alunoCadastrado.getCPF() == CPF){
                alunoCadastrado.setNome(nome);
                alunoCadastrado.setIdade(idade);
                alunoCadastrado.setRG(RG);
                alunoCadastrado.setTurma(turma);
                alunoCadastrado.setNotas(notas);

            }
        }
    }
    void removerAluno(String CPF){
        for (Aluno alunoCadastrado : alunos){
            if(verificarAluno(alunoCadastrado)){
                if(alunoCadastrado.getCPF() == CPF){
                    this.alunos.remove(alunoCadastrado);
                    System.out.println("Aluno removido!!");
                }
            }
            else {
                System.out.println("Não foi possível encontrar o aluno! ");
            }
        }
    }
    void listarAlunos() {
        if (this.alunos.isEmpty()) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            for (Aluno alunoCadastrado : alunos) {
                System.out.println(alunoCadastrado.toString());
            }

        }
    }
    String procurarAluno(String CPF) {
        String aluno = "";
        for (Aluno alunoCadastrado : alunos) {
            if (alunoCadastrado.getCPF() == CPF) {
                if (verificarAluno(alunoCadastrado)) {
                   //System.out.println(alunoCadastrado.toString());
                    aluno = alunoCadastrado.toString();
                } else {
                    //System.out.println("Este aluno não está cadastrado!");
                    aluno ="Este aluno nao está cadastrado!";
                }
            }
        }
        return aluno;
    }

    public boolean verificarAluno(Aluno aluno){
        boolean alunoRegistrado = false;
        for(Aluno alunoCadastrado : alunos){
            if (alunoCadastrado.getCPF().equalsIgnoreCase(aluno.getCPF())){
                alunoRegistrado = true;
            }
            else {
                alunoRegistrado = false;
            }
        }
        return alunoRegistrado;
}
//Funcionários


    void procurarFuncionario(String CPF) {
        for (Funcionario funcionarioCadastrado : funcionarios) {
            if (funcionarioCadastrado.getCPF() == CPF) {
                if (verificarFuncionario(funcionarioCadastrado)) {
                    System.out.println(funcionarioCadastrado.toString());
                } else {
                    System.out.println("Este funcionario não está cadastrado!");
                }
            }
        }
    }
}
    void adicionarFuncionario(String nome, String CPF, String RG, String cargo, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, CPF, RG, cargo, salario);
        if(!verificarFuncionario(novoFuncionario)){
            this.funcionarios.add(novoFuncionario);
            System.out.println("Funcionário cadastrado com sucesso!");

        } else {
            System.out.println("O funcionário já é cadastrado!");
        }

    }
    void atualizarFuncionario(String nome, String CPF, String RG, String cargo, double salario){
        for( Funcionario funcionarioCadastrado: funcionarios){
            if(funcionarioCadastrado.getCPF() == CPF){
                funcionarioCadastrado.setNome(nome);
                funcionarioCadastrado.setCargo(cargo);
                funcionarioCadastrado.setRG(RG);
                funcionarioCadastrado.setSalario(salario);


            }
        }
    }
    void removerFuncionário(String CPF){
        for (Funcionario funcionarioCadastrado : funcionarios){
            if(verificarFuncionario(funcionarioCadastrado)){
                if(funcionarioCadastrado.getCPF() == CPF){
                    this.funcionarios.remove(funcionarioCadastrado);
                    System.out.println("Funcionários removido!!");
                }
            }
            else {
                System.out.println("Não foi possível encontrar o funcionário! ");
            }
        }
    }
    void listarFuncionario() {
        if (this.funcionarios.isEmpty()) {
            System.out.println("Não existem funcionários cadastrados!");
        } else {
            for (Funcionario funcionarioCadastrado : funcionarios) {
                System.out.println(funcionarioCadastrado.toString());
            }

        }
    }
    public boolean verificarFuncionario(Funcionario funcionario) {
        boolean funcionarioRegistrado = false;
        for (Funcionario funcionarioCadastrado : funcionarios) {
            if (funcionarioCadastrado.getCPF().equalsIgnoreCase(funcionario.getCPF())) {
                funcionarioRegistrado = true;
            } else {
                funcionarioRegistrado = false;
            }
        }
        return funcionarioRegistrado;
    }
// Professores
void adicionarProfessor(String nome, String CPF, String RG, String cargo, double salario, ArrayList<String> turmas, ArrayList<Disciplina> listaDisciplinas) {
    Professor novoProfessor = new Professor(nome, CPF, RG,"Professor", salario, turmas, listaDisciplinas);
    if(!verificarProfessor(novoProfessor)){
        this.professores.add(novoProfessor);
        System.out.println("Professor cadastrado com sucesso!");

    } else {
        System.out.println("O professor já é cadastrado!");
    }

}
    void atualizarProfessor(String nome, String CPF, String RG, String cargo, double salario, ArrayList<String> turmas, ArrayList<Disciplina> listaDisciplinas){
        Scanner sc = new Scanner(System.in);
        for( Professor professorCadastrado: professores){
            if(professorCadastrado.getCPF() == CPF){
                professorCadastrado.setNome(nome);
                professorCadastrado.setCargo("Professor");
                professorCadastrado.setRG(RG);
                professorCadastrado.setSalario(salario);
                professorCadastrado.setTurmas(turmas) ;
                professorCadastrado.setListaDisciplinas(listaDisciplinas);

            }
        }
    }
    void removerProfessor(String CPF){
        for (Professor professorCadastrado : professores){
            if(verificarProfessor(professorCadastrado)){
                if(professorCadastrado.getCPF() == CPF){
                    this.professores.remove(professorCadastrado);
                    System.out.println("Professor removido!!");
                }
            }
            else {
                System.out.println("Não foi possível encontrar o professor! ");
            }
        }
    }
    void listarProfessores() {
        if (this.professores.isEmpty()) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            for (Professor professorCadastrado : professores) {
                System.out.println(professorCadastrado.toString());
            }

        }
    }
    String procurarProfessor(String CPF) {
        String professor = "";
        for (Professor professorCadastrado : professores) {
            if (professorCadastrado.getCPF() == CPF) {
                if (verificarProfessor(professorCadastrado)) {
                    //System.out.println(professorCadastrado.toString());
                    professor = professorCadastrado.toString();
                } else {
                    System.out.println("Este professor não está cadastrado!");
                    professor = "Este professor não está cadastrado";
                }
            }
        }
        return professor;
    }

    public boolean verificarProfessor(Professor professor){
        boolean professorRegistrado = false;
        for(Professor professorCadastrado : professores){
            if (professorCadastrado.getCPF().equalsIgnoreCase(professor.getCPF())){
                professorRegistrado = true;
            }
            else {
                professorRegistrado = false;
            }
        }
        return professorRegistrado;
    }

}