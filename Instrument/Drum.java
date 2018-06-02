package Instrument;

public class Drum implements Instrument {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + getSize());
    }

    public Drum(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[2];

        instruments[0] = new Drum(5);
        instruments[1] = new Drum(4);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
