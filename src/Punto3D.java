public class Punto3D extends PuntoTiempo {
    private int z;

    public Punto3D(int x, int y, int z, int t) {
        super(x, y, t);
        this.setZ(z);
    }

    public int getZ() {
        return this.z;
    }

    public final void setZ(int z) {
        this.z = z;
    }

    @Override
    public double modulo() {
        return Math.sqrt(this.getX() * this.getX() +
                         this.getY() * this.getY() +
                         this.z * this.z);
    }
    public static void main(String[] args) {
        Punto3D p3d = new Punto3D(1, 2, 3, 5);
        System.out.println("El modulo es: " + p3d.modulo());
    }
}
