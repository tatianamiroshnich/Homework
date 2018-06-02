package Instrument;

public class Guitar implements Instrument {
    int numberStrings;

    public int getNumberStrings() {
        return numberStrings;
    }

    public void setNumberStrings(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + getNumberStrings());
    }

    public Guitar(int numberStrings) {
        this.numberStrings = numberStrings;
    }

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[2];

        instruments[0] = new Guitar(7);
        instruments[1] = new Guitar(5);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
