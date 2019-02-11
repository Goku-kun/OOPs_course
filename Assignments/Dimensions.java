import java.util.Scanner;
import java.lang.Math;
public class Dimensions {
        public static void main(String[] args) {
                double rc, hc, l;
                double r,h;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the parameters in the given sequence. For cone, radius, height and slant height. For Cylinder, radius and height.");
                rc = sc.nextDouble();
                hc = sc.nextDouble();
                l = sc.nextDouble();
                r = sc.nextDouble();
                h = sc.nextDouble();
                Cone cone = new Cone(rc, hc, l);
                Cylinder cylinder = new Cylinder(r,h);
                System.out.println("The area of cone is "+cone.area()+" and the volume is "+cone.volume());
                System.out.println("The area of cylinder is "+cylinder.area()+" and the volume is "+cylinder.volume());
        }
}
abstract class Shape {
        abstract public double area();
        abstract public double volume();
}
class Cone extends Shape {
        double r,h,l;
        Cone(double r, double h, double l) {
                this.r = r;
                this.h = h;
                this.l = l;
        }
        public double area() {
                return Math.PI*r*l;
        }
        public double volume() {
                return Math.PI*r*r*h*(1/3);
        }
}
class Cylinder extends Shape {
        double r,h;
        Cylinder(double r, double h) {
                this.r = r;
                this.h=h;
        }
        public double area() {
                return (2* Math.PI*r*(h+r));
        }
        public double volume() {
                return Math.PI*r*r*h;
        }
}
