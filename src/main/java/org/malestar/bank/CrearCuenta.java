package org.malestar.bank;

public class CrearCuenta {
    public  static void main(String[]args){
        Cuenta cuentaDeLizeth =  new Cuenta();
        System.out.printf("Saldo de la cuenta: %.2f\n", + cuentaDeLizeth.saldo);
        cuentaDeLizeth.saldo = 10000;
        System.out.println("Saldo de la cuenta:" + cuentaDeLizeth.saldo);
    }
}