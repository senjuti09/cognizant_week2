package Thread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebCrawler {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        ConcurrentHashMap<String, String> crawledData = new ConcurrentHashMap<>();

        for (int i = 0; i < 10; i++) {
            executor.submit(new CrawlerTask("http://example.com/page" + i, crawledData));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for all tasks to finish
        }

        System.out.println("Crawling completed. Crawled data: " + crawledData);
    }
}

class CrawlerTask implements Runnable {
    private String url;
    private ConcurrentHashMap<String, String> crawledData;

    public CrawlerTask(String url, ConcurrentHashMap<String, String> crawledData) {
        this.url = url;
        this.crawledData = crawledData;
    }

    @Override
    public void run() {
        // Simulate crawling the web page and retrieving data
        String data = "Content of " + url;
        crawledData.put(url, data);
        System.out.println("Crawled " + url);
    }
}
