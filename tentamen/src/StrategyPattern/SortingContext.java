package StrategyPattern;

public class SortingContext {
    private SortingStrategyInterface sortingStrategy;

    public SortingContext(SortingStrategyInterface sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategyInterface sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSorting(int[] array){
        sortingStrategy.sort(array);
    }
}
