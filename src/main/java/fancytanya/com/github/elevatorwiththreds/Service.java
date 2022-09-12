package fancytanya.com.github.elevatorwiththreds;

public class Service {

    public static int randomIntGeneration(int max, int min) {
        return ((int) (Math.random() * (max - min))) + min;
    }
}
