public class TestaRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(21, 22); // Relogio - contrutor referencia da Classe Relogio

        relogio.setHoras(22);
        relogio.setMinutos(0);

        relogio.imprime();
    }
}
