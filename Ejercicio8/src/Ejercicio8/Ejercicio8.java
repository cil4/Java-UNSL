package Ejercicio8;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cb = new CuentaBancaria("Ana NN", 20000, 784658347);
	
		cb.printInfo();
		
		
		System.out.println("Se ingresa para deposito el monto de $2500");
		cb.deposito(2500);
		cb.printInfo();

		
		System.out.println("Se establece para retiro el monto de $250000");
		cb.retiro(250000);
		cb.printInfo();

		System.out.println("Método de consulta saldo: $ "+ cb.consulta_saldo());
		cb.printInfo();
	}

	

}
