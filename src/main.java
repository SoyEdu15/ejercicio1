public class main {
    public static void main(String[] args) {
        Punto pt = new Punto(3,2);
        System.out.println("------------------------------------------------");
        System.out.println("Class Punto:");
        System.out.println("La fase es: "+ pt.fase());
        System.out.println("El modulo es: " + pt.modulo());
        System.out.println("------------------------------------------------");
        System.out.println("Class PuntoTiempo:");
        PuntoTiempo ti = new PuntoTiempo(3,3,3);
        System.out.println("la velocidad es: " +ti.velocidad());
        System.out.println("Class punto 3D;");
        Punto3D p3d = new Punto3D(1, 2, 3, 5);
        System.out.println("------------------------------------------------");
        System.out.println("Class punto");
        System.out.println("El modulo Punto 3D es: " + p3d.modulo());
        
    }
}
