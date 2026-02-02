namespace Banco
{
    class Program
    {
        static void Main(string[] args)
        {
            var cuentaAlice = new Cuenta("Alice", 100);
            var cuentaBob = new Cuenta("Bob", 50);

            var service = new CuentaService();
            service.Transferencia(cuentaAlice, cuentaBob, 200);

            Console.WriteLine($"Balance de Alice: {cuentaAlice.Balance}");
            Console.WriteLine($"Balance de Bob: {cuentaBob.Balance}");
        }
    }
}
