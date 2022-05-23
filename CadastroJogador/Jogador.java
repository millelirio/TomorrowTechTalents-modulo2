package CadastroJogador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


class Jogador {

    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    double qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    Boolean suspenso;

    void Jogador() {

    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;

    }
        boolean verficicarJogo(){
            if(cartoesAmarelos >=3 || cartaoVermelho == 1) {
                return suspenso = true;
            }
                return suspenso = false;
        }

        String transforDataParaString(){
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String dataFormatada = formato.format(this.dataNascimento);
            return dataFormatada;
        }
        @Override
        public String toString(){
        verficicarJogo();
        if(suspenso){
            return this.posicao +": " + this.id +" - " + this.nome + "(" + this.apelido+ ") " + transforDataParaString() + " CONDIÇÃO: NÃO PODE JOGAR";
        } else {
            return this.posicao +": " + this.id +" - " + this.nome + "(" + this.apelido+ ") " + transforDataParaString()+ " CONDIÇÃO: PODE JOGAR";
        }
        }
        void aplicarCartaoAmarelo(int quantidade){
            this.cartoesAmarelos =+ quantidade;
        }
        void aplicarCartaoVermelho(){
            this.cartaoVermelho = 1;
        }
        void cumprirSuspencao(){
            this.cartaoVermelho = 0;
            this.cartoesAmarelos = 0;
        }
        void sofrerLesao(){
            Random random = new Random();

            int lesao = random.nextInt(100);
            if(lesao <= 5) this.qualidade = this. qualidade - this.qualidade * 0.15;
            else if(lesao <=10) this.qualidade = this. qualidade - this.qualidade * 0.10;
            else if(lesao <=15) this.qualidade = this. qualidade -this.qualidade * 0.05;
            else if(lesao <=30) {
                this.qualidade = this. qualidade -2;
            } else this.qualidade = this. qualidade -1;
        }


}

