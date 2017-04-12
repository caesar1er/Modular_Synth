
import phelmaaudio.*;

public class testAudio{

    public static void main(String [] args) {

      GenSquare gen50 = new GenSquare("gen50",100, 1);
      GenSquare gen100 = new GenSquare("gen100", 100, 0);
      SimpleAdder add = new SimpleAdder("fdp");
      AudioDataReceiver output = new AudioDataReceiver("output");
      ModuleAbstract.connect(gen50, 0, add, 0);
      ModuleAbstract.connect(gen100, 0, add, 1);

      ModuleAbstract.connect(add, 0, output, 0);
      int i = 0;
      while( i < 5*44100){
        gen50.exec();
        gen100.exec();
        add.exec();
        output.exec();
        i++;
      }

      output.displayAudioDataWaveform();
      output.playAudioData();
      output.saveAudioDataToWavFile("test_1");




    }

}
