

public class GenSquare extends ModuleAbstract{
    private double PI = 3.1415926;
    private double frequency;
    private double amplitude;
    private double phase;
    private int n;


    public GenSquare(String nom, double f, double a){
        super(nom, 0, 1);
        this.frequency = f;
        this.amplitude = a;
        this.n = 0;
        this.phase = 0;
    }

    public int getN(){
        return this.n;
    }

    @Override
     public void exec(){
    	double newSample;
        phase = phase + 2*PI*this.frequency/SAMPLE_FREQ;
        if( ( (int) (phase / PI) ) % 2 == 0 ) {
                newSample = this.amplitude;

              }
        else{
                newSample = -this.amplitude;
        }

        this.n = this.n + 1;
        System.out.println("Valeur phase"+this.phase);
        System.out.println("Valeur sortie"+newSample);
        this.setAndSendOutputPortValue(0,newSample);


    }
}
