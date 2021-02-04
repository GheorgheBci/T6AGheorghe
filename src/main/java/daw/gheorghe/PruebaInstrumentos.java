package daw.gheorghe;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class PruebaInstrumentos {

    public static void main(String[] args) {

        ArrayList<InstrumentosMusicales> listaInstrumentos = new ArrayList<>();

        // Conversión implícita
        listaInstrumentos.add(new InstrumentosCuerda(4, "madera", 250));
        listaInstrumentos.add(new InstrumentosCuerda(15, "metal", 300));
        listaInstrumentos.add(new Guitarra("elétrica", 5, "metal", 345));
        listaInstrumentos.add(new Guitarra("española", 5, "madera", 250));
        listaInstrumentos.add(new Violin(60.50, 6, "madera", 150));
        listaInstrumentos.add(new Violin(15.50, 4, "madera", 80));

        // Recorremos la lista y con el objeto llamamos a su método propio de la clase 
        for (InstrumentosMusicales aux : listaInstrumentos) {
            if (aux instanceof InstrumentosCuerda) {
                ((InstrumentosCuerda) aux).cogerInstrumentoCuerda(); // Conversión explícita
            }

            if (aux instanceof Guitarra) {
                ((Guitarra) aux).cogerGuitarra(); // Conversión explícita
            }

            if (aux instanceof Violin) {
                ((Violin) aux).cogerViolin(); // Conversión explícita
            }

            aux.tocar(); // Método polimórfico
            System.out.println("");
        }

        System.out.println("El objeto está en la posición: " + listaInstrumentos.indexOf(new Guitarra("española", 5, "madera", 250)));

        System.out.println("");

        System.out.println("¿Está el objeto en la lista? " + listaInstrumentos.contains(new Violin(15.50, 4, "madera", 80)));

        System.out.println("");

        listaInstrumentos.remove(new Guitarra("española", 5, "madera", 250));

        for (InstrumentosMusicales listaInstrumento : listaInstrumentos) {
            System.out.println(listaInstrumento);
        }
    }
}
