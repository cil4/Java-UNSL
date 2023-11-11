package ejemploArreglo;

public class ejemploArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arreglo =new int[20];
		
		for (int i = 0; i<20;i++) {
		arreglo[i]=i+1;
		System.out.println("El valor es  " + arreglo[i]);
		}
		
		float promedio =0;
		
		for (int i =0; i<arreglo.length;i++) {
			promedio = promedio+arreglo[i];
		}
		
		promedio = promedio/arreglo.length;
		
		System.out.println("El promedio del arreglo es "+ promedio);
	}

}
