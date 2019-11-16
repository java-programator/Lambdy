package pl.altkom.zad06;

import pl.altkom.Writer;

import java.util.List;
import java.util.function.Function;

/*
Popraw poniższy program, aby wypisał średnią (arytmetyczną) ocen wszystkich pisarzy (kobiet i mężczyzn)
 */

public class AverageRank {

    public static double getAverageRank(List<Writer> writers) {
        Function<Writer, Double> rank = writer -> writer.getRank();
        Function<List<Writer>, Double> average = x -> {
            double sum = 0;
            for(Writer i: x) {
                sum += rank.apply(i);
            }
            return sum / x.size();
        };
        return average.apply(writers);


    }

    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        System.out.println(getAverageRank(writers));
    }
}
