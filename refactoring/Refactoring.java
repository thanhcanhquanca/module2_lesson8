package refactoring;

public class Refactoring {

    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }


    public static class Cylinder {
        public static double getVolume(int radius, int height){
            double baseArea = getBaseArea(radius);
            double perimeter = getPerimeter(radius);
            double volume = perimeter * height + 2 * baseArea;
            return volume;
        }

        private static double getPerimeter(int radius) {
            return 2 * Math.PI  * radius;
        }

        private static double getBaseArea(int radius) {
            return Math.PI * radius * radius;
        }
    }
}
