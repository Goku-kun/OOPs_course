import java.util.Scanner;
class Holiday{
  private String name;
  private int day;
  private String month;
  Holiday(String name, int day, String month){
    this.name = name;
    this.day = day;
    this.month = month;
  }
  public static boolean inSamemonth(Holiday a, Holiday b)
  {
    if(a.name == b.name)
      return true;

    return false;
  }

  public static void main(String[] mGoku) {
          Holiday a = new Holiday("January",14, "Sunday");
          Holiday b = new Holiday("February", 13, "Monday");
          Scanner sc= new Scanner(System.in);
          int d;
          String n,m;
          System.out.println("Enter the date, name of the day, and month name respectively");
          d=sc.nextInt();
          n=sc.next();
          m=sc.next();

          Holiday c = new Holiday(m,d,n);
          double avg;
          boolean bo;
          bo=inSamemonth(a,b);
          System.out.println(bo);
          avg=avgDate(new Holiday[] {a,b,c});
          System.out.println(avg);
      }

      public static double avgDate(Holiday[] holidays)
      {
        double sum=0;
        for (Holiday h : holidays)
          sum += h.day;
        return sum/5;

      }
}
