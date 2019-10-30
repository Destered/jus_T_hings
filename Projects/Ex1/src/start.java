public class Lesson3 {

    public static void main(String [] args) {

        int sumOdd = 0;
        int sumEven = 0;
        int lowerBound = 1, upperBound = 1000;
        int absDiff;
        int number = lowerBound;
        final double PI = 3.14;

        while(number <= upperBound) {
            if (number % 2 == 1){
                sumOdd += number;
            } 	else {
                sumEven +=number;
            }
            number++;


        }

        System.out.println("Сумма чётных чисел равна: " + sumOdd);
        System.out.println("Сумма нечётных чисел равна: " + sumEven);

        if (sumEven > sumOdd){
            absDiff = sumEven - sumOdd;
        } else {
            absDiff = sumOdd - sumEven;
        }
        System.out.println("Разница чисел = " + absDiff);

        int m = 2;
        switch (m){
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("введено неправильное число");
                break;
        }

    }
}