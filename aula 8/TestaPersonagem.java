public class TestaPersonagem {
    public static void main(String[] args) {
        Personagem p1, p2, p3; // criar referencia (nome para objeto)
        p1 = new Personagem(); // instanciar objeto
        p2 = new Personagem(); // instanciar objeto
        p3 = new Personagem("Gustavo", 10, 100);

        // acessar atributos
        p1.nome = "Mario";
        p1.vida = 10;
        p1.forca = 20;
        p1.altura = (float) 1.90;
        p2.nome = "Chiaradia";
        p2.vida = 3;
        p2.altura = (float) 1.80;
        p2.forca = 100;

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p1.tomarDano(20);
        p2.tomarDano(4);
    }

}
