
public class methds {

    public static void main(String[] args) {
        String str = "KodNest Technologies  ";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        //System.out.println(str.charAt(99));
        System.out.println(str.indexOf('T'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.contains("Nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.replace('e', 'A'));

        System.out.println(str.length());
        System.out.println(str.substring(5));
        System.out.println(str.substring(4, 7));

        String s2 = "Raja";
        System.out.println(s2.isBlank());//false
        System.out.println(s2.isEmpty());//false

        String s3 = " ";
        System.out.println(s3.isBlank());//true
        System.out.println(s3.isEmpty());//false

        String s4 = "";
        System.out.println(s4.isBlank());//true
        System.out.println(s4.isEmpty());//true

        System.out.println(s2.compareTo(s3));// positive
        System.out.println(s3.compareTo(s4));// negative

        System.out.println(str.trim());
    }
}
