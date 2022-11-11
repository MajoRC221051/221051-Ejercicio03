public class EspacioParqueos {

    private String carro;
    private String tamaño; 
    private int tiempoIngreso;
    private int tiempoTotal;
    private int tiempoEgreso;
    private String ubicacion;
    private int vecesuso = 0;
   



    public EspacioParqueos(String carro, String tamaño, int tiempoIngreso, int tiempoTotal, int tiempoEgreso, String ubicacion, int vecesuso) {
        this.carro = carro;
        this.tamaño = tamaño;
        this.tiempoIngreso = tiempoIngreso;
        this.tiempoTotal = tiempoTotal;
        this.tiempoEgreso = tiempoEgreso;
        this.ubicacion = ubicacion;
        this.vecesuso = vecesuso;
    }


    public String getCarro() {
        return this.carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getTiempoIngreso() {
        return this.tiempoIngreso;
    }

    public void setTiempoIngreso(int tiempoIngreso) {
        this.tiempoIngreso = tiempoIngreso;
    }

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public int getTiempoEgreso() {
        return this.tiempoEgreso;
    }

    public void setTiempoEgreso(int tiempoEgreso) {
        this.tiempoEgreso = tiempoEgreso;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getVecesuso() {
        return this.vecesuso;
    }

    public void setVecesuso(int vecesuso) {
        this.vecesuso = vecesuso;
    }


    @Override
    public String toString() {
        return "{" +
            " carro='" + getCarro() + "'" +
            ", tamaño='" + getTamaño() + "'" +
            ", tiempoIngreso='" + getTiempoIngreso() + "'" +
            ", tiempoTotal='" + getTiempoTotal() + "'" +
            ", tiempoEgreso='" + getTiempoEgreso() + "'" +
            ", ubicacion='" + getUbicacion() + "'" +
            ", vecesuso='" + getVecesuso() + "'" +
            "}";
    }
    
    
}
