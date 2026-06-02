public class Coche extends Transporte {

    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void mover() {
        System.out.println(nombre + " se esta moviendo en coche");
    }
}