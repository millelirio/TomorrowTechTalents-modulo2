package Escola;

public class Pessoa {
    protected String nome;
    protected String CPF;
    protected String RG;


    public Pessoa(){

    }
    public Pessoa(String nome, String CPF, String RG){
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }
    //getters
    public String getNome(String nome) {
        return this.nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG(String RG) {
        return this.RG;
    }
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + "- CPF: " + CPF + "RG: " + RG;
    }


}
