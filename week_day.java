public class week_day {
    public static void main(String[] args) {
        int a=2;
        switch (a) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("thuersday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("tharsday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Enter the correct number--:");
        }
    }
}
