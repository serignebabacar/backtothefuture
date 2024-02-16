import org.entreprise.film.ICalculNombreDeFilm;
import org.entreprise.film.ICalculPrixTotal;
import org.entreprise.film.IFormatter;
import org.entreprise.film.impl.CalculNombreDeFilm;
import org.entreprise.film.impl.CalculPrixTotal;
import org.entreprise.film.impl.Formatter;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            IFormatter formatter = new Formatter();
            ICalculNombreDeFilm calculNombreDeFilm = new CalculNombreDeFilm();
            ICalculPrixTotal calculPrixTotal = new CalculPrixTotal(calculNombreDeFilm, formatter);
            double prixTotal = calculPrixTotal.calculerPrixTotal(args[0]);
            System.out.println(prixTotal);
        }
    }
}