package Music;

public class MusicTest {

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }

    public static void main(String[] args) {

        Piano piano1 = new Piano("string", 97);
        detuneRetune(piano1);
        makeTwoStaccatoSounds(piano1);
        piano1.startMusic();
        piano1.stopMusic();

        Sax sax1 = new Sax("woodwind", "baritone");
        detuneRetune(sax1);
        makeTwoStaccatoSounds(sax1);
        sax1.startMusic();
        sax1.stopMusic();

    }

}
