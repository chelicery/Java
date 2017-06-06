public class DifferenceOfSquaresCalculator {
    private int squareOfSum;
    private int sumOfSquares;


    int computeSquareOfSumTo(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += n;
        }
        return this.squareOfSum = (int)Math.pow(sum,2);
    }
    int computeSumOfSquaresTo(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.pow(n, 2);
        }

        return this.sumOfSquares = sum;
    }
    int computeDifferenceOfSquares(int n){
        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
    }
}
