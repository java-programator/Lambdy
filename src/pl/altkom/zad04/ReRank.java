package pl.altkom.zad04;

import pl.altkom.Gender;
import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/*
Popraw program, aby wypisał pisarzy z zaktualizowaną oceną:
- mężczyznom odejmij punkt
- kobietom dodaj punkt
 */
public class ReRank {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Consumer<Writer> printer = (w->System.out.println(w));
        UnaryOperator<Writer> updater = (w-> {
            if(w.getGender()==Gender.MALE){
                w.setRank(w.getRank()-1);
            }
            else w.setRank(w.getRank()+1);
            return w;
        } ) ;
        //writers.forEach(printer);
        writers.replaceAll(updater);
        writers.forEach(printer);
    }
}
