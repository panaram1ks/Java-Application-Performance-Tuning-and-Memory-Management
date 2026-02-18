package main;

/**
 * @author E.Parominsky 18/02/2026 08:55
 */
public interface ReadonlyBook {
    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    Price getPrice();
}
