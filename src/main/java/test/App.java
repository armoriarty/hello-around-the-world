package test;


/**
 * Hello world!
 *
 */
public final class App {

    /**
     * Greets the world.
     *
     * @param args A set of arguments that are ignored
     */
    public static void main(final String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     *  This constructor should not be called.
     *
     * @throws NotImplementedException when called.
     */
    private App() {
        throw new RuntimeException(
            "A new instance of this class should not be made."
            );
    }
}
