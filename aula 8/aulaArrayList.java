import java.util.ArrayList;

public class aulaArrayList {
    public static void main(String[] args) {
        //Metodos de Array list - https://www.w3schools.com/java/java_arraylist.asp 
        ArrayList<String> names;
        names = new ArrayList();
        names.add("Gustavo");
        names.add("Laura");
        names.add("Giovanna");
        names.add("Thiago");
        names.add(0,"Laura");
        names.remove("Laura");
        String name = names.get(1);
        System.out.println(names.size());
        //Percorrer lista
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
    }
        //Percorrer lista com for each
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        for (String i : carros) {
        System.out.println(i);
    }
        //Length String
        String [] nomeCompleto = {"Gustavo", "De", "Oliveira", "Ferreira"};
        int tNome = nomeCompleto.length;
        System.out.println("Meu nome tem " + tNome + " nomes");
  } 
  
}
