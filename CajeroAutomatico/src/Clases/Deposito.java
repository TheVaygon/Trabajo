package Clases;

public class Deposito extends Cajero{
	
	@Override
	public void Transacciones() {
		System.out.println("CUanto deseas depositar: ");
		Deposito();
		
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("Depositaste: " + deposito);
		System.out.println("Tu saldo actual es: " + getSaldo());
	     }

	}
