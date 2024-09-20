package forme;

public class Rettangolo implements Shape2d{
    double altezza;
    double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double getPerimetro() {
        return (base*2)+(altezza*2);
    }
    public double getArea() {
        return base*altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", base=" + base +
                '}';
    }


}
