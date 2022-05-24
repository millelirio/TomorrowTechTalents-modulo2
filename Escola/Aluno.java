package Escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    protected int idade;
    protected String turma;
    protected ArrayList<Disciplina>  notas;


    public Aluno(String nome, String CPF, String RG, int idade, String turma, ArrayList<Disciplina> notas) {
        super(nome, CPF, RG);
        this.idade = idade;
        this.turma = turma;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(String disciplina, int nota){
        Disciplina novaNota = new Disciplina(disciplina, nota);
        if (verificarDisciplina(novaNota)) {    //se não existir disciplina não dar pra cadastrar nota
            this.notas.add(novaNota);
            System.out.println("Nota cadastrada para disciplina " + disciplina);
        } else {
            System.out.println("A disciplina não existe");
        }
    }
    public boolean verificarDisciplina(Disciplina disciplina){
        boolean disciplinaRegistrada = false;
        for(Disciplina disciplinaCadastrada: notas){
            if (disciplinaCadastrada.getDisciplina().equalsIgnoreCase(disciplina.getDisciplina())){
                disciplinaRegistrada = true;
            }
            else {
                disciplinaRegistrada = false;
            }
        }
        return disciplinaRegistrada;
    }
//getters
    public int getIdade(int idade) {
        return this.idade;
    }

    public String getTurma(String s) {
        return turma;
    }

    public ArrayList<Disciplina> getNotas(ArrayList<Disciplina> notas) {
        return this.notas;
    }
//setters
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNotas(ArrayList<Disciplina> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
         return "Nome: " + nome + " Idade: " + idade + "- CPF: " + CPF +"- RG: "
                + RG +" - Turma: " + turma + "Notas: " + notas;
    }



}
