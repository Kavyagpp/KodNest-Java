
class OrderOfExe {

    static {
        System.out.println("1st static block");
    }

    static {
        System.out.println("2nd static block");
    }

    static {
        System.out.println("3rd static block");
    }

    {
        System.out.println("1st non static block");
    }

    {
        System.out.println("2nd non static block");
    }

    public static void main(String[] args) {
        OrderOfExe o1 = new OrderOfExe();
        OrderOfExe o2 = new OrderOfExe();
        OrderOfExe o3 = new OrderOfExe();
    }
}
