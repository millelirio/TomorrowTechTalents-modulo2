package Escola;

public class Disciplina {
    protected String disciplina;
    protected double nota = 0;

    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public Disciplina(String disciplina, double nota) {
        this(disciplina);
        this.nota = nota;
    }



    //getters
    public String getDisciplina() {
        return disciplina;
    }

    public double getNota() {
        return nota;
    }
    //setters

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
