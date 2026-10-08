
class Developer {

    void work() {
        System.out.println("Developer working");
    }

    void project() {
        System.out.println("Developer doing project");
    }
}

class JavaDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("javadeveloper working");
    }

    @Override
    void project() {
        System.out.println("java developer doing project");
    }
}

class PythonDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("python developer is working");
    }

    @Override
    void project() {
        System.out.println("python developer is doing project");
    }
}

public class Main4 {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}
