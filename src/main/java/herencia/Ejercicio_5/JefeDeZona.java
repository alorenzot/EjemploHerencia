package herencia.Ejercicio_5;

import java.util.Arrays;

public class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretarioACargo;
    private Vendedor[] vendedoresACargo;
    private Coche coche;

    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario,
                      String despacho, Secretario secretarioACargo, Coche coche, Vendedor... vendedoresACargo) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretarioACargo = secretarioACargo;
        this.vendedoresACargo = vendedoresACargo;
        this.coche = coche;

    }
    public void addVendedor(Vendedor vendedor){
        vendedoresACargo =add(vendedor, vendedoresACargo);
    }
    public void removeVendedor(Vendedor vendedor){
        vendedoresACargo=remove(vendedor,vendedoresACargo);
    }


    public void setSecretarioACargo(Secretario secretarioACargo) {
        this.secretarioACargo = secretarioACargo;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    private Vendedor[] add(Vendedor cliente, Vendedor[] array){
        if (cliente==null) return array;
        Vendedor[] aux = Arrays.copyOf(array,array.length+1);
        aux[aux.length-1]=cliente;
        return aux;
    }
    private Vendedor[] remove(Vendedor cliente, Vendedor[] vendedors){
        int encontrados=0;
        Vendedor[] aux = new Vendedor[vendedors.length-1];
        int i=0, j=0;
        while (j < vendedors.length) {
            if (!vendedors[i].equals(cliente)){
                aux[i++]= vendedors[j];
            } else
                encontrados++;
            j++;
            if (encontrados==0) return vendedors;
            return Arrays.copyOf(aux,aux.length-encontrados);
        }
        return aux;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        if (supervisor instanceof JefeDeZona) {
            this.supervisor = supervisor;
            return true;
        }
        return false;
    }

    @Override
    public void incrementarSalario() {
        salario*=(getAntiguedad() * 0.05f) + 1f;
    }

    @Override
    public String toString() {
        return "JefeDeZona{" +
                "despacho='" + despacho + '\'' +
                ", secretarioACargo=" + secretarioACargo +
                ", vendedoresACargo=" + Arrays.toString(vendedoresACargo) +
                ", coche=" + coche +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
