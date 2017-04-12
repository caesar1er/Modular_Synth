package src;

import java.util.*;

public class Patch {
	private String nom;
	private LinkedList <ModuleAbstract> listModule;
	private Set <Connexion> listConnexion;
	
	Map <String , ModuleAbstract > tableAssociativeAccesParNom;
	
	
	public Patch(String nom){
		this.nom=nom;
		listModule=new LinkedList <ModuleAbstract>();
		tableAssociativeAccesParNom=new HashMap <String, ModuleAbstract>();
		listConnexion=new HashSet <Connexion>();
	}
	
	public void addModule(ModuleAbstract m){
		if (tableAssociativeAccesParNom.containsKey(m.getName())){
			throw new IllegalArgumentException("Nom existe déjà");
		}
		else{
			listModule.add(m);
			tableAssociativeAccesParNom.put(m.getName(), m);	
		}
	}
	
	public void connect(String nameOfOutputModule, int idOutputPort, String nameOfInputModule, int idInputPort){
		Connexion c=ModuleAbstract.connect(getModule(nameOfOutputModule), idOutputPort, getModule(nameOfInputModule), idInputPort);
		listConnexion.add(c);
	}
	
	public ModuleAbstract getModule(String nom){
		if (!tableAssociativeAccesParNom.containsKey(nom)){
			return null;
		}
		return tableAssociativeAccesParNom.get(nom);
	}
	
    public String getName(){
        return nom;
      }
    
    public void exec(){
    	Iterator <ModuleAbstract> it = listModule.iterator();
    	while (it.hasNext()){
    		ModuleAbstract m=it.next();
    		m.exec();
    	}
    }
    
    public void exec(int nbStep){

    	for (int i=0; i<nbStep; i++){
        	exec();
    	}
    }
}
