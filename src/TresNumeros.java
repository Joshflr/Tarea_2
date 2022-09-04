import java.util.Scanner;

public class TresNumeros {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        n3 = sc.nextInt();
        sc.close();

        if (n1 > n2 && n2>n3) {
            System.out.println(n1 + " - "+n2+" - "+n3);
        }else{
            if (n1> n2 && n3>n2) {
                System.out.println(n1 + " - "+n3+" - "+n2);
                 //Termina Combinaciones para N1 mayor que todos
            } else {
                if (n2>n1 && n1>n3) {
                    System.out.println(n2 + " - "+n1+" - "+n3);
                }else{
                    if (n2>n3 && n3>n1) {
                        System.out.println(n2 + " - "+n3+" - "+n1);
                    //Termina Combinaciones para N2 mayor que todos
                    } else {
                        if (n3>n2 && n2>n1) {
                            System.out.println(n3 + " - "+n2+" - "+n1);
                        } else {
                            if (n3>n2 && n2>n1) {
                                System.out.println(n3 + " - "+n1+" - "+n2);
                            }
                        }
                    }
                }
            }
        }
    }
}

