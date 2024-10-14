package StrategyPattern;

public class Client {
    public static void main(String[] args) {
        // delegeer hier naar de juiste strategy (bubble)
        SortingContext context = new SortingContext(new BubbleSort());

        int[] array = {1,2,3,4,5,6,7,8,9};

        //execute
        context.performSorting(array);
    }
}
