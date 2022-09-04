import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else{
            System.out.println("El numero es negativo");
        }
        sc.close();
    }
}
