public class Conta {
        Cliente titular;
        float saldo;

        //Função depositar
        void depositar (float valorDeDeposito){
            if (valorDeDeposito>0){
                this.saldo = saldo + valorDeDeposito;
            }
        }

        //Função sacar
        void saque (float valorSaque){
            if (valorSaque > 0 && valorSaque<=this.saldo) {
                this.saldo = saldo - valorSaque;
                System.out.println("Valor sacado com sucesso!");
            }
            else {
                System.out.println("Valor de saldo insuficiente!");
            }

        }

        //Função Consultar Saque
        float consultarSaldo(){
            return saldo;
        }

        /*boolean transferir (Conta destino, Float valor){
            if (! this.saque(valor)){
                return false;
            }
            else {
                destino.depositar(valor);
                System.out.println("Transferencia concluida");
                return true;
            }
        }*/
}

