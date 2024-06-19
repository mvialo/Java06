package quete06;

public class Classroom {

    //méthodes

    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Manuella", false);
        Wilder wilder2 = new Wilder("Marie", false);
        Wilder wilder3 = new Wilder("Annaelle", true);
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());

        
    }
}