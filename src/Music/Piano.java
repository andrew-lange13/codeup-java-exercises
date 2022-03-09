package Music;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{

    private int numberOfKeys;

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("Starts playing piano");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stops playing piano");
    }


    @Override
    public void tuneInstrument() {
        System.out.println("Tunes piano");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detunes piano");
    }

    @Override
    public void volumeUp() {
        System.out.println("Piano volume goes up");
    }

    @Override
    public void volumeDown() {
        System.out.println("piano volume goes down");
    }
}
