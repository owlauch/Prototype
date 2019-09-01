package main.prototype;

public class Main {

    public static void main(String[] args) {
        FiestaPrototype prototipoFiesta = new FiestaPrototype();

        CarroPrototype fiestaNovo = prototipoFiesta.clonar();
        fiestaNovo.setValorCompra(27900.0);
        CarroPrototype fiestaUsado = prototipoFiesta.clonar();
        fiestaUsado.setValorCompra(21000.0);

        System.out.println(fiestaNovo.exibirInfo());
        System.out.println(fiestaUsado.exibirInfo());
    }
}
