# Polimorfismo

##Índice
1.-¿Qué es el polimorfismo?  
2.- Ejemplo sencillo de polimorfismo en Java  
3.- Implementación  
4.- Reto  
5.- Solución al reto  
5.1 Primer paso  
5.2 Segundo paso  
5.3 Tercer paso  
6.- Conclusiones  
7.-Webgrafia  

##1.-¿Qué es el polimorfismo?
Se trata de comportamientos diferentes, asociados a objetos distintos. Lo interesante es que al llamarlos se utilizará el comportamiento correspondiente al objeto que se esté usando.  

En programación orientada a objetos, el polimorfismo es la capacidad que tienen los objetos de una clase en ofrecer respuesta distinta e independiente en función de los parámetros (diferentes implementaciones) utilizados durante su invocación. Dicho de otro modo el objeto como entidad puede contener valores de diferentes tipos durante la ejecución del programa.  

##2.- Ejemplo sencillo de polimorfismo en Java  
Vamos a aplicar lo visto en la teoría. Implementaremos una clase Vehiculo que tiene un método mover() que es sobreescrito por las clases Coche y Bicicleta. Luego, en el método main, se creará una instancia de la clase Coche y se asigna a una variable de tipo Vehiculo. Eso es exactamente el polimorfismo.   

Cuando se llama al método mover() en esa variable, se ejecuta el método sobreescrito en la clase Coche. Lo mismo sucede cuando se asigna una instancia de la clase Bicicleta a la misma variable y se llama al método mover().  

##3.- Implementación
class Vehiculo {
    public void mover(int distancia) {
        System.out.println("El vehículo se está moviendo " + distancia + " metros");
    }
}

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





