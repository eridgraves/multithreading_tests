package shared;

public class MyTask implements Runnable{

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    MyTask(Printer p, int m, boolean isEven) {

        print = p;
        max = m;
        isEvenNumber = isEven;

    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}
