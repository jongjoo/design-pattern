package pattern.iterator;

public record MenuItem(
        String name,
        String description,
        boolean vegetarian,
        double price
) {
}
