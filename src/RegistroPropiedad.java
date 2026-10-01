public class RegistroPropiedad {
    public boolean transferirInmueble(Propiedad p, Propietario nuevoTitular) {

        if (p.estadoLegal.equals("Sin embargos")) {


            System.out.println("Transferencia realizada correctamente.");
            return true;
        } else {
            System.out.println("Transferencia bloqueada: la propiedad tiene embargos.");
            return false;
        }
    }
}
