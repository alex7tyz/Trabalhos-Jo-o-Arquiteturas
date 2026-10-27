package src.Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacoes email = new FabricaEmail();
        email.notificar();

        FabricaNotificacoes sms = new FabricaSMS();
        sms.notificar();
    }
}