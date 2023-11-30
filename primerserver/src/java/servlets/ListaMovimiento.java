package servlets;

import logica.Movimiento;
import java.util.ArrayList;
import java.util.List;

public class ListaMovimiento {

    private static List<Movimiento> listaMovimientos = new ArrayList<>();

    public static void add(Movimiento movimiento) {
        listaMovimientos.add(movimiento);
    }

    public static List<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }
}
