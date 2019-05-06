public class Driver {
    public static void main(String[] args) {

        int loop_count = 100000;
//
//        for (int i = 0; i < 8; i++) {
//            Thread object = new Thread(new Factorial());
//            object.start();
//        }

        long startTime = System.nanoTime();

        long finishTime = System.nanoTime();
        for (int i = 0; i < loop_count; i++) {
            startTime += System.nanoTime();
            Factorial.getFactorial(10000);
            finishTime += System.nanoTime();
        }

        System.out.println("Have passed: " + (finishTime / loop_count - startTime / loop_count));
    }
}