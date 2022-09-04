import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer numero: ");
        n1 =  sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        n2 = sc.nextInt();

        if (n1!= n2) {
            System.out.println("Son numeros diferentes.");
        } else {
            System.out.println("Son numeros iguales.");
        }
        sc.close();
    }
}
