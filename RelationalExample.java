public class RelationalExample {
    public static void main(String[] args) {
        int x = 15;
        int y = 15;
        int z = 30;

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        //Equality & Inequality
        System.out.println("x==y: " + (x==y));
        System.out.println("x!=y: " + (x!=y));

        //comparison
        System.out.println("x>z: " + (x>z));
        System.out.println("x<z: " + (x<z));

        //Inclusive comparison
        System.out.println("x>=y: " + (x>=y));
        System.out.println("x<=z: " + (x<=z));

        //Logical operators
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}

