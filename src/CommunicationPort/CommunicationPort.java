
// CommunicationPort class \\

public class CommunicationPort{

    private int idPort;
    private double sampleValue;
    private ModuleAbstract modulePort;
    private Connexion connexionPort;

    public Connexion(ModuleAbstract m, int idPort){
        this.modulePort = m;
        this.idPort = idPort;
        this.connexionPort = null;

    }

    public int getId(){
        return this.idPort;
    }

    public ModuleAbstract getModulePort(){
        return this.ModuleAbstract;
    }

    public void setValue( double newSample){
        this.sampleValue = newSample;
    }

    public double getValue(){
        return this.sampleValue;
    }

    public void setConnexion(Connexion newConnexion){
        this.connexionPort = newConnexion;
    }

    public Connexion getConnexion(){
        return this.connexionPort;
    }

    public boolean isConnected(){
        boolean b = new boolean;
        if (this.connexionPort == null){
            b = false;
        }
        else{
            b = true;
        }
      return b;
    }
}
