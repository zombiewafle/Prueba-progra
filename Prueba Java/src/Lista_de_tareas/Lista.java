package Lista_de_tareas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<String> NombreLista;

    public Lista() {NombreLista = new ArrayList<String>(); }
    public void AgregarNombreLista(int index, String NombreLista){this.NombreLista.add(index, NombreLista); }
    public List<String> regresarNombreLista () {return this.NombreLista; }
}
