public class PuntoTiempo extends Punto {
    private int t;
    public PuntoTiempo() {
        this(0,0,0);
    }
    public PuntoTiempo(int x, int y, int t) {
        super(x, y);
        this.setT(t);
    }
    public int getT(){
        return this.t;
    }
    public final void setT(int t) {
        this.t = t;
    }
    public double velocidad() {
        return this.modulo()/this.getT();
    }
    public static void main(String[] args){
        PuntoTiempo ti = new PuntoTiempo(3,3,3);
        System.out.println("la velocidad es: " +ti.velocidad());
    }

}
