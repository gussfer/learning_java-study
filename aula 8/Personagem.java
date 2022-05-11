public class Personagem {
    // atributos
    public String nome;
    public int vida;
    public int forca;
    public float altura;

    // construtor
    public Personagem() {
        nome = "";
        vida = 1;
        forca = 1;
    }

    // construtor
    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    // métodos
    public void imprimir() {
        System.out.println(" Nome: " + nome + " Vida: " + vida + " Força: " + forca + " Altura: " + altura);
    }

    public String toString() {
        return " Nome: " + nome + " Vida: " + vida + " Força: " + forca + " Altura: " + altura;
    }

    // método de interação com objetos
    public void tomarDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            System.out.println(nome + " Morreu");
            vida = 0; // nao deixa ficar negativa
        }
    }

}
