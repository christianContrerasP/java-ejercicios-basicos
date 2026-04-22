import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double salario;
        
        
        int contador = 0;
        int posicionmayor= 0;
        int posicionmenor = 0;
        String[]  nombres = new String [5];
        double[] salarios = new double [5];
         double menor = Double.MAX_VALUE;
         double mayor = 0;
        for(int i = 0 ; i < 5; i++){
            System.out.println("Digite su nombre:");
            nombre = sc.nextLine();
            nombres[i] = nombre;
            System.out.println("Digite su salario:");
            salario = sc.nextDouble();
            salarios[i] = salario;
            sc.nextLine();
            if(salario > mayor){
                mayor = salario;
                posicionmayor = i;
            }
            if( salario < menor){
                menor = salario;
                posicionmenor = i;
            }
            if (salario > 2000000){
                contador++;
            } 
        }
           System.out.println("la persona con mejor salario es: " + nombres[posicionmayor] +" - " + mayor);
            System.out.println("la persona con el salario mas bajo fue: "+ nombres[posicionmenor] +" - "+ menor);
            for( int i = 0; i < salarios.length; i++){
            System.out.println("el salario de: "+ nombres[i] + " - " + salarios[i] );
            }
            System.out.println("los trabajodores con mejor salario fueron: " + contador);
        
        
    }
}