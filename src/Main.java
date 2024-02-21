public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Marley", 2, 10, "Cockspain Ingles", "Preto", "Macho", "Isaac");
        {

            System.out.println(cachorro + "\n");
            cachorro.latir();
            cachorro.comer();
            cachorro.passear();
            cachorro.dormir();
            cachorro.cagar();
            cachorro.mijar();
            cachorro.brincar();
            cachorro.rosnar();
            cachorro.correr();
            cachorro.morder();
        }
    }
}