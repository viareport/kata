package fr.inativ.dojo;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        Integer first = Integer.valueOf(args[0]);
        Integer second = Integer.valueOf(args[1]);
        System.out.println("Resultat = " + app.add(first, second));
    }

    public Integer add(Integer n1, Integer n2) {
        return n1 + n2;
    }
}
