package classes;

public class Retangulo extends Forma {
    private double altura, base;

    public Retangulo(double altura, double base) {
        this.setAltura(altura);
        this.setBase(base);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void calcArea() {
        double area = base * altura;
        this.setArea(area);
        System.out.println("A area do retangulo é " + area);
    }

    @Override
    public void calcPerim() {
        double perimetro = (base * 2) + (altura * 2);
        this.setPerimetro(perimetro);
        System.out.println("O perimetro do retangulo é " + perimetro);
    }

    public boolean rectEhQuadrado() {
        return (base == altura) ? true : false;
    }
}
