package Clases;

public class Cliente extends Persona {

    private int numCliente;

    private Orden orden;
    
    private int vecesVisitadas;

    public Cliente() {
    }

    public Cliente(int numCliente, Orden orden, int vecesVisitadas, String nombreFull, int cedula, int telefono, String direccion, String correo) {
        super(nombreFull, cedula, telefono, direccion, correo);
        this.numCliente = numCliente;
        this.orden = orden;
        this.vecesVisitadas = vecesVisitadas;
    }

    public void pedir(Plato plato) {
        this.orden.pedido(plato); 
    }

    public void pedir(Bebida bebida) {
        this.orden.pedido(bebida); 
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public int getVecesVisitadas() {
        return vecesVisitadas;
    }

    public void setVecesVisitadas(int vecesVisitadas) {
        this.vecesVisitadas = vecesVisitadas;
    }
}
