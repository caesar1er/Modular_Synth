
public class SimpleAdder extends ModuleAbstract{

	public SimpleAdder(String nom){
        super(nom, 2, 1);
	}

	public void exec(){
    	double newSample;

        newSample = this.inputPorts[0].getValue() + this.inputPorts[1].getValue();

        this.setAndSendOutputPortValue(0,newSample);


    }

}
