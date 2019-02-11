import java.util.Scanner;
public class Student {
        private String name;
        private String r_no;
        static private int count;
        Student(){
                count++;
        }
        Student(String r_no, String name) {
                this.r_no = r_no;
                this.name = name;
                count++;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String r_no=sc.nextLine();
                String name=sc.nextLine();
                Student s = new Student(r_no, name);
                Student s1 = new Student("Vegeta","99BIT016");
                Student s2 = new Student();
                System.out.println(s.name);
                System.out.println(count);

        }
}
