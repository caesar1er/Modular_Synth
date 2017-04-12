

public class GenSineBasic extends ModuleAbstract{
    private double PI = 3.1415926;
    private double frequency;
    private double amplitude;
    private int n;


    public GenSineBasic(String nom, double f, double a){
        super(nom, 0, 1);
        this.frequency = f;
        this.amplitude = a;
        this.n = 0;
    }

    public int getN(){
        return this.n;
    }

    @Override
     public void exec(){
    	double newSample;
        // Calcul du nouveau sample et mise à jour de l'indice de temps
        newSample = this.amplitude*Math.sin(2*PI*this.frequency*n/this.SAMPLE_FREQ);
        this.n = this.n + 1;
        // Aller on envoi
        this.setAndSendOutputPortValue(0,newSample);


    }



}
