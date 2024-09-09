public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while ( i < 1000) {

            count = count + counter(i);
            i++;
        }
        System.out.println(count);
    }

    private static int counter(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            return 1;

        } else if (divisibleBy3) {

            return 1;

        } else if (divisibleBy5) {

            return 1;

        } else {

            return 0;

        }


    }
}
