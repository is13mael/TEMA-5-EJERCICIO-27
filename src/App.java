public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca un número entero mayor que 1: ");
        int numero = Integer.parseInt(System.console().readLine());

        int contador = 0;
        int suma = 0;

        for(int i = 1; i<=numero; i++){
            if(i % 3 == 0){
                System.out.println(i);
                contador++;
                suma+=i;
            }
        }
        System.out.println("Desde 1 hasta "+ numero +" hay "+ contador + " multiplos de 3 y suman "+ suma);
    }
}
