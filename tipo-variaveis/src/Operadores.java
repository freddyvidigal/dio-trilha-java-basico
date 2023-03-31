public class Operadores {
    
    public static void main(String[] args) {
        // operadores de atribuição
        String nome = "frederico";
        int idade = 38;
        double peso = 155.6;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(0);
        

        System.out.println("Meu nome é " +nome+ ", tenho " +idade+ " anos, peso " +peso+ " kg, sou do sexo " +sexo+ ", sou doador de orgãos? " +doadorOrgao+ " e nasci em " +dataNascimento);

        // operadores aritméticos

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 15 % 3;
        double resultado = (10 * 7) + (20/4);

        System.out.println(" A Soma: " +soma+ ", A Subtração: " +subtracao+ ", A Multiplicação: " +multiplicacao+ ", A Divisão: " +divisao+ ", O Módulo: " +modulo+ ", O Resultado: " +resultado);

        // operadores de incremento e decremento

      /*  int numero = 10;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);*/ 

        //repetiçã
        
        int numero = 5;


        System.out.println(++ numero); 


    }
}