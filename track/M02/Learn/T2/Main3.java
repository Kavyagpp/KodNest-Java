
public class Main3 {

    public static void main(String[] args) {
        int day = 6;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Learning day");
                break;
            case 6:
            case 7:
                System.out.println("Revision day");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
