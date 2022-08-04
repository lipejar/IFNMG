class Conta {
        private Cliente titular;
        private float saldo;

        //Função depositar
        public void depositar (float valorDeDeposito){
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

        //Função retornar saldo
        public float getSaldo (){
            return this.saldo;
        }
}

