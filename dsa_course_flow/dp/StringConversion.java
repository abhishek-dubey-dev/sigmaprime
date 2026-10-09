package dp;

public class StringConversion {
    public static int minimumOperations(String source, String target) {
        if (source == null || target == null) {
            throw new IllegalArgumentException("strings must not be null");
        }
        int commonLength = LongestCommonSubsequenceTabulation.lcs(source, target);
        return source.length() - commonLength + target.length() - commonLength;
    }

    public static void main(String[] args) {
        System.out.println("Minimum insertions and deletions: "
                + minimumOperations("pear", "sea"));
    }
}
