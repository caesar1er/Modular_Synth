
public class AudioDataReceiver extends ModuleAbstract{

    public AudioData container;


    public AudioDataReceiver(String name){
      super(name, 1,1);
      this.container = new AudioData();
    }

    @Override
    public void exec(){
      this.container.addSample(this.inputPorts[0].getValue());
      this.setAndSendOutputPortValue(0,this.inputPorts[0].getValue());
    }

    public void saveAudioDataToWavFile(String audioFileName){
        this.container.normalize();
        this.container.saveAudioDataToWavFileNormalized(audioFileName);
    }

    public void displayAudioDataWaveform(){
        this.container.display();
    }

    public void playAudioData(){
        this.container.play();
    }
}
