package Clases;

import java.util.Scanner;

public abstract class Cajero {

	protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada = new Scanner (System.in);
	
	public void Operaciones () {
		int bandera = 0;
		int seleccion = 0;
		do {
		do {
			System.out.println("Porfavor seleccione una opcion:");
			System.out.println("	1. COnsulta de saldo");
			System.out.println("	2. Retiro de efectivo");
			System.out.println("	3. Deposito de efectivo");
			System.out.println("	4. salir");
			seleccion = entrada.nextInt();
			
			if(seleccion >= 1 && seleccion <= 4) {
				bandera = 1;
			}else {
				
				System.out.println("Opcion no disponible, vuelva a intentar porfavor");
				
			}
		}while(bandera == 0);
		
		if(seleccion == 1) {
			Cajero mensajero = new Consulta();
			mensajero.Transacciones();
		}else  if (seleccion == 2) {
			Cajero mensajero = new Retiro();
			mensajero.Transacciones();
		}else if (seleccion == 3) {
			Cajero mensajero = new Deposito();
			mensajero.Transacciones();
		}else if (seleccion == 4){
			System.out.println("Gracias, vuelva pronto.");
			bandera = 2;
		}
		
		}while(bandera !=2);	
	}
	
	//Metodo para el retiro
	public void Retiro() {
		retiro = entrada.nextInt();
	}
	
	//metodo para solicitar
	public void Deposito() {
		deposito = entrada.nextInt();
	}
	
	// Metodo abstracto
	public abstract void Transacciones();
	
	//metodos setter y getter
	public int getSaldo() {
		return saldo;
		
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
		
	}