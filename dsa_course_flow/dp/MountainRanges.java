package dp;

public class MountainRanges {
    public static long countMountainRanges(int pairs) {
        return CatalanNumberTabulation.catalan(pairs);
    }

    public static void main(String[] args) {
        System.out.println("Mountain ranges with 4 pairs: " + countMountainRanges(4));
    }
}
