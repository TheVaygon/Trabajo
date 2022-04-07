package Clases;

public class Retiro extends Cajero{
	
    @Override
	public void Transacciones() {
		System.out.println("Cuanto deseas retirar: ");
		Retiro();
		if (retiro <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("Retiraste : " + retiro);
			System.out.println("Tu saldo actual es : " + getSaldo());
			
		}else {
			System.out.println("Saldo Insuficiente. ");
		}
		
	}

}
