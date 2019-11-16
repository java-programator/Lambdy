package pl.altkom.references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example03 {

    public static void main(String[] args) {

        System.getProperties().entrySet().forEach(
                entry -> System.out.println(entry.getKey())
        );

        Function<String, String> propertyReader = System::getProperty;

        System.out.println(propertyReader.apply("os.name"));


        BiFunction<String, String, String> propertyReader2
                = (k, d) -> System.getProperty(k, d);

        BiFunction<String, String, String> propertyReader3
                = System::getProperty;

        System.out.println(propertyReader2.apply("jan", "nowak"));
        System.out.println(propertyReader3.apply("jan", "nowak"));

    }
}
