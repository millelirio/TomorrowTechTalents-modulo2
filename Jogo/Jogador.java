package Jogo;

public class Jogador extends Personagem{

    public Jogador() {
    }

    public Jogador(String nome, float vida) {
        this.nome = nome;
        this.vida = vida;
        this.estaMorto = false;
    }

    @Override
    protected void ataque(Personagem personagem, NomeAtaque ataque) {
        if(verificarPersonagem()){
            System.out.println(this.nome +" está morto!");
            this.estaMorto = true;
        } else {
            System.out.println( this.nome + " causou um dano de 10");
            interagir();
        }

    }
    @Override
    protected void apanhar(Personagem personagem, NomeAtaque golpe, float dano){
        this.vida =- dano;
        System.out.println("Recebeu " + golpe + " de dano.");
        System.out.println("Vida: " + this.vida);
        if(verificarPersonagem()){
            System.out.println(this.nome + " está morto!");
            this.estaMorto = true;
        }



    }
    @Override
    protected void interagir(){
        System.out.println("Não sou fácil de morrer HAHAHAHA");
    }

}
