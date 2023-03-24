class Coche extends Vehiculo {
    public void mover(int distancia) {
        System.out.println("El coche está avanzando " + distancia + " metros");
        if (distancia > 10) {
            System.out.println("El coche está yendo rápido");
        } else {
            System.out.println("El coche está yendo lento");
        }
    }
}