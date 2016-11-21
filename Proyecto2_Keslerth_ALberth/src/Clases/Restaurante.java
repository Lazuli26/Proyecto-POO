package Clases;

import Ventanas.vPrincipal;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Restaurante {

    private String nombre;

    private ImageIcon logo;

    private int telefono;

    private ArrayList direccion;

    private String correo;

    private ArrayList<Cliente> clientes;

    private ArrayList<Mesero> meseros;

    private ArrayList<Cocinero> cocineros;

    private ArrayList<Orden> ordenes;

    private ArrayList<Mesa> mesas;

    private Menu menus;

    private ArrayList<Orden> ordenesCanceladas;

    private ArrayList<Factura> facturas;

    public Restaurante() {
    }

    public Restaurante(String nombre, int telefono, ArrayList direccion, String correo) {
        //Mesero---
        this.nombre = nombre;
        String path = "/images/queso.png";
        URL url = this.getClass().getResource(path);
        ImageIcon foto = new ImageIcon(url);
        this.logo = foto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.clientes = clientes;
        this.meseros = new ArrayList<Mesero>();
        this.clientes = new ArrayList<Cliente>();
        this.cocineros = new ArrayList<Cocinero>();
        this.ordenes = new ArrayList<Orden>();
        this.ordenesCanceladas = new ArrayList();
        this.facturas = new ArrayList();
        this.mesas = new ArrayList<Mesa>();
        this.menus = new Menu();
        this.mesas.add(new Mesa(1, 5, true));
        this.mesas.add(new Mesa(2, 2, true));
        this.mesas.add(new Mesa(3, 7, true));
        this.menus.agregarPlato(new Plato(1, "Arroz", "Arroz, Sal, Agua", 200, 300, "Bueno", null));
        this.menus.agregarPlato(new Plato(2, "Bisec", "Carne, Aceite,", 200, 300, "Recien hecha", null));
        this.menus.agregarBebida(new Bebida("Coca Cola", 500, 350));
        this.menus.agregarBebida(new Bebida("Agua con hielo", 0, 350));
        this.menus.agregarBebida(new Bebida("Te frío", 500, 600));
        this.meseros.add(new Mesero("Español", "Josefina", 123, 88888888, "Por San Jose", "fina@gg.com"));
        this.cocineros.add(new Cocinero("Alberth Salas", 207690305, 88016578, "Por mi casita", "alberthsalascalero@gmail.com"));
        this.meseros.add(new Mesero("Italiano", "Jancarlo", 133, 88888889, "Por San Jose", "fina@gg.com"));
        this.ordenes.add(new Orden(1, 1, this.meseros.get(0), 0, this.menus));
        this.ordenes.add(new Orden(2, 2, this.meseros.get(1), 1, this.menus));
        this.ordenes.add(new Orden(3, 3, this.meseros.get(1), 2, this.menus));
        this.ordenes.add(new Orden(4, 3, this.meseros.get(0), 2, this.menus));
        this.ordenes.add(new Orden(5, 3, this.meseros.get(0), 2, this.menus));
        this.ordenes.get(0).pedido(this.menus.getListaPratillos().get(0));
        this.ordenes.get(0).pedido(this.menus.getListaPratillos().get(1));
        this.ordenes.get(0).pedido(this.menus.getListaBebidas().get(0));
        this.ordenes.get(0).pedido(this.menus.getListaBebidas().get(1));
    }

    public void contratarMesero(Mesero mesero) {
        this.meseros.add(mesero);
    }

    public void contratarCocinero(Cocinero cocinero) {
        this.cocineros.add(cocinero);
    }

    public void nuevoCliente(Cliente nuevoCliente) {
        this.clientes.add(nuevoCliente);
    }

    public Factura facturar(int fecha, int hora, String formaPago, String detalle, ArrayList<Cliente> clientes, Orden ordenCliente) {
        Factura factura = new Factura(fecha, hora, clientes, formaPago, detalle, ordenCliente);
        this.facturas.add(factura);
        return factura;
    }

    public void agregarOrdenes(Orden orden) {
        this.ordenes.add(orden);
    }

    public void agregarMesas(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public int Pagar(ArrayList<Cliente> clientes, ArrayList<Plato> platos, ArrayList<Bebida> bebidas, int numOrden) {
        int precio = 0;
        for (int i = 0; i < this.ordenes.size(); i++) {
            if (this.ordenes.get(i).getNumero() == numOrden) {
                for (int j = 0; j < this.ordenes.get(i).getClientesAtendidos().size(); j++) {
                    for (int k = 0; k < clientes.size(); k++) {
                        if (this.ordenes.get(i).getClientesAtendidos().get(j).equals(clientes.get(k))) {
                            this.ordenes.get(i).getClientesAtendidos().remove(j);
                            clientes.remove(k);
                            break;
                        }
                    }
                }
                for (int j = 0; j < this.ordenes.get(i).getPlatos().size(); j++) {
                    for (int k = 0; k < platos.size(); k++) {
                        if (this.ordenes.get(i).getPlatos().get(j).equals(platos.get(k))) {
                            this.ordenes.get(i).getPlatos().remove(j);
                            precio += platos.get(k).getPrecioSinImpuesto();
                            platos.remove(k);
                            break;
                        }
                    }
                }
                for (int j = 0; j < this.ordenes.get(i).getBebidas().size(); j++) {
                    for (int k = 0; k < bebidas.size(); k++) {
                        if (this.ordenes.get(i).getBebidas().get(j).equals(bebidas.get(k))) {
                            this.ordenes.get(i).getBebidas().remove(j);
                            precio += bebidas.get(k).getPrecio();
                            bebidas.remove(k);
                            break;
                        }
                    }
                }
            }
        }
        return precio;
    }

    public void cuentaCancelada() {
        for (int i = 0; i < this.ordenes.size(); i++) {
            if (this.ordenes.get(i).getBebidas().isEmpty() & this.ordenes.get(i).getPlatos().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La orden numero " + this.ordenes.get(i).getNumero() + " ya fue cancelada");
                this.ordenesCanceladas.add(this.ordenes.remove(i));
                break;
            }
        }
    }

    public void mejorEmpleado(int fecha) {
        Mesero empleadoM = new Mesero();
        Cocinero empleadoC = new Cocinero();
        int ordenesM = 0;
        int ordenesC = 0;
        for (int i = 0; i < this.meseros.size(); i++) {
            Mesero empleadoTemp = this.meseros.get(i);
            int ordenesTemp = 0;
            for (int j = 0; j < this.facturas.size(); j++) {
                int fechaF = Integer.parseInt(String.valueOf(this.facturas.get(j).getFecha()).substring(0, 5));
                if (this.facturas.get(j).getOrden().getMeseroAtiende().equals(empleadoTemp)) {
                    if (fechaF == fecha) {
                        ordenesTemp++;
                        break;
                    }
                }
            }
            if (ordenesTemp >= ordenesM) {
                empleadoM = empleadoTemp;
                ordenesM = ordenesTemp;
            }
        }
        for (int i = 0; i < this.cocineros.size(); i++) {
            Cocinero empleadoTemp = this.cocineros.get(i);
            int ordenesTemp = 0;
            for (int j = 0; j < this.facturas.size(); j++) {
                int fechaF = Integer.parseInt(String.valueOf(this.facturas.get(j).getFecha()).substring(0, 5));
                for (int k = 0; k < this.facturas.get(j).getOrden().getPlatos().size(); k++) {
                    if (this.facturas.get(j).getOrden().getPlatos().get(k).getCookNow().equals(empleadoTemp)) {
                        if (fechaF == fecha) {
                            ordenesTemp++;
                            break;
                        }
                    }
                }
            }
            if (ordenesTemp >= ordenesM) {
                empleadoC = empleadoTemp;
                ordenesM = ordenesTemp;
            }
        }
        JOptionPane.showMessageDialog(null, "El Mesero del mes es: " + empleadoM.getNombreFull() + " por atender la mayor cantidad de ordenes: " + ordenesM);
        JOptionPane.showMessageDialog(null, "El Cocinero del mes es: " + empleadoC.getNombreFull() + " por atender la mayor cantidad de ordenes: " + ordenesC);
    }

    public void mejoresPlatos() {
        Plato plato1 = new Plato();
        Plato plato2 = new Plato();
        int numPlato1 = 0;
        int numPlato2 = 0;
        for (int l = 0; l < this.menus.getListaPratillos().size(); l++) {
            Plato platoTemp = this.menus.getListaPratillos().get(l);
            int numPlatoTemp = 0;
            for (int i = 0; i < this.facturas.size(); i++) {
                for (int j = 0; j < this.facturas.get(i).getOrden().getPlatos().size(); j++) {
                    if (this.facturas.get(i).getOrden().getPlatos().get(j).equals(platoTemp)) {
                        numPlatoTemp++;
                        break;
                    }
                }
            }
            if (numPlatoTemp > numPlato1) {
                plato1 = platoTemp;
            }
        }
        for (int l = 0; l < this.menus.getListaPratillos().size(); l++) {
            Plato platoTemp = this.menus.getListaPratillos().get(l);
            int numPlatoTemp = 0;
            for (int i = 0; i < this.facturas.size(); i++) {
                for (int j = 0; j < this.facturas.get(i).getOrden().getPlatos().size(); j++) {
                    if (this.facturas.get(i).getOrden().getPlatos().get(j).equals(platoTemp)) {
                        numPlatoTemp++;
                        break;
                    }

                }
                if (numPlatoTemp > numPlato2 & !plato1.equals(platoTemp)) {
                    plato2 = platoTemp;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Los mejores platos: " + plato1.getNomPlato() + ", " + plato2.getNomPlato());
    }

    public void horaPico() {
        int contador = 0;
        int horaPico = 0;
        for (int j = 0; j < 24; j++) {
            int contadorTemp = 0;
            int horaTemp = 0;
            for (int i = 0; i < this.facturas.size(); i++) {
                String horaF = String.valueOf(this.facturas.get(i).getHora()).substring(0, 1);
                horaTemp += Integer.parseInt(horaF);
                if (horaTemp == j) {
                    contadorTemp++;
                }
            }
            if (contadorTemp >= contador) {
                horaPico = j;
                contador = contadorTemp;
            }
        }
        JOptionPane.showMessageDialog(null, "La hora en la que llevan mas clientes es: " + horaPico);
    }

    public void clienteFrecuente() {
        Cliente frecuente = new Cliente();
        for (int i = 0; i < this.clientes.size(); i++) {
            if (frecuente.getVecesVisitadas() < this.clientes.get(i).getVecesVisitadas()) {
                frecuente = this.clientes.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "El cliente frecuente es: " + frecuente.getNombreFull());
    }

    public ArrayList reportePlato(int mesAno) {
        ArrayList resultado = new ArrayList();
        for (int j = 0; j < this.menus.getListaPratillos().size(); j++) {
            int contador = 0;
            resultado.add(this.menus.getListaPratillos().get(j));
            for (int k = 0; k < this.facturas.size(); k++) {
                String mesF = String.valueOf(this.facturas.get(k).getFecha()).substring(2, 5);
                int mesFNum = Integer.parseInt(mesF);
                if (mesFNum == mesAno) {
                    for (int l = 0; l < this.facturas.get(k).getOrden().getPlatos().size(); l++) {
                        if (this.menus.getListaPratillos().get(j).equals(this.facturas.get(k).getOrden().getPlatos().get(l))) {
                            contador++;

                        }
                    }
                }
                resultado.add(contador);
            }
        }
        return resultado;
    }

    public ArrayList reporteBebida(int fecha) {
        ArrayList resultado = new ArrayList();
        for (int j = 0; j < this.menus.getListaBebidas().size(); j++) {
            int contador = 0;
            resultado.add(this.menus.getListaBebidas().get(j));
            for (int k = 0; k < this.facturas.size(); k++) {
                int fechaF = this.facturas.get(k).getFecha();
                if (fechaF == fecha) {
                    for (int l = 0; l < this.facturas.get(k).getOrden().getBebidas().size(); l++) {
                        if (this.menus.getListaBebidas().get(j).equals(this.facturas.get(k).getOrden().getBebidas().get(l))) {
                            contador++;
                        }
                    }
                }

                resultado.add(contador);
            }
        }
        return resultado;
    }
//Revisar

    public ArrayList reporteVendido(int ano) {
        int ventasAno = 0;
        ArrayList resultado = new ArrayList();
        for (int i = 0; i < this.facturas.size(); i++) {
            int anoF = Integer.parseInt(String.valueOf(this.facturas.get(i).getFecha()).substring(4, 5));
            if (anoF == ano) {
                int ventasMes = 0;
                for (int mes = 1; mes <= 12; mes++) {
                    resultado.add(mes);
                    for (int j = 0; j < this.facturas.get(i).getOrden().getPlatos().size(); j++) {
                        ventasMes += this.facturas.get(i).getOrden().getPlatos().get(j).getPrecioSinImpuesto();
                        ventasAno += this.facturas.get(i).getOrden().getPlatos().get(j).getPrecioSinImpuesto();
                    }
                    for (int j = 0; j < this.facturas.get(i).getOrden().getBebidas().size(); j++) {
                        ventasMes += this.facturas.get(i).getOrden().getBebidas().get(j).getPrecio();
                        ventasAno += this.facturas.get(i).getOrden().getBebidas().get(j).getPrecio();
                    }
                    resultado.add(ventasMes);
                }
            }
        }
        resultado.add(ventasAno);
        return resultado;
    }
//Revisar

    public ArrayList reporteClientes(int ano) {
        ArrayList resultado = new ArrayList();
        int clienteAno = 0;
        for (int i = 0; i < this.facturas.size(); i++) {
            int anoF = Integer.parseInt(String.valueOf(this.facturas.get(i).getFecha()).substring(4, 5));
            if (anoF == ano) {
                int clienteMes = 0;
                for (int mes = 1; mes <= 12; mes++) {
                    resultado.add(mes);

                    clienteMes += this.facturas.get(i).getCliente().size();
                    clienteAno += this.facturas.get(i).getCliente().size();

                    resultado.add(clienteMes);
                }
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ImageIcon getLogo() {
        return logo;
    }

    public void setLogo(ImageIcon logo) {
        this.logo = logo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList getDireccion() {
        return direccion;
    }

    public void setDireccion(ArrayList direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Mesero> getMeseros() {
        return meseros;
    }

    public void setMeseros(ArrayList<Mesero> meseros) {
        this.meseros = meseros;
    }

    public ArrayList<Cocinero> getCocineros() {
        return cocineros;
    }

    public void setCocineros(ArrayList<Cocinero> cocineros) {
        this.cocineros = cocineros;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public Menu getMenus() {
        return menus;
    }

    public void setMenus(Menu menus) {
        this.menus = menus;
    }
}
