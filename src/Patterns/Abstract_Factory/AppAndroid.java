package src.Patterns.Abstract_Factory;

public class AppAndroid extends Aplicacao {
    @Override
    protected Fabricas criarFabrica() {
        return new FabricaAndroid();
    }
}