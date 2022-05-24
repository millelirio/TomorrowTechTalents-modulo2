package Jogo;

import java.util.Scanner;

public class Jogo {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador1 = new Jogador("Mille", 150);
        Vampiro vampiro = new Vampiro();
        Gigante gigante = new Gigante();
        Generico generico = new Generico();
        Cobra cobra = new Cobra();

        System.out.println("\t PARTIDA");
        System.out.println("Vez do jogador:");
        jogador1.ataque(vampiro, NomeAtaque.PERFURANTE);
        System.out.println("Vez do inimigo:");
        vampiro.ataque(jogador1, NomeAtaque.PERFURANTE);
        System.out.println("Vez do jogador:");
        jogador1.apanhar(gigante, NomeAtaque.FOGO, 20);

        System.out.println();
        System.out.println("Interações:");
        System.out.println("Generico");
        generico.interagir();
        System.out.println("Cobra");
        cobra.interagir();
        System.out.println("Jogador");
        jogador1.interagir();
        System.out.println("Gigante");
        gigante.interagir();
        System.out.println("Vampiro");
        vampiro.interagir();


    }
}
