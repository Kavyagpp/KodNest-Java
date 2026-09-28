
class Book {

    private int pageNum;

    public void getData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}

public class BookApp1 {

    public static void main(String[] args) {
        Book b = new Book();
        b.getData(100);
        System.out.println(b.getData());
    }
}
