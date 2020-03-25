import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập a");
        double a= sc.nextDouble();
        System.out.println("Nhập b");
        double b= sc.nextDouble();
        System.out.println("Nhập c");
        double c= sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép là: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        }
    }
}
