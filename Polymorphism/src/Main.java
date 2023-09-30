import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Type (A for Adventure, S for SciFi, C for Comedy: ");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                System.out.println("Quitting ...");
                break;
            }
            String title = switch (type){
                case "a" -> "Star Wars";
                case "c" -> "She Hulk";
                case "s" -> "Tenet";
                default -> "General Movie";
            };
            Movie theMovie = Movie.getMovie(type, title);
            theMovie.watchMovie();
        }
    }
}
