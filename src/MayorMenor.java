import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        n2 = sc.nextInt();

        if (n1>n2) {
            System.out.println(n1+ " - "+n2);
        } else {
            System.out.println(n2+ " - "+n1);
        }
        sc.close();
    }
}
