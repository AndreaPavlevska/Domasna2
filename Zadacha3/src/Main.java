public class Main {
    public static void main(String[] args) {
        Chovek object1 = new Chovek();
        object1.firstName = "Andrea";
        object1.lastName = "Pavlevska";
        object1.matichen = "2610002415003";

        System.out.println("Imeto na chovekot e: " + object1.firstName);
        System.out.println("Prezimeto na chovekot e: " + object1.lastName);
        System.out.println("Chovekot ima matichen broj: " + object1.matichen);
    }
}