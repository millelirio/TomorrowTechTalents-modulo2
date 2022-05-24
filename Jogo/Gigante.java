package Jogo;

public class Gigante  extends  Personagem{


    public Gigante() {
        this.nome = "Gigante";
        this.vida = 150;
        this.estaMorto = false;
    }

    @Override
    protected void ataque(Personagem personagem, NomeAtaque ataque) {
        System.out.println("Causou 25 de dano");
        System.out.println("Seu personagem está atordoado!");
        if(verificarPersonagem()){
            System.out.println("Gigante está morto!");
            this.estaMorto = true;
        } else {
            interagir();
        }

    }
    @Override
    protected void apanhar(Personagem personagem, NomeAtaque golpe, float dano){
        float danoRecebido = dano;
        if (golpe.equals(NomeAtaque.FOGO)) {
            danoRecebido = dano*2;
        }
        this.vida =- danoRecebido;
        System.out.println("Recebeu " + golpe + " de dano.");
        System.out.println("Vida: " + this.vida);
        if(verificarPersonagem()){
            System.out.println("Gigante está morto!");
            this.estaMorto = true;
        }

    }
    @Override
    protected void interagir(){
        System.out.println("Me desculpe");
    }
}
