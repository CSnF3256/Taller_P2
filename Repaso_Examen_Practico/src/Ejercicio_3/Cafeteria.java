package Ejercicio_3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Cafeteria {
    private String nombre;
    private String licenciaFiscal;
    private String domicilio;
    private String fechaApertura;
    private String horario;
    private List<Titular> titulares;
    private List<Empleado> empleados;
    private List<ArticuloInventario> inventario;
    private List<Pedido> pedidos;

    public Cafeteria(String nombre, String licenciaFiscal, String domicilio, String fechaApertura, String horario) {
        this.nombre = nombre;
        this.licenciaFiscal = licenciaFiscal;
        this.domicilio = domicilio;
        this.fechaApertura = fechaApertura;
        this.horario = horario;
        this.titulares = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.inventario = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void agregarTitular(Titular titular) {
        titulares.add(titular);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarArticuloInventario(ArticuloInventario articulo) {
        inventario.add(articulo);
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void mostrarDatosCafeteria() {
        JOptionPane.showMessageDialog(null,
                "Cafetería: " + nombre + "\nLicencia Fiscal: " + licenciaFiscal +
                        "\nDomicilio: " + domicilio + "\nFecha de Apertura: " + fechaApertura +
                        "\nHorario: " + horario);

        for (Titular titular : titulares) {
            titular.mostrarDatosTitular();
        }

        for (Empleado empleado : empleados) {
            empleado.mostrarDatosEmpleado();
        }

        for (ArticuloInventario articulo : inventario) {
            articulo.mostrarDatosArticulo();
        }

        for (Pedido pedido : pedidos) {
            pedido.mostrarDatosPedido();
        }
    }
}
