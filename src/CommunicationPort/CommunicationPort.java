
// CommunicationPort class \\

public class CommunicationPort{

    private int idPort;
    private double sampleValue;
    private ModuleAbstract module;
    private Connexion connexion;

    public Connexion(ModuleAbstract m, int idPort){
        this.module = m;
        this.idPort = idPort;
        this.connexion = null;

    }

    public int getId(){
        return this.idPort;
    }

    public ModuleAbstract getModulePort(){
        return this.Module;
    }

    public void setValue( double newSample){
        this.sampleValue = newSample;
    }

    public double getValue(){
        return this.sampleValue;
    }

    public void setConnexion(Connexion newConnexion){
        this.connexion = newConnexion;
    }

    public Connexion getConnexion(){
        return this.connexion;
    }

    public boolean isConnected(){
        boolean b = new boolean;
        if (this.connexion == null){
            b = false;
        }
        else{
            b = true;
        }
      return b;
    }
}
