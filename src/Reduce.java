public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduceSteps(100));
    }

    public static int reduceSteps(int i){
        int steps = 0;
        int val = i;
        while (val != 0){
            if (val % 2 == 0){
                val = val / 2;
            }
            else{
                val = val - 1;
            }
            steps++;
        }
        return steps;
    }

}
