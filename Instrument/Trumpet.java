package Instrument;

public class Trumpet implements Instrument {
    int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + getDiameter());
    }

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[2];

        instruments[0] = new Trumpet(5);
        instruments[1] = new Trumpet(6);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
