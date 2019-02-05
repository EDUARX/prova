package depurador;


public class OmplirNumeros {

	public static void main(String[] args) {
		int n = 5;
		int[] taula = new int[n];
		
		taula = omplir(n);
		int suma = sumar(taula);
		
		System.out.println("La suma és: "+suma);
	}

	private static int[] omplir(int n) {
		int[] tla = new int[n];
		
		for (int i=0; i<n; i++) 
			tla[i]=i*10;
		return tla;
	} // omplir taula
	
	private static int sumar(int[] tla) {
		int suma = 0;
		int n=tla.length;
		for (int i=0; i<n; i++)
			suma = suma + tla[i];
		return suma;
	} // sumar taula
}
