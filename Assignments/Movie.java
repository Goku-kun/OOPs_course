import java.util.Scanner;
public class Movie {

  private String title;
  private String studio;
  private String rating;

  Movie(String t, String s, String r){
    title =t;
    studio=s;
    rating=r;
  }
  Movie(String t, String s)
  {
    title = t;
    studio=s;
    rating="PG";
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String t,s,r;
    t=sc.nextLine();
    s=sc.nextLine();
    r=sc.nextLine();
    Movie a = new Movie(t,s,r);
    Movie b = new Movie(t,s);
    String[] pgms = getPG(new Movie[] {a, b});
    for (String m : pgms) {
            System.out.println(m);
    }
  }

  private static String[] getPG(Movie[] movies) {
          String pgMovies = "";
          for (Movie m : movies)
                if (m.rating.equals("PG"))
                        pgMovies += m.title + "-"; // a-b-c
        return pgMovies.split("-");
  }
}
