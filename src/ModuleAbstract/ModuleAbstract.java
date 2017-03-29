

// ModuleAbstract \\


public abstract class ModuleAbstract{

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
    
    public static Connexion connect(ModuleAbstract mOutput, int idOutputPort, ModuleAbstract mInput, int idInputPort) {
    	Connexion c=new Connexion(mOutput.outputPorts[idOutputPort], mInput.inputPorts[idInputPort]);
    	return c;
    }
    
    public void setAndSendOutputPortValue(int idOutputPort, double sample){
    	this.outputPorts[idOutputPort].setValue(sample);
    	if (this.outputPorts[idOutputPort].isConnected()==true) {
    		this.outputPorts[idOutputPort].getConnexion().communicate();
    	}
    }
    
    public double getInputPortValue(int idInputPort) {
    	return this.inputPorts[idInputPort].getValue();
    }

    public void setInputPortValue(int idInputPort, double value) {
    	this.inputPorts[idInputPort].setValue(value);
    }
    
    public abstract void exec();
}
