
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

class CalApplication {

    public static void main(String[] args) {
        Addition ad = new Addition();
        System.out.println(ad.add(10, 20));
        System.out.println(ad.add(10, 20.5));
    }
}
