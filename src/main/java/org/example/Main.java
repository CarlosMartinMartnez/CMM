/**
Author Carlos Martin Martinez
*/

class Trabajador {
    static String nombre = "SinNombre";
    static int edad = 0;
    static double salario = 0.0;
/**
@param nombre Se espera que se introduzca el nombre del trabajador
@param edad Se espera que se introduzca la edad del trabajador
@param salario Se espera que se introduzca el salario del trabajador
*/
    static void datos(String nombre, int edad, double salario) {
        Trabajador.nombre = nombre;
        Trabajador.edad = edad;
        Trabajador.salario = salario;
    }
/**
Muestra los datos
*/
    static void mostrar() {
        System.out.println("Nombre: " + Trabajador.nombre);
        System.out.println("Edad: " + Trabajador.edad);
        System.out.println("Salario: " + Trabajador.salario);
    }
}
/**
Calcular bono segun edad
*/
class Bono {
    void calcularBono() {
        double bono = 0;
        if (Trabajador.edad > 50) {
            bono = Trabajador.salario * 0.10;
        } else {
            bono = Trabajador.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
/**
Saludar segun edad
*/
class Saludo {
    void imprimirSaludo() {
        if (Trabajador.edad < 18) {
            System.out.println("Hola, joven " + Trabajador.nombre);
        } else {
            System.out.println("Hola, señor/a " + Trabajador.nombre);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Trabajador.datos("Juan Perez", 45, 50000);
        Trabajador.mostrar();
        Bono bono = new Bono();
        bono.calcularBono();
        Saludo saludo = new Saludo();
        saludo.imprimirSaludo();
    }
}
