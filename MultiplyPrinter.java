public class MultiplyPrinter{
    public static void main(String[] args) {
        multiplyPrinter(1, 100);
    }

    public static void multiplyPrinter(int lowerIndex, int upperIndex){
        int firstMultipleValue = 3, secondMultipleValue = 5;
        String firstMultipleName = "Fizz", secondMultipleName = "Buzz";
        for(int i = lowerIndex; i < upperIndex + 1; i++){
            if(i % firstMultipleValue == 0 && i % secondMultipleValue == 0)//check if the number can multiply with firstMultipleValue and secondMultipleValue
                System.out.println(firstMultipleName + secondMultipleName);
            else if(i % firstMultipleValue == 0)//check if the number can multiply with firstMultipleValue
                System.out.println(firstMultipleName);
            else if(i % secondMultipleValue == 0)//check if the number can multiply with secondMultipleValue
                System.out.println(secondMultipleName);
            else
                System.out.println(i);
        }
    }
}
