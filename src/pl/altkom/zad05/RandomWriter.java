package pl.altkom.zad05;

import pl.altkom.Writer;

import java.util.List;
import java.util.function.Supplier;

/*
Popraw poniższy program, aby wypisał losowego pisarza
 */
public class RandomWriter {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Supplier<Writer> randomWriterGenerator = null;
        System.out.println(randomWriterGenerator.get());
    }
}
