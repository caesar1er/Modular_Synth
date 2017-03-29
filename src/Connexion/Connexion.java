

// CONNEXION \\

public class Connexion{

    private CommunicationPort upModulePort;
    private CommunicationPort downModulePort;

    public Connexion(ModuleAbstract upModulePort, ModuleAbstract downModulePort){
        this.upModulePort = upModulePort;
        this.downModulePort = downModulePort;
    }

    public void communicate(){


    }

}
