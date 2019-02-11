import java.util.Scanner;
class Matrix{
        static Matrix[][] a;
        public static  int i,j;
        public static int val;

        Matrix(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of rows and columns");
                i=sc.nextInt();
                j=sc.nextInt();
                this.a = new Matrix[i][j];
        }
        public void get_rows(){
                System.out.println(i+" is the number of rows.");
        }
        public void get_Columns(){
                System.out.println(j+" is the number of columns.");
        }
        public void get_elements(){
                System.out.println("The elements will be read in row major order.");
                Scanner sc = new Scanner(System.in);
                for(int k=0;k<i;k++){
                        for(int l=0;l<j;j++){
                                a[k][l].val = sc.nextInt();
                        }
                }

        }
        public void print_Elements(){
                for(int k=0;k<i;k++){
                        for(int l=0;l<j;j++){
                                System.out.println(a[k][l].val);
                        }
                }
        }
        public static void main(String[] args) {
                        Matrix[][] a = new Matrix();
                        a.get_rows();
                        a.get_Columns();
                        a.get_elements();
        }
}
