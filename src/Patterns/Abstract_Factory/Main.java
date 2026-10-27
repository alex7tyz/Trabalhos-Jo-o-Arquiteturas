package src.Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Aplicacao android = new AppAndroid();
        android.renderizar();

        Aplicacao ios = new AppIOS();
        ios.renderizar();
    }
}