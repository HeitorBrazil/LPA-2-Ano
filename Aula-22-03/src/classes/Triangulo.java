package classes;

public class Triangulo extends Forma {
    private double l1, l2, l3, altura, base;

    public Triangulo(double l1, double l2, double l3, double altura, double base) {
        this.setL1(l1);
        this.setL2(l2);
        this.setL3(l3);
        this.setAltura(altura);
        this.setBase(base);
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
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
        double area;
        area = (base * altura) / 2;
        this.setArea(area);
        System.out.println("A area do triangulo é " + area);
    }

    @Override
    public void calcPerim() {
        double perimetro;
        perimetro = l1 + l2 + l3;
        this.setPerimetro(perimetro);
        System.out.println("O perimetro do triangulo é "+ perimetro);
    }

    public String classifTriang() {
        return (l1 == l2 && l2 == l3) ? "Equilátero" : (l1 != l2 && l2 != l3 && l1 != l3) ? "Escaleno" : "Isósceles";
    }
}
