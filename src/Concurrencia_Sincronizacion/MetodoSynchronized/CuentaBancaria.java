package Concurrencia_Sincronizacion.MetodoSynchronized;

class CuentaBancaria {
    private class Deposito {
        protected double cantidad;
        protected String moneda = "Euro";
    }

    Deposito elDeposito = new Deposito(); // Se instancia el objeto Deposito

    public CuentaBancaria(double initialDeposito, String moneda) {
        elDeposito.cantidad = initialDeposito;
        elDeposito.moneda = moneda;
    }

    public synchronized double saldo() {
        return elDeposito.cantidad;
    }

    public synchronized void ingresa(double cantidad, String moneda) {
        if (!elDeposito.moneda.equals(moneda)) {
            System.out.println("Error: La moneda del depósito no coincide con la moneda de la cuenta.");
            return;
        }
        elDeposito.cantidad += cantidad;
    }
}

