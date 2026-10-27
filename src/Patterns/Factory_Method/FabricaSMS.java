package src.Patterns.Factory_Method;

public class FabricaSMS extends FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioSMS();
    }
}