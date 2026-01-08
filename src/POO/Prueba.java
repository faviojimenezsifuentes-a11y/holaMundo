package POO;

public class Prueba {
    public static void main(String[] args) {
        //Creamdo un objeto sin datos iniciales, los valores los asignan despues
        Empleado empleado1 = new Empleado();
        //Asignacion de valores
        empleado1.nombre="Favio";
        empleado1.salario=1200;
        empleado1.edad=20;
        //Creando un objeto con los datos iniciales
        Empleado empleado2 = new Empleado("Alonso",20,1200);


        empleado1.mostrarInfo();
        empleado2.mostrarInfo();

        //USANDO LA CLASE ENCAPSULADA
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Favio Sifuentes");
        alumno1.setEdad(20);
        alumno1.setNota(11.4);

        System.out.println(alumno1.getEdad());
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getNota());

        System.out.println(alumno1.toString());
        //Abstraccion y polimorfismo
        Animal animal;
        animal = new Perro();
        animal.hacerSonido();

        animal=new Gato();
        animal.hacerSonido();

        //Herencia
        System.out.println("-------------------------------------");
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Favio");
        estudiante1.setEdad(20);
        estudiante1.setNota(20);

        estudiante1.mostrarDatos();
        System.out.println("Nota: "+estudiante1.getNota());

    }
}
