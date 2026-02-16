import java.util.Scanner;

public class calculadoracatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el operando 1: ");
        String s1 = sc.nextLine().trim();

        int op1;
        try {
            op1 = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            System.out.println("Operando 1 incorrecto: " + s1);
            sc.close();
            System.exit(1);
            return;
        }

        System.out.print("Ingrese el operador (+, -, *, /): ");
        String sop = sc.nextLine().trim();

        if (sop.isEmpty()) {
            System.out.println("Operador incorrecto: (vacío)");
            sc.close();
            System.exit(1);
            return;
        }

        char operador = sop.charAt(0);

        System.out.print("Ingrese el operando 2: ");
        String s2 = sc.nextLine().trim();

        int op2;
        try {
            op2 = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            System.out.println("Operando 2 incorrecto: " + s2);
            sc.close();
            System.exit(1);
            return;
        }

        int result;

        switch (operador) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                if (op2 == 0) {
                    System.out.println("Error: División entre cero.");
                    sc.close();
                    System.exit(1);
                    return;
                }
                result = op1 / op2;
                break;
            default:
                System.out.println("Operador incorrecto: " + sop);
                sc.close();
                System.exit(1);
                return;
        }

        System.out.println(op1 + " " + operador + " " + op2 + " = " + result);
        sc.close();
    }
}
