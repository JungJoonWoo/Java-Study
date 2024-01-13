package poly;

public class Model3Car implements Car {

    @Override
    public void run() {
        System.out.println("Model3Car.run");
    }

    @Override
    public void stop() {
        System.out.println("Model3Car.stop");
    }
}