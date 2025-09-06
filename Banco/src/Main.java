import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(0.0);

        Consultar consu = new Consultar();
        Depositar deposito = new Depositar();
        Retirar reti = new Retirar();

        int opcion;
        do {
            System.out.println("\n=== Menu Banco ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consu.mostrarSaldo(cuenta);
                    break;
                case 2:
                    deposito.ejecutar(cuenta);
                    break;
                case 3:
                    reti.ejecutar(cuenta);
                    break;
                case 4:
                    System.out.println("Gracias por usar el banco.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}