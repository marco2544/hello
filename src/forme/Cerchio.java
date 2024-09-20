package forme;

public class Cerchio implements Shape2d{
    double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getPerimetro(){
        return Math.PI * raggio*2;
    }

    public double getArea(){
        return Math.PI * raggio*raggio;
    }

    @Override
    public String toString() {
        return "Cerchio{" +
                "raggio=" + raggio +
                '}';
    }
}
