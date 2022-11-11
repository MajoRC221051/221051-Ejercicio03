public class Clientes {
    private String nombre;
    private String marca;
    private String placa;
    private String modelo;
    private String dpi;
    

    public Clientes(String nombre, String marca, String placa, String modelo, String dpi) {
        this.nombre = nombre;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.dpi = dpi;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDpi() {
        return this.dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }



    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", marca='" + getMarca() + "'" +
            ", placa='" + getPlaca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", dpi='" + getDpi() + "'" +
            "}";
    }

    
}
