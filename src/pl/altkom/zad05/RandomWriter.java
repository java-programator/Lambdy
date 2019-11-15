package pl.altkom.zad05;

import pl.altkom.Writer;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/*
Popraw poniższy program, aby wypisał losowego pisarza
 */
public class RandomWriter {
    public static void main(String[] args) {
        List<Writer> writers = Writer.generateListOfWriters();
        Random rand = new Random();
        Supplier<Writer> randomWriterGenerator = () -> writers.get(rand.nextInt() % writers.size());
        System.out.println(randomWriterGenerator.get());
    }
}
