import java.util.Scanner;
class Producto{
    String nombre;
    double precio;
    int cantidad;
    String categoria;

  void mostrarProductos() {
 System.out.println("su producto es: "+ nombre + " | " + "tiene un valor de: " + precio + " | " + "llevo: " + cantidad + " | " + categoria);
        } 
   void calcularTotal() {
    double total = precio * cantidad;
    System.out.println("el valor total a pagar es: " + total + " " + "que llevo de: " + categoria );

   }
}
class Main {
    public static void main(String[] args) {
 Producto producto1 = new Producto();  
     producto1.nombre = "balon";
     producto1.precio = 15000;
     producto1.cantidad = 5;
     producto1.categoria = "deportes";
        Producto producto2 = new Producto();  
             producto2.nombre = "computador";
             producto2.precio = 500000;
             producto2.cantidad = 2;
             producto2.categoria = "tecnologia";
                Producto producto3 = new Producto();  
                    producto3.nombre = "sala";
                    producto3.precio = 4500000;
                    producto3.cantidad = 2;
                    producto3.categoria = "muebles";

     producto1.mostrarProductos();
     producto2.mostrarProductos();
     producto3.mostrarProductos();
            producto1.calcularTotal();
            producto2.calcularTotal();
            producto3.calcularTotal();

    }
}