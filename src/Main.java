//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Propietario propietario1 = new Propietario(
            "12345678",
            "Tomas Puebla"
    );

    Propietario propietario2 = new Propietario(
            "87654321",
            "Juan Perez"
    );

    RegistroPropiedad registro = new RegistroPropiedad();

    GestorInmobiliario gestor = new GestorInmobiliario(registro);

    // Caso exitoso
    Propiedad propiedad1 = new Propiedad(
            "San Martin 123",
            50000000,
            "Sin embargos"

    );

    gestor.solicitarTransferencia(propiedad1, propietario2);

    propiedad1.mostrarDatos();


    System.out.println("\n------------------------\n");


    // Caso bloqueado
    Propiedad propiedad2 = new Propiedad(
            "Belgrano 456",
            35000000,
            "Con embargos"
    );

    gestor.solicitarTransferencia(propiedad2, propietario2);

    propiedad2.mostrarDatos();
}
