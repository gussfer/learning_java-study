import java.util.ArrayList;

public class Petshop {
    private ArrayList<Cachorro> cachorros;

    public Petshop() {
        cachorros = new ArrayList<Cachorro>();
    }

    public void add(Cachorro novo) {
        cachorros.add(novo);
    }

    public void listar() {
        for (Cachorro dog : cachorros) // for each: para cada Cachorro "dog" ...

        {
            System.out.println(dog.toString()); // ... printa cada item
        }
    }
}
