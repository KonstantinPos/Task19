public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28800);
        if (n > 25200 && n < 28800) {
            System.out.println(n);
            System.out.println("Осталось 8 часов");
        }
        if (n > 21600 && n < 25200) {
            System.out.println(n);
            System.out.println("Осталось 7 часов");
        }
        if (n > 18000 && n < 21600) {
            System.out.println(n);
            System.out.println("Осталось 6 часов");
        }
        if (n > 14400 && n < 18000) {
            System.out.println(n);
            System.out.println("Осталось 5 часов");
        }
        if (n > 10800 && n < 14400) {
            System.out.println(n);
            System.out.println("Осталось 4 часа");
        }
        if (n > 7200 && n < 10800) {
            System.out.println(n);
            System.out.println("Осталось 3 часа");
        }
        if (n > 3600 && n < 7200) {
            System.out.println(n);
            System.out.println("Осталось 2 часа");
        }
        if (n > 0 && n < 3600) {
            System.out.println(n);
            System.out.println("Осталось менее часа");
        }
    }
}
