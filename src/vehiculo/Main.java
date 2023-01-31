
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMarmolRomeroAlejandro2223 miVehiculoMarmolRomeroAlejandro2223;
        int stockActual;
        
        miVehiculoMarmolRomeroAlejandro2223 = new VehiculoMarmolRomeroAlejandro2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMarmolRomeroAlejandro2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMarmolRomeroAlejandro2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMarmolRomeroAlejandro2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }
}
    
