import java.sql.Date;

public class Operadores {

  public static void main(String[] args) {
    // operadores de atribuição
    String nome = "frederico";
    int idade = 38;
    double peso = 155.6;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date(0);

    System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, peso " + peso + " kg, sou do sexo " + sexo
        + ", sou doador de orgãos? " + doadorOrgao + " e nasci em " + dataNascimento);

    // operadores aritméticos

    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 15 % 3;
    double resultado = (10 * 7) + (20 / 4);

    System.out.println(" A Soma: " + soma + ", A Subtração: " + subtracao + ", A Multiplicação: " + multiplicacao
        + ", A Divisão: " + divisao + ", O Módulo: " + modulo + ", O Resultado: " + resultado);

    // operadores de incremento e decremento

    /*
     * int numero = 10;
     * 
     * numero = - numero;
     * 
     * System.out.println(numero);
     * 
     * numero = numero * -1;
     * 
     * System.out.println(numero);
     */

    // repetiçãa

    int numero = 5;

    System.out.println(--numero);

    int num = 5;

    num = -num;

    System.out.println(num);

    num = num * -1;

    System.out.println(num);

    int numeral = 7;

    numeral = numeral + 1;

    System.out.println(numeral);

    // operadores tenarios

    int a, b;

    a = 6;
    b = 6;

    String resutado = a == b ? "verdadeiro" : "falso"; // tenario

    // usando o if e else

    /*
     * if (a == b) {
     * resutado = "verdadeiro";
     * } else {
     * resutado = "falso";
     * }
     */

    System.out.println(resutado);

    // operadores relacionais

    int numero1 = 10;
    int numero2 = 20;

    boolean resultado1 = numero1 == numero2;

    System.out.println(resultado1);

    resultado1 = numero1 != numero2;

    System.out.println(resultado1);

    resultado1 = numero1 > numero2;

    System.out.println(resultado1);

    resultado1 = numero1 < numero2;

    System.out.println(resultado1);

    resultado1 = numero1 >= numero2;

    System.out.println(resultado1);

    resultado1 = numero1 <= numero2;

    System.out.println(resultado1);

    // operadores lógicos

    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.println("Verdadeiro1");
    } else {
      System.out.println("Falso1");
    }

    if (condicao1 || condicao2) {
      System.out.println("Verdadeiro2");
    } else {
      System.out.println("Falso2");
    }

  }
}