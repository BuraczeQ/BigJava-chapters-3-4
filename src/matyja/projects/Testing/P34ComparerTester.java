package matyja.projects.Testing;

public class P34ComparerTester {
    public static void main(String[] args) {
        P34PairsComparer p34PairsComparer = new P34PairsComparer();
        p34PairsComparer.pairComparer(2.5,-3.5);
        System.out.println("Expected values : Sum: -1, Diff: 6, Product: -8.75, Avg: -0.5, Distance: 1, Max: 2.5, Min: -3.5");
    }
}
