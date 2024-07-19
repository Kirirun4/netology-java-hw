import java.util.*;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        String[] texts = new String[25];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = generateText("aab", 30_000);
        }
        List<Future> futureList = new ArrayList<>();
        int maxValue = 0;
        ExecutorService threadPool = Executors.newFixedThreadPool(texts.length);

        long startTs = System.currentTimeMillis();

        for (String text : texts) {
            futureList.add(threadPool.submit(new CallableTask(text) {}));
        }

        for (Future future : futureList) {
            maxValue = Math.max((int)future.get(),maxValue);
        }

        long endTs = System.currentTimeMillis();
        System.out.println("Time: " + (endTs - startTs) + "ms");
    }
    public static String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }
}