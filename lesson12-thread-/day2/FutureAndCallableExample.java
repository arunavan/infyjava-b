import java.util.concurrent.*;
public class FutureAndCallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> {
            System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };
	System.out.println("Submitting Callable");	
        Future<String> future = executorService.submit(callable);
        System.out.println("Do something else while callable is getting executed");
        System.out.println("Retrieve the result of the future");
        String result = future.get();
        System.out.println(result);
        executorService.shutdown();
    }
}
