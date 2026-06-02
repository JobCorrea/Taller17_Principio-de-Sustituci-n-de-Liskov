public class Bicicleta extends Transporte {

    public Bicicleta(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " se esta moviendo en bicicleta");
    }
}