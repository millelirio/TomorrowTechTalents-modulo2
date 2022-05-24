package Escola;

import ControleDeEstoque.Produto;

import java.util.Scanner;

public class Funcionario extends Pessoa{
    protected String cargo;
    protected double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String CPF, String RG, String cargo, double salario) {
        super(nome, CPF, RG);
        this.cargo = cargo;
        this.salario = salario;
    }



    //getters
    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    //setters

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Cargo: " + cargo + " - Salário: " + salario + "reais"+ " - CPF: " + CPF +"- RG: "
                + RG;
    }
}
