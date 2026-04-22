import java.util.Scanner;
class Paciente{
    String nombre;
    String apellido;
    int edad;
    String cedula;
    String celular;
    String fecha;
  void mostrarDatos() {
           System.out.println("datos del paciente: "+ nombre + " | " + apellido + " | " + edad + " | " + cedula + " | " + celular + " | " + fecha);
        } 
    void mostrarCita() {
        System.out.println("cita de: "+ nombre + "  " + apellido  + " | " + fecha);
    }
}

class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.nombre = "juan";
        paciente1.apellido = "perez";
        paciente1.edad = 27;
        paciente1.cedula = "1000017889";
        paciente1.celular =  "3002145678";
        paciente1.fecha =    "04-05-2026";
            Paciente paciente2 = new Paciente();
            paciente2.nombre = "lara";
            paciente2.apellido = "narvaez";
            paciente2.edad = 35;
            paciente2.cedula = "234567888";
            paciente2.celular = "2014556789";
            paciente2.fecha = "08-05-2026";
      
        paciente1.mostrarDatos();
        paciente2.mostrarDatos();
        paciente1.mostrarCita();
     
    }
}