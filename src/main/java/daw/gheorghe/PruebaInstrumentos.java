package daw.gheorghe;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class PruebaInstrumentos {

    public static void main(String[] args) {

        ArrayList<InstrumentosMusicales> listaInstrumentos = new ArrayList<>();

        listaInstrumentos.add(new InstrumentosCuerda(4, "madera", 250));
        listaInstrumentos.add(new InstrumentosCuerda(15, "metal", 300));
        listaInstrumentos.add(new Guitarra("elétrica", 5, "metal", 345));
        listaInstrumentos.add(new Guitarra("española", 5, "madera", 250));
        listaInstrumentos.add(new Violin(60.50, 6, "madera", 150));
        listaInstrumentos.add(new Violin(15.50, 4, "madera", 80));

        for (InstrumentosMusicales aux : listaInstrumentos) {
            if (aux instanceof InstrumentosCuerda) {
                ((InstrumentosCuerda) aux).cogerInstrumentoCuerda();
            }

            if (aux instanceof Guitarra) {
                ((Guitarra) aux).cogerGuitarra();
            }

            if (aux instanceof Violin) {
                ((Violin) aux).cogerViolin();
            }

            aux.tocar();
        }
    }
}
