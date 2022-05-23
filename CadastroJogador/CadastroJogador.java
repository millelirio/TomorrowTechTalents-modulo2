package CadastroJogador;

import java.time.LocalDate;

public class CadastroJogador {
    public static void main (String [] args){
    Jogador[] listaJogadores = new Jogador[11];
    listaJogadores[0] = new Jogador(1,"Washignton Sebastian", "Loco Abreu", LocalDate.of(1976,11,17), 1, "Atacante", 90,0,1);
    listaJogadores[1] = new Jogador(2,"Neymar", "Menino Ney", LocalDate.of(1992,2,5), 10, "Atacante", 40,2,0);
    listaJogadores[2] = new Jogador(3,"Vinicus Junior", "Viny", LocalDate.of(2000,7,12), 18, "Atacante", 80,0,0);
    listaJogadores[3] = new Jogador(4,"Phillipe Coutinho", "Phil", LocalDate.of(1992,6,12), 23, "Meia", 85,1,0);
    listaJogadores[4] = new Jogador(5,"Alisson Becker", "Ali", LocalDate.of(1992,10,2), 1, "Goleiro", 95,0,0);
    listaJogadores[5] = new Jogador(6,"Daniel Alves", "Dan", LocalDate.of(1983,5,6), 8, "Defensor", 55,1,1);
    listaJogadores[6] = new Jogador(7,"Lucas Paquetá", "Paquetá", LocalDate.of(1997,8,27), 17, "Meia", 85,1,0);
    listaJogadores[7] = new Jogador(8,"Gilvanildo Vieira", "Hulk", LocalDate.of(1986,7,25), 7, "Atacante", 70,0,0);
    listaJogadores[8] = new Jogador(9,"Roberto Firmino", "Firmino", LocalDate.of(1991,10,2), 9, "Atacante", 40,2,0);
    listaJogadores[9] = new Jogador(10,"Claudio Luis", "Claudinho", LocalDate.of(1997,1,28), 11, "Meia", 40,2,0);
    listaJogadores[10] = new Jogador(11,"Matheus Nunes", "Nunes", LocalDate.of(1998,8,17), 7, "Meia", 45,2,0);

    listaJogadores[10].aplicarCartaoVermelho();
    listaJogadores[8].aplicarCartaoAmarelo(2);
    listaJogadores[10].cumprirSuspencao();
    listaJogadores[10].sofrerLesao();
        for(int i =0; i<11 ; i++){
        System.out.println(listaJogadores[i]);
    }
        System.out.println("Depois da lesão o jogador " + listaJogadores[10].nome + " esta com a qualidade de: " + listaJogadores[10].qualidade);

}

}
