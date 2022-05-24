package Jogo;

public class Generico extends Personagem {

    public Generico() {
    }

    public Generico(float vida) {
        this.nome = "Generico";
        this.vida = 45;
        this.estaMorto = false;
    }

    @Override
    protected void ataque(Personagem personagem, NomeAtaque ataque) {
        System.out.println("Causou 10 de dano");
        if(verificarPersonagem()){
            System.out.println("Genérico está morto!");
            this.estaMorto = true;
        } else {
            interagir();
        }

    }
    @Override
    protected void apanhar(Personagem personagem, NomeAtaque golpe, float dano){
        this.vida =- dano;
        System.out.println("Recebeu " + golpe + " de dano.");
        System.out.println("Vida: " + this.vida);
        if(verificarPersonagem()){
            System.out.println("Genérico está morto!");
            this.estaMorto = true;
        }

    }
    @Override
    protected void interagir(){
        System.out.println("Porque eu responderia meu inimigo???");
    }
}
