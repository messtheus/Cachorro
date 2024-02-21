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
        Shitzu shitzu = new Shitzu("Bento", 1, 5, "Shitzu", "Branco", "Macho", "Reginaldo & Helanya");
        {
            System.out.println(shitzu + "\n");
            shitzu.latir();
            shitzu.comer();
            shitzu.passear();
            shitzu.dormir();
            shitzu.cagar();
            shitzu.mijar();
            shitzu.brincar();
            shitzu.rosnar();
            shitzu.correr();
            shitzu.morder();
            shitzu.ronronar();
            shitzu.cavar();
        }
    }
}