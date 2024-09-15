
class Movie {
    String title;
    String genre;
    String showtime;

    public void showObjectCreated() {
        System.out.println("A Movie object has been created.");
    }
}

public class Main {
    public static void main(String[] args) {


        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        movie1.showObjectCreated();
        movie2.showObjectCreated();
    }
}
