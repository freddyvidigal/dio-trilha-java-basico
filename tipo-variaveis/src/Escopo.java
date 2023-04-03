public class Escopo {
    public class Conta {
        // variavelda classe conta
        double saldo = 10.0;

        public void sacar(double valor) {
            // variavel local de metodo
            double novoSaldo = saldo - valor;
        }

        public void imprimirSaldo() {
            // disponivel para todo a classe
            System.out.println(saldo);

            // somente o metodo sacar conhece a variavel
            // System.out.println(novoSaldo); nao consigo utilizar
        }

        public double calcularDividaExponencial() {
            // variavel local de metodo
            double valorParcela = 50.0;
            double valorMontante = 0.0; // começando a variavel
            for (int x = 1; x <= 5; x++) { // x é uma variavel de escopo de for
                // esta variavel será reiniciada a cada execução do for
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            return valorMontante;
        }
    }
}