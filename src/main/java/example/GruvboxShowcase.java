package example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Gruvbox Showcase
 * A sample file to demonstrate syntax highlighting.
 *
 * @author Bo Ni
 */
public class GruvboxShowcase {

    // Constants
    private static final String GREETING = "Hello, Gruvbox!";
    private static final int MAX_ITEMS = 100;

    /**
     * Main method to run the showcase.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        GruvboxShowcase showcase = new GruvboxShowcase();
        showcase.demonstrateSyntax();
    }

    private void demonstrateSyntax() {
        System.out.println(GREETING);

        // Stream API example
        List<String> numbers = IntStream.range(0, 10)
                .mapToObj(i -> "Item #" + i)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        for (String item : numbers) {
            // Check for even numbers
            if (item.hashCode() % 2 == 0) {
                System.out.println("Processing: " + item);
            } else {
                System.err.println("Skipping: " + item);
            }
        }
        
        // Todo: Add more examples
    }

    @Deprecated
    public void legacyMethod() {
        // This method is deprecated
        throw new UnsupportedOperationException("Don't use this!");
    }
}
