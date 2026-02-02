namespace Banco
{
    public class Cuenta
    {
        public string Titular { get; }
        public double Balance { get; private set; }

        //haremos test de estos 3 CrearCuenta, deposito y retirada
        public Cuenta(string titular, double balanceInicial)
        {
            Titular = titular;
            if (balanceInicial < 0) throw new ArgumentException("El balance tiene que ser positivo");
            Balance = balanceInicial;
            //Balance = balanceInicial <0 ? 0 : balanceInicial; //ESTO ENTONCES NO NOS FUNCIONA

        }

        public void Deposito(double cantidad)
        {
            if (cantidad >= 0) Balance += cantidad;
        }

        public void Retirada(double cantidad)
        {
            if (cantidad <= 0)
                return;

            if (cantidad > Balance) Balance = 0;
            else                    Balance -= cantidad;
        }
    }
}
