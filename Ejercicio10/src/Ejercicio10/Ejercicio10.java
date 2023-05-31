package Ejercicio10;



public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamifero ciervo = new Mamifero("Ciervo", 5, Mamifero.Tipo.herbivoro);
		ciervo.PrintInfo();
		
		Mamifero pantera = new Mamifero("Pantera", 7, Mamifero.Tipo.no_herbivoro);
		pantera.PrintInfo();
		
		Ave condor = new Ave("Condor", 5, Ave.Tipo.vuela);
		condor.PrintInfo();
		
		Ave avestruz = new Ave("Avestruz", 8, Ave.Tipo.no_vuela);
		avestruz.PrintInfo();
		
		
		Reptil camaleon = new Reptil("Camaleon", 15, Reptil.Tipo.no_venenoso);
		camaleon.PrintInfo();
		
		Reptil yarara = new Reptil("Yarara", 10, Reptil.Tipo.venenoso);
		yarara.PrintInfo();
		
		
	}

}
