public class NumberAdd {
    static int addedNumber (int number){
        int sum = 0;

        while (number >0){
            sum = sum + number%10;
            number = number /10;

        }return sum;
    }
}
