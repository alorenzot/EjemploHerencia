package herencia.Ejercicio_5;

public class Test {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Vendedor("Luis","Garcia","111","una",66666,1000f,new Coche("Tesla","3","1111BXG"),"A", 5f, null),
                new JefeDeZona("Carlos","Garcia","111","una",6666,2000f,"B", null, new Coche("Tesla","3","1111BXG"), null),
                new Secretario("Manuel","Garcia","111","una",555,1000f,"C",456)
        };

        for (Empleado e : empleados)
            e.incrementarSalario();

        for(Empleado e: empleados)
            System.out.println(e);
    }
}
