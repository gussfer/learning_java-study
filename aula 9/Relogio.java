public class Relogio {
    private int horas; // atributo
    private int minutos; // atributo

    // construtor
    public Relogio(int horas, int minutos) {
        setHoras(horas);
        setMinutos(minutos);
    }

    // metodos de acesso (set e get)
    public void setHoras(int h) {
        if (h >= 0 && h <= 23)
            horas = h;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59)
            this.minutos = minutos; // this. - padrão para utilizar o atributo definido, no caso: minutos
    }

    public int getHoras() {return horas;}
    public int getMinutos() {return minutos;}

    public void imprime() {
        System.out.print(horas + ":" + minutos);
    }
}
