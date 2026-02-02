using Banco;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace UnitTestBanco
{
    public class Tests
    {
        //lo miraremosluego esto del set up
        [SetUp]
        public void Setup()
        {
        }

        /* Mis test:
         Test 0: metemos un nombre "normal" y un balance positivo
            Resultado esperado: Cuenta creada con nombre balance

         Test 1: metemos un nombre "normal" y un balance 0
            Resultado esperado: Cuenta creada con nombre balance, esta bien, no hay problema

         Test 2: metemos un nombre "normal" y un balance negativo
            Resultado esperado: Lanza excepcion formato no valido
         ...
         ...
         ...
         */

        //NOMBRE DESCRIPTIVO PA CADA TEST : metodoo probado, caucasica , salida esperada
        [Test]
        public void CrearCuentacreada_BalancePositivo_SeCreaBien()
        {
            //1. Arrange (Plantear el escenario)
            //test0:
            var cuenta = new Cuenta("Alice", 100);

            //2. Act (arrancar la caucasica)
            //test 0:
            var balance = cuenta.Balance;


            //3. Assert (comparamos el valor obtenido con el esperado)
            //test 0: Assert.AreEquals(100, balance);
            //Assert.Equals(100, balance);
            Assert.That(balance, Is.EqualTo(100));

        }

        [Test]
        public void CrearCuenta_BalanceNegativo_LanzarExcepcion()
        {
            //se plantea diferente empezamor en Assert
            Assert.Throws<ArgumentException>(() => 
            { //y aki metemos el arrange y act 
                new Cuenta("Alice", -11);

            });
        }

        [Test]
        public void Transferencia_CantidadNegativa_NoHagaNada()
        {
            //1. Arrange (Plantear el escenario)
            //testx:
            var cuentaFrom = new Cuenta("Alice", 100);
            var cuentaTo = new Cuenta("Bob", 100);
            var cantidad = -100;
            CuentaService service = new CuentaService();

            //2. Act (arrancar la caucasica)
            //test x:
            service.Transferencia(cuentaFrom, cuentaTo, cantidad);

            //3. Assert (comparamos el valor obtenido con el esperado)
            //test x: Assert.AreEquals(los valores no han cambiado);
            Assert.That("Alice", Is.EqualTo(cuentaFrom.Titular));
            Assert.That("Bob", Is.EqualTo(cuentaTo.Titular));
            Assert.That(100, Is.EqualTo(cuentaFrom.Balance));
            Assert.That(100, Is.EqualTo(cuentaTo.Balance));

        }


    }
}
