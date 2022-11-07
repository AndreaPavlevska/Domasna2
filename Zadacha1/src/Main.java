public class Main {
    public static void main(String[] args) {

        Student object1 = new Student();
        object1.firstName = "Amdrea";
        object1.lastName = "Pavlevska";
        object1.index = 871;

        System.out.println("Podatoci na prv objekt:");
        System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);

        Student object2 = new Student("Ilcho","Jankulovski",815);

        System.out.println ("Podatoci za vtor objekt:");
        System.out.println (object2.firstName + " " + object2.lastName + " " + object2.index);
    }
}