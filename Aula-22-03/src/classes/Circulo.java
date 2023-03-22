package classes;

public class Circulo extends Forma {
    private final double PI = Math.PI;
    private double r, diametro;
    

    public Circulo(double diametro) {
        this.setDiametro(diametro);
        this.r = diametro / 2;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public void calcArea() {
        double area;
        area = PI * (r * r);
        this.setArea(area);
        System.out.println("A area do circulo é " + area);
        
    }

    @Override
    public void calcPerim() {
        double perimetro;
        perimetro = 2 * PI * r;
        this.setPerimetro(perimetro);
        System.out.println("O perimetro do circulo é " + perimetro);
        
    }

    
}
