import java.util.Scanner;
public class Det {
        public double det(double[][] a) {
                return (a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]) + a[0][2]*(a[1][0])*a[2][1] - a[1][1]*a[2][0] );
        }
        public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        double[][] det = new double[3][3];
                        Det d = new Det();
                        for(int i=0;i<3;i++)
                                for(int j=0;j<3;j++)
                                        det[i][j]= sc.nextDouble();

                        System.out.println(d.det(det));

                }
}
