
import java.util.Scanner;



class NOTASCONFOR {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
              
        int estudiantes ;

        double nota1,nota2,nota3;

        double total;
        
        
        System.out.println("Escribe el numero de estudiantes:");

        estudiantes = scanner.nextInt();
        scanner.nextLine();
        
        for (int i= 1; i <= estudiantes;i++){
       System.out.println("Escribe el nombre del estudiante " + i + ":");
            String nombre = scanner.nextLine();
          
         System.out.println("escribe la nota 1:");

         nota1 = scanner.nextDouble();

        System.out.println("escribe la nota 2:");

         nota2 = scanner.nextDouble();

        System.out.println("escribe la nota 3:");

         nota3 = scanner.nextDouble();

        scanner.nextLine();

        total = (nota1 + nota2 + nota3) / 3;

        System.out.println(nombre + " tiene nota final de: " + total);
       
             
         }
     scanner.close();
        
    }
}
         
     

       
