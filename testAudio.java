
public class testAudio{

    public static void main(String [] args) {

      GenSineBasic gen = new GenSineBasic("gen", 442, 1);
      AudioDataReceiver output = new AudioDataReceiver("output");
      ModuleAbstract.connect(gen, 0, output, 0);

      while(gen.getN()< 44100*5){
        gen.exec();
      }

      output.displayAudioDataWaveform();
      output.saveAudioDataToWavFile("WAV_1");


    }

}
