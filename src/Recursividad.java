public class Recursividad {
    public int factorial(int n) {
        System.out.println("Caculando el factorial de: " + n);
        // Caso base: n sea 0! y 1! son igualesa a 1
        if(n == 0 || n == 1){
            System.out.println("Caso base alcanzado el factorial de "+n+" es: 1");
            return 1;
        }
        
        int resultado = n * factorial(n - 1);
        System.out.println("Resultado parcial para " +n+ " * factorial("+(n-1)+") = " + resultado);
        return resultado;
    }

    // Calcular la suma de los numeros consecutivos
    // n = 5 resultado: 5+4+3+2+1 = 15

    public int sumaConsecutivos(int n){
        // caso base
        if(n == 1){
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }

    // Calcula la potencia de numero
    //
    public int potencia(int base, int exponente){
        // caso base
        if(exponente == 0){
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    // Crear un metodo que sume los digitos de un numero 
    // si pongo 456 debe ser igual a 15
    // 4 + 5 + 6 = 15
    // Pista se usa % MOD

    public int sumaDigitos(int n) {
        // caso base 
        if(n < 10) {
            return n;
        }
        return n % 10 + sumaDigitos(n / 10);
    }
    
    // FIBONACCI

    public int fibonacci(int n){
        //Caso o casos base:
        if (n == 0) return 0;
        if (n == 1) return 1;   
        //Clase recursiva
        return fibonacci(n - 1) + fibonacci(n - 2);
    }   

    
}
