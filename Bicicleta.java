 class Bicicleta extends Vehiculo {
            public void mover(int distancia) {
                System.out.println("La bicicleta está pedaleando " + distancia + " metros");
                if (distancia > 5) {
                    System.out.println("La bicicleta está yendo rápido");
                } else {
                    System.out.println("La bicicleta está yendo lento");
                }
            }
        }