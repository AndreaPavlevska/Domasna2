public class Main {
    public static void main(String[] args) {
    Avtomobil object1 = new Avtomobil();
    object1.marka = "Ford";
    object1.model = "Fiesta";
    object1.km = 90000;

    System.out.println("Marka na avtomobilot e: " + object1.marka);
    System.out.println("Model na avtomobilot e: " + object1.model);
    System.out.println("Pominati kilometri: " + object1.km);
    }
}