
// CommunicationPort class \\

public class CommunicationPort{

    private int idPort;
    private double sampleValue;
    private ModuleAbstract modulePort;
    private Connexion connexionPort;


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
