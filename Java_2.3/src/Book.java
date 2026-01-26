import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int pubYear;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.reviews = new ArrayList<>();
    }

    void setRating(double rating) {
        if (rating > 0 && rating <= 10) {
            this.rating = rating;
            System.out.println("\nUpdated \"" + this.title + "\" rating to: " + rating);
        } else {
            System.out.println("Rating must be between 1 - 10");
        }
    }

    void addReview(String review) {
        if (review.trim().isEmpty()) {
            System.out.println("\nFailed to update review. Review can't be empty.");
        } else {
            this.reviews.add(review);
            System.out.println("\nAdded a new review for \"" + this.title + "\".");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
}
