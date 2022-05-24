package Jogo;

public class Cobra extends Personagem{

    public Cobra() {
        this.nome = "Cobra";
        this.vida = 50;
        this.estaMorto = false;
    }

    @Override
    protected void ataque(Personagem personagem, NomeAtaque ataque) {
        System.out.println("Causou 10 de dano");
        System.out.println("Seu personagem está envenenado!");
        if(verificarPersonagem()){
            System.out.println("Cobra está morta!");
            this.estaMorto = true;
        } else {
            interagir();
        }

    }
    @Override
    protected void apanhar(Personagem personagem, NomeAtaque golpe, float dano){
        float danoRecebido = dano;
        if (golpe.equals(NomeAtaque.PANCADA)) {
            danoRecebido = dano*2;
        }
        this.vida =- danoRecebido;
        System.out.println("Recebeu " + golpe + " de dano.");
        System.out.println("Vida: " + this.vida);
        if(verificarPersonagem()){
            System.out.println("Cobra está morto!");
            this.estaMorto = true;
        }


    }
    @Override
    protected void interagir(){
        System.out.println("Se você acender a chama a madilção acaba");
    }
}
