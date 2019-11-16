package pl.altkom.referencje;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Example03 {
    public static void main(String[] args) {
        System.getProperties().entrySet().forEach(
                entry -> System.out.println(entry.getKey())
        );

        System.out.println(System.getProperty("user.home"));

        Function<String, String> propertyReader1 =
                property -> System.getProperty(property);
        System.out.println(propertyReader1.apply("os.name"));

        Function<String, String> propertyReader2 = System::getProperty;
        System.out.println(propertyReader2.apply("os.name"));

        BiFunction<String, String, String> getProperty1 =
                (k,d) -> System.getProperty(k,d);
    }
    BinaryOperator<String> propertyReader4 = System::getProperty;

}
