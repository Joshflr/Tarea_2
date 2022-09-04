import java.util.Scanner;

public class Fecha {
    public static void main(String[] args) {
        int dia, mes, año;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dia: ");
        dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        año = sc.nextInt();
        sc.close();

        if (año > 1000) {
          if (mes > 0 && mes <= 12) {
            if (dia > 0 && dia <= 31) {
                switch (mes) {
                    case 1:
                    if (dia <=31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 2:
                    if (dia <= 28) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 3:
                    if (dia <= 31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 4:
                    if (dia <= 30) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 5:
                    if (dia <= 31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 6:
                    if (dia <= 30) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 7:
                    if (dia <= 31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 8:
                    if (dia <= 31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 9:
                    if (dia <= 30) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 10:
                    if (dia <= 31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 11:
                    if (dia <= 30) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    case 12:
                    if (dia <= 31) {
                        System.out.println("La Fecha Ingresada es: ");
                        System.out.println(dia+" / "+mes+" / "+año);
                    }else{
                        System.out.println("Fecha Incorrecta | Ingreso mal el numero de mes");
                    }
                        break;
                    default:
                    System.out.println("Fecha incorrecta | Ingreso mal el numero de mes");
                        break;
                }
            }else{
                System.out.println("Fecha incorrecta | Ingreso mal el numero de dia");
            }
          }else{
            System.out.println("Fecha incorrecta | Ingreso mal el numero de mes");
          }
        }else{
            System.out.println("Fecha incorrecta | Ingreso mal el numero de año");
        }
    }
}
