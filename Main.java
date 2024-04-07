import java.util.function.Function;

public class Main {
    public static void main(String... args){
        // Runnable: Takes no Arguments, and returns a void.
        final Runnable runnable = () -> System.out.println("Hello World! From a runnable.");
        runnable.run();

        // Consumer: takes one argument, and returns a void.
        final Consumer consumer = (e) -> System.out.println(e);
        consumer.accept("Hello world! From a consumer.");

        // Supplier: Takes no Arguments, and returns something.
        final Supplier<String> supplier = () -> "Hello world! From a supplier.";
        System.out.println(supplier.get());

        // Function: Takes one Arguments, and returns something.
        final Function<String, String> function = (e) -> e + " From a function.";
        System.out.println(function.apply("Hello world!"));

        // Function: Takes two Arguments, and returns something.
        final BiFunction<Integer, String, String> biFunction = (e1, e2) -> e2 + e1;
        System.out.println(biFunction.apply(1, "Hello world "));

        // BinaryOperator: Takes two Arguments, and returns a void.
        final BinaryOperator<String> binaryOperator = (e1, e2) -> e1 + e2;
        System.out.println(binaryOperator.apply("Hello world!", " From binaryOperator"));

        // Predicate: Takes one Arguments, and returns true/false.
        final Predicate<String> predicate = (e) -> e.startsWith("Hello");
        final String helloWorld = "Hello world! From predicate";
        if (predicate.test(helloWorld)) {
            System.out.println(helloWorld);
        }

        // UnaryOperator: Takes one Arguments, and returns something.
        // Like a Function<T, R> but the return type is the same as the input
        final UnaryOperator<String> unaryOperator = (e) -> e + " world!";
        System.out.println(unaryOperator.apply("Hello"));

    }
}
