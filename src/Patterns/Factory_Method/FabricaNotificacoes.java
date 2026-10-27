package src.Patterns.Factory_Method;

public abstract class FabricaNotificacoes {

    public abstract IntNotificacoes criarNotificacoes();

    public void notificar() {
        IntNotificacoes notificacoes = criarNotificacoes();
        notificacoes.enviar();
    }
}