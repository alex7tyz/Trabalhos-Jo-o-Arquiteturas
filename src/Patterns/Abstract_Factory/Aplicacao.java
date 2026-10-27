package src.Patterns.Abstract_Factory;

public abstract class Aplicacao {
    protected abstract Fabricas criarFabrica();

    public void renderizar() {
        Fabricas fabrica = criarFabrica();

        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}