package Jogo;

abstract class Personagem {
    protected String nome;
    protected  float vida;
    protected boolean estaMorto;

    public Personagem() {

    }

    public Personagem(String nome, float vida, boolean estaMorto) {
        this.nome = nome;
        this.vida = vida;
        this.estaMorto = estaMorto;
    }
    //interações
    abstract void ataque(Personagem personagem, NomeAtaque ataque);
    abstract void apanhar(Personagem pesonagem, NomeAtaque golpe, float dano);
    abstract void interagir();

    //verificar vida do personagem
    boolean verificarPersonagem(){
        if(this.vida < 0){
            return true;
        }
        return false;
    }
    //getters
    public String getNome() {
        return nome;
    }

    public float getVida() {
        return vida;
    }

    public boolean isEstaMorto() {
        return estaMorto;
    }
    //setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public void setEstaMorto(boolean estaMorto) {
        this.estaMorto = estaMorto;
    }
}
