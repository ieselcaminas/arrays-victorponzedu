public class Ejemplo6 {
    public static int minimo(int ...numeros)
    {
    	int minimo;
    	
        //Suponemos que el mínimo es el primer número
		minimo = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < minimo) {
				minimo = numeros[i]; 
			}
			
		}
		return minimo;
    }

	public static void main(String[] args) {
		int[] n = new int[]{1};
		System.out.println(minimo(n));
	}
}
