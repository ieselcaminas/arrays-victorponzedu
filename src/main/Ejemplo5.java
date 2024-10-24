public class Ejemplo5 {
    public static int maximo(int... numeros){
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max){
                max = numeros[i];
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 4, 11, 30, 27};

        System.out.println(maximo(numeros));

    }
}
