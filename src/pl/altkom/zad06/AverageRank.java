package pl.altkom.zad06;

import pl.altkom.Writer;

import java.util.List;
import java.util.function.Consumer;

/*
Popraw poniższy program, aby wypisał średnią (arytmetyczną) ocen wszystkich pisarzy (kobiet i mężczyzn)
 */

public class AverageRank {

    public static double getAverageRank(List<Writer> writers) {
        return 2.0;
    }
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        System.out.println(getAverageRank(writers));
    }
}
