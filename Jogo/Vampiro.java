package Jogo;

public class Vampiro extends Personagem{

    public Vampiro() {
        this.nome = "Vampiro";
        this.vida = 100;
        this.estaMorto = false;
    }

    @Override
    protected void ataque(Personagem personagem, NomeAtaque ataque) {
        System.out.println("Causou 20 de dano");
        System.out.println("Seu personagem está sangrando!");
        if(verificarPersonagem()){
            System.out.println("Vampiro está morto!");
            this.estaMorto = true;
        } else {
            interagir();
        }

    }
    @Override
    protected void apanhar(Personagem personagem, NomeAtaque golpe, float dano){
        float danoRecebido = dano;
        if (golpe.equals(NomeAtaque.PERFURANTE)) {
            danoRecebido = dano*2;
        }
        this.vida =- danoRecebido;
        System.out.println("Recebeu " + golpe + " de dano.");
        System.out.println("Vida: " + this.vida);
        if(verificarPersonagem()){
            System.out.println("Vampiro está morto!");
            this.estaMorto = true;
        }


    }
    @Override
    protected void interagir(){
        System.out.println("O que é um homem?");
    }

}
