import java.util.Scanner;

public class Main {
    private static int end;
    private static int input;
    private static Thread thread_1 = new Thread(new Runnable() {
        @Override
        public void run() {
            int counter=0;
            System.out.println("Hello Thread_1 is here !!\n\nLoop in Thread1 is starting");

            while(counter<end) {
                System.out.println("Thread_1 :: Thread_1's counter = " + counter);
                ++counter;
            }
            System.out.println("Loop in thread1 is finished");
        }
    });
    private static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        System.out.println("Loop in Main is Starting");
        while(true) {
            System.out.println("Please Enter How many Times Should Thread_1 And MainThread loop Or Enter 0 To Close The Program :");

            input = sc.nextInt();
            if(input<=0) {
                end = 0;
                break;
            }
            else {
                end = input;
                thread_1.start();
            }
            int counter=0;
            System.out.println("Hello Main Thread is here !!");
            while(counter<end){
                System.out.println("Main Thread  :: Main Thread's counter = "+counter);
                ++counter;
            }
            System.out.println("Loop in Main is finished");
        }
    }
}
