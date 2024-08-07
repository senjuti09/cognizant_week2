package SalesAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FeedbackAnalysis {
    public static void main(String[] args) {
        List<Feedback> feedbacks = new ArrayList<>();
        feedbacks.add(new Feedback(1, "Alice", 5, "Excellent service!"));
        feedbacks.add(new Feedback(2, "Bob", 3, "Average experience."));
        feedbacks.add(new Feedback(3, "Charlie", 1, "Very poor service."));

        FeedbackFilter filter = feedback -> feedback.getRating() >= 4;
        FeedbackProcessor processor = feedback -> System.out.println("Processing feedback: " + feedback);

        processFeedback(feedbacks, filter, processor);

        List<String> positiveComments = feedbacks.stream()
                .filter(feedback -> feedback.getRating() >= 4)
                .map(Feedback::getComments)
                .collect(Collectors.toList());
        System.out.println("Positive Comments: " + positiveComments);

        long positiveCount = feedbacks.stream()
                .filter(feedback -> feedback.getRating() >= 4)
                .count();
        long negativeCount = feedbacks.stream()
                .filter(feedback -> feedback.getRating() < 4)
                .count();
        System.out.println("Positive Count: " + positiveCount + ", Negative Count: " + negativeCount);
    }

    public static void processFeedback(List<Feedback> feedbacks, FeedbackFilter filter, FeedbackProcessor processor) {
        for (Feedback feedback : feedbacks) {
            if (filter.filter(feedback)) {
                processor.process(feedback);
            }
        }
    }
}
