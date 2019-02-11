import java.util.Scanner;
class Employee{
        private static int sal, hours;
        Employee(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the salary of the Employee:");
                sal=sc.nextInt();
                System.out.println("Enter the work hours of the Employee:");
                hours=sc.nextInt();
        }
        public void getInfo(int sal, int hours){
                this.sal=sal;
                this.hours=hours;
        }
        public void addSal(){
                if(sal<500){
                        sal+=10;
                }
        }
        public void addWork(){
                if(hours>6){
                        sal+=5;
                }
        }
        public void print(){
                System.out.println(sal);
                System.out.println(hours);
        }
        public static void main(String[] args) {
                Employee a = new Employee();
                a.getInfo(sal, hours);
                a.addSal();
                a.addWork();
                a.print();
                Employee b = new Employee();
                b.getInfo(sal, hours);
                b.addSal();
                b.addWork();
                b.print();
        }
}
