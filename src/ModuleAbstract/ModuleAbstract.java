

// ModuleAbstract \\


public class ModuleAbstract{

    public int SAMPLE_FREQ = 44100;
    private String name;
    private CommunicationPort inputPorts[];
    private CommunicationPort outputPorts[];


    public ModuleAbstract (String name, int nbinput, int nboutput){
        this.name = name;
        this.inputPorts = new CommunicationPort[nbinput];
        this.outputPorts = new CommunicationPort[nboutput];

    }

    public String getName(){
      return this.name;
    }

}
