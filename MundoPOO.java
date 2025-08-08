// Clase base Vehiculo
class Vehiculo {
    // Atributos encapsulados
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters públicos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método que puede ser sobreescrito
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
}

// Clase hija Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    // Polimorfismo: sobreescribimos encender()
    @Override
    public void encender() {
        System.out.println(" El auto " + getMarca() + " " + getModelo() + " está encendido con llave.");
    }
}

// Clase hija Motocicleta que hereda de Vehiculo
class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    // Polimorfismo: sobreescribimos encender()
    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " se enciende con botón.");
    }
}

// Clase principal con el método main
public class MundoPOO {
    public static void main(String[] args) {
        // Creamos objetos de tipo Auto y Motocicleta
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Honda", "R1");

        // Polimorfismo: aunque son tipo Vehiculo, ejecutan su propia versión de encender()
        miAuto.encender();  // Salida: El auto Toyota Corolla está encendido con llave.
        miMoto.encender();  // Salida: La motocicleta Honda R1 se enciende con botón.
    }
}
