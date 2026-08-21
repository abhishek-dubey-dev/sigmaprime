public class PairsInArray {
    public static void pairsInArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int currentNumber = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int nextNumber = numbers[j];
                System.out.println("Pair: (" + currentNumber + ", " + nextNumber + ")");
            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={2, 4, 6, 8, 10};
        pairsInArray(numbers);
    }
}
