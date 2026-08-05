
public class Main4 {

    public static void main(String[] args) {
        int i = 10;
        int r = i++ + ++i + i++ + i++ + ++i + i++;

        System.out.println(r);
        System.out.println(i);
    }
}
