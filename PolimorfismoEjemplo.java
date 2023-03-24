public class PolimorfismoEjemplo {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Coche();

        miVehiculo.mover(15); // El coche está avanzando 15 metros
                             // El coche está yendo rápido
        miVehiculo = new Bicicleta();
        miVehiculo.mover(3); // La bicicleta está pedaleando 3 metros
                             // La bicicleta está yendo lento
        miVehiculo = new Vehiculo();
        miVehiculo.mover(13);
    }
}