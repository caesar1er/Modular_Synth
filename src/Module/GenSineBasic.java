
public class GenSineBasic extend ModuleAbstract{

    private double frequency;
    private double amplitude;
    private int n;
    private double newSample;

    public GenSineBasic(String nom, double f, double a){
        super("GenSineBasic", 0, 1);
        this.frequency = f;
        this.amplitude = a;
    }


    @Override
     public void Module(){
        // Calcul du nouveau sample et mise à jour de l'indice de temps
        this.newSample = this.amplitude*Math.sin(2*PI*this.frequency*n/this.SAMPLE_FREQ);
        this.n = this.n + 1;
        // Aller on envoi
        this.outputPorts[0].setValue(this.newSample);
        this.outputPorts[0].connexion.communicate();


    }



}
