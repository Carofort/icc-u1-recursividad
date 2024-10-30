public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        System.out.println(rec.factorial(5));
        //int resultado = rec.factorial(5);
        //System.out.println(resultado);
        
        System.out.println(rec.sumaConsecutivos(5));

        System.out.println(rec.potencia(2,3));

        System.out.println(rec.sumaDigitos(456));

        System.out.println(rec.fibonacci(2));
    }
}
