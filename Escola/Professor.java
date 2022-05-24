package Escola;

import java.util.ArrayList;
import java.util.List;

public class Professor extends  Funcionario{
    protected ArrayList<String> turmas;
    protected ArrayList<Disciplina> listaDisciplinas ;

    public Professor(String nome, String CPF, String RG, String cargo, double salario, ArrayList<String> turmas, ArrayList<Disciplina> listaDisciplinas) {
        super(nome, CPF, RG, "Professor", salario);
        this.turmas = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
    }
    public void adicionarDisciplina(String disciplina){
        Disciplina novaDisciplina = new Disciplina(disciplina);
        if (!verificarDisciplina(novaDisciplina)) {
            this.listaDisciplinas.add(novaDisciplina);
            System.out.println("Disciplina cadastrada!");
        } else {
            System.out.println("Disciplina já existente!");
        }
    }
    public boolean verificarDisciplina(Disciplina disciplina){
        boolean disciplinaRegistrada = false;
        for(Disciplina disciplinaCadastrada: listaDisciplinas){
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
    public ArrayList<String> getTurmas() {
        return turmas;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    //setters
    public void setTurmas(ArrayList<String> turmas) {
        this.turmas = turmas;
    }

    public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Cargo: " + cargo + " - Salário: " + salario + "reais"+ " - CPF: " + CPF +"- RG: "
                + RG +" - Turmas: " + turmas +  "- Lista de disciplinas: " + listaDisciplinas;
    }
}
