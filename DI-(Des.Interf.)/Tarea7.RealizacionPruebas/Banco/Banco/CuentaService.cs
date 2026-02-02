namespace Banco
{
    public class CuentaService
    {
        public void Transferencia(Cuenta from, Cuenta to, double cantidad)
        {
            if (from == null || to == null) return;
            if (cantidad <= 0) return;


            from.Retirada(cantidad);
            to.Deposito(cantidad);
        }
    }
}
