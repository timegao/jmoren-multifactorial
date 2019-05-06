public class Factorial implements Runnable{
    //O(n)
    public static long getFactorial(long n) {
        if (n == 2) {
            return 2;
        } else {
            return n * getFactorial(n - 1);
        }
    }

    @Override
    public void run() {

    }
}