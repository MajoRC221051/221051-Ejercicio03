import java.util.ArrayList;
import java.util.Scanner;
// Maria José Ramírez
// 221051
//Poo

public class Main{

    
    /** 
     * @param args
     */
    public static void main(String[] args){
        Clientes cliente = new Clientes(null, null, null, null, null);
        Estacionamiento estacionamiento = new Estacionamiento(null, null, 0);
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<EspacioParqueos> listarEspacios = new ArrayList<EspacioParqueos>();

            String nombrecliente, placacliente, modelocliente, marcacliente, dpicliente;
            System.out.println("Por favor ingrese el nombre del cliente: ");
            nombrecliente = scanner.next();
            System.out.println("Por favor ingrese el numero de placa: ");
            placacliente = scanner.next();
            System.out.println("Por favor ingrese su número de DPI: ");
            dpicliente = scanner.next();
            System.out.println("Por favor ingrese  el modelo del vehículo: ");
            modelocliente = scanner.next();
            System.out.println("Por favor ingrese la marca del vehículo: ");
            marcacliente = scanner.next();
            cliente.setNombre(nombrecliente);
            cliente.setMarca(marcacliente);
            cliente.setModelo(modelocliente);
            cliente.setDpi(dpicliente);
            cliente.setPlaca(placacliente);

            int opcion = 0;
            while(opcion !=5){
                System.out.println("Bienvenido a su parqueo :)" );
                System.out.println("¿Qué deseas hacer el día de hoy?");
                System.out.println("1. Ingresar un vehiculo");
                System.out.println("2. Ver estadísticas");
                System.out.println("3. Ver vehículo");
                System.out.println("3. Salir");
                opcion = scanner.nextInt();
                if(opcion ==1){
                EspacioParqueos espacio = new EspacioParqueos("", "", 0, 0, 0, "", 0);

                String carro, tamaño, ubicacion;
                int tiempoEgreso, tiempoIngreso;
                System.out.println("Por favor ingrese el numero de carros: ");
                carro = scanner.next();
                System.out.println("Por favor ingrese el tamaño del vehículo: ");
                tamaño = scanner.next();
                System.out.println("Por favor ingrese la ubicacion: ");
                ubicacion = scanner.next();
                System.out.println("Por favor ingrese  el tiempo de ingreso(Enteros): ");
                tiempoIngreso = scanner.nextInt();
                System.out.println("Por favor ingrese el tiempo de Egreso: ");
                tiempoEgreso = scanner.nextInt();

                espacio.setCarro(carro);
                espacio.setTamaño(tamaño);
                espacio.setTiempoEgreso(tiempoEgreso);
                espacio.setTiempoIngreso(tiempoIngreso);
                espacio.setUbicacion(ubicacion);

                listarEspacios.add(espacio);
                estacionamiento.agregarEspacio(espacio);}



            if(opcion ==2){
                estacionamiento.setEspacios(listarEspacios);
                if(listarEspacios.size()==00){
                    System.out.println("espacio Empty :(");}
            else{
                System.out.println("espacio: ");
                estacionamiento.listarVehiculos();}


            if(opcion==3){
                estacionamiento.setEspacios(listarEspacios);
                if(listarEspacios.size()==00){
                    System.out.println("No hay horas :(");}
                else{
                System.out.println("El total de horas es: ");
                estacionamiento.estadistica();}
                    

                }

            }
                






            
                }
            }
            
    }
}


