class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int SqrOfSum = 0;
        for (int i = 1; i <= input; i++){
            SqrOfSum = SqrOfSum + i;
        }
        return (SqrOfSum * SqrOfSum);
    }

    int computeSumOfSquaresTo(int input) {
        int SumOfSqr = 0;
        for ( int i = 1; i <= input; i++){
            SumOfSqr = SumOfSqr + i*i;
        }
        return SumOfSqr;
    }

    int computeDifferenceOfSquares(int input) {
        int difference = 0;
        difference = computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
        return difference;
    }

}
