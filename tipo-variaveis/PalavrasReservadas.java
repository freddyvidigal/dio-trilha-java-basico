public class PalavrasReservadas {
    //controle de pacote
    import // importa pacotes
    package // define o pacote

    //modificadores de acesso
    private // acessivel somente dentro da classe
    protected // acessivel somente dentro do pacote com herança
    public // acessivel para todo o projeto

    //tipos primitivos
    boolean // true ou false
    byte // um inteiro 8 bits
    short // um interio de 32bits
    int // um interio 32 bits
    long // um interio 64 bits
    float // um numero de ponto flutuante 32 bits
    double // um numero de ponto flutuante 64 bits
    char // um character unicode 16 bits
    void // indica que o metodo não tem retorno de valor

    //modificadeores de classes, variaveis ou metodos

    abstract: // classe que não pode ser instanciada ou metodo que precisa ser implemantedo por uma subclasse não abstrata

    class: // especifica uma classe

    extends: // indica a superclasse é uma subclasse esta extendendo

    final: // classe que não pode ser extendida ou metodo que não pode ser sobrescrito

    implements: // indica que a classe implementa uma interface

    interface: // especifica uma interface

    native: // indica que o metodo é implementado em linguagem nativa

    new: // inicia um novo objeto, chamando seu construtor

    static: // faz um metodo ou variavel pertencer a classe ao inves de as instancias

    strictfp: // usado em frente a um metodo ou classe para indicar que os números de pontos flutuante seguirao as regras de ponto flutuante em todas as expressoes

    synchronized: // indica que o metodo so pode ser acessado por uma thread por vez

    transient: // indica que o campo não deve ser serializado

    volatile: // indica que o campo pode ser modificado por threads diferentes

    //controle de fluxo dentro de um bloco de codigo

    break: //sai do bloco de codigo em que esta

    case: //execulta um bloco de codigo dependendo do switch

    continue: //pula a execução do codigo que vivria apos essa linha e vai para proxima passagem do loop

    assert: //testar uma expressao condicional para verificar uma suposição do programador

    catch: //declara o bloco de codigo usando para tratar uma exceção

    finally: //declara o bloco de codigo que sera executado depois de um try ou catch

    throw: //lança uma exceção

    throws: //declara que um metodo pode lançar uma exceção

    try: //declara um bloco de codigo que pode gerar uma exceção

    //variaveis de referencia

    super: //refer-se a superclasse imediata

    this: // refere-se a instancia atual do objeto

    




}
