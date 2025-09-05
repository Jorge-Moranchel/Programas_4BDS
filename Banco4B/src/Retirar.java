public class Retirar {
    public static void realizarRetiro(Cuenta cuenta, double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Esta mal la cantidad debe ser mayor a cero");
            return;
        }

        if (cuenta.retirar(cantidad)) {
            System.out.println("Retiro exitoso: $" + cantidad);
            System.out.println("Nuevo saldo: $" + cuenta.getSaldo());
        } else {
            System.out.println("Error no tienes feria");
            System.out.println("Saldo disponible: $" + cuenta.getSaldo());
        }
    }
}