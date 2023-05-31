package Ejercicio8;

public class CuentaBancaria {

	private String titular;
	private float saldo;
	private int numero_cuenta;
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(int numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	
	public CuentaBancaria(String titular, float saldo, int numero_cuenta) {
		
		this.titular = titular;
		this.saldo = saldo;
		this.numero_cuenta = numero_cuenta;
	}
	public void deposito(float monto) {
	 saldo = saldo + monto;
	}
	
	public void retiro(float monto) {

		if(  monto > saldo){
			saldo = 0;

		
		}else {
		
			saldo = saldo -monto;
		}
	}
	
	public float consulta_saldo() {
	return saldo;
	}
	
	public void printInfo() {
		System.out.println("El titular de la cuenta es " + titular + ", su numero de cuenta N° " + numero_cuenta +
				". El saldo actual es de $" + saldo);

	}
	
	
}