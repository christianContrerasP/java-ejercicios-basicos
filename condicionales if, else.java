import java.util.Scanner;

class NotasCondicion {
    public static void main(String[] args) {
       
     
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.println("Digite su nota (0.0 - 5.0):");
     double notas = scanner.nextDouble();
   
       
    if (notas>= 4.5  )
      { 
        
       System.out.println("excelente");
}

    else if (notas>= 4.0 && notas <= 4.4) { 
   System.out.println("sobresaliente");
}

 else if (notas >= 3.0 && notas <= 3.9) { 
   System.out.println("aprobado");
}
 
 
  else if (notas < 3.0) { 
   System.out.println("reprobado");
}
 else if (notas > 5.0 ){
     System.out.println("error");
 }
    }
    }

