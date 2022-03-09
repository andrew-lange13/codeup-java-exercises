package Music;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {

    private String saxType;

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("starts playing sax");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stops playin sax");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tunes sax");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detunes sax");
    }

    @Override
    public void volumeUp() {
        System.out.println("Sax volume goes up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sax volume goes down");
    }
}
