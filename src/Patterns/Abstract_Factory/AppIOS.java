package src.Patterns.Abstract_Factory;

public class AppIOS extends Aplicacao {
    @Override
    protected Fabricas criarFabrica() {
        return new FabricaIOS();
    }
}