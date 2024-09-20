package forme;

public class Quadrato extends Rettangolo{
    public Quadrato(Double lato) {
        super(lato,lato);
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "base=" + base +
                '}';
    }
}
