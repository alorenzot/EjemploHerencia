package herencia.Ejercicio_5;

import java.util.Arrays;

public class Vendedor extends Empleado {
    private Coche coche;
    private String areaDeVenta;
    private Cliente[] clientes;
    private float porcentajeComisiones;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario, Coche coche, String areaDeVenta, float porcentajeComisiones, Cliente... clientes) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.coche = coche;
        this.areaDeVenta = areaDeVenta;
        this.clientes = clientes;
        this.porcentajeComisiones = porcentajeComisiones;
    }

    public void addCliente(Cliente cliente){
        this.clientes=add(cliente,clientes);
    }
    public void eliminarCliente(Cliente cliente){
        this.clientes=remove(cliente);
    }

    private Cliente[] add(Cliente cliente, Cliente[] array){
        if (cliente==null) return array;
        Cliente[] aux = Arrays.copyOf(array,array.length+1);
        aux[aux.length-1]=cliente;
        return aux;
    }
    private Cliente[] remove(Cliente cliente){
        int encontrados=0;
        Cliente[] aux = new Cliente[clientes.length-1];
        int i=0, j=0;
        while (j < clientes.length) {
            if (!clientes[i].equals(cliente)){
                aux[i++]=clientes[j];
            } else
                encontrados++;
            j++;
            if (encontrados==0) return clientes;
            return Arrays.copyOf(aux,aux.length-encontrados);
        }
        return aux;
    }


    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        if (supervisor instanceof Vendedor || supervisor instanceof JefeDeZona) {
            this.supervisor = supervisor;
            return true;
        }
        else return false;
    }

    @Override
    public void incrementarSalario() {
        salario*=(getAntiguedad() * 0.1f) + 1f;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "coche=" + coche +
                ", areaDeVenta='" + areaDeVenta + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                ", porcentajeComisiones=" + porcentajeComisiones +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
