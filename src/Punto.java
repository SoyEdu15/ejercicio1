public class Punto {
    private int x , y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punto(int xy){
        this(xy, xy);
    }
    public Punto(){
        this(0,0);
    }
    // seters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = x;
    }
    // Geters
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double modulo (){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double fase(){
        double aux= (double) (this.y)/ this.x;
        return  Math.atan(aux);
    }
    
    public static void main(String[] args){
    Punto pt = new Punto(3,2);
    System.out.println("La fase es: "+ pt.fase());
    System.out.println("El modulo es: " + pt.modulo());
    }
}
