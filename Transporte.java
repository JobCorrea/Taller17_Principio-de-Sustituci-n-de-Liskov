public class Transporte {
    protected String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public void mover() {
        System.out.println(nombre + " se esta moviendo");
    }
}