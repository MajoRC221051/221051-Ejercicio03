import java.util.ArrayList;

public class Estacionamiento {
    String Cliente;
    ArrayList <EspacioParqueos> espacios = new ArrayList<EspacioParqueos>();
    float total;




    public Estacionamiento(String Cliente, ArrayList<EspacioParqueos> espacios, float total) {
        this.Cliente = Cliente;
        this.espacios = espacios;
        this.total = total;
    }

    public void agregarEspacio(EspacioParqueos espacio){
        total+= espacio.getTiempoIngreso();

    }

    public void listarVehiculos(){
        for(int i=0;i<espacios.size();i++){
            System.out.println("****"+espacios.get(i).getCarro());
        }

        System.out.println("Su espacio se guardara :");

    }

    public void estadistica(){
        for(int i=0;i<espacios.size();i++){
            System.out.println("****"+espacios.get(i).getCarro());
        }

        System.out.println("El total de horas es:"+total);

    }


    public String getCliente() {
        return this.Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<EspacioParqueos> getEspacios() {
        return this.espacios;
    }

    public void setEspacios(ArrayList<EspacioParqueos> espacios) {
        this.espacios = espacios;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

   


    @Override
    public String toString() {
        return "{" +
            " Cliente='" + getCliente() + "'" +
            ", espacios='" + getEspacios() + "'" +
            ", total='" + getTotal() + "'" +

            "}";
    }



   



    
}
