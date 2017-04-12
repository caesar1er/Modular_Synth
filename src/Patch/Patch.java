package src;

import java.util.LinkedList;
import java.util.*;
import java.util.Map;
import java.util.HashMap;

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
		listModule.add(m);
		tableAssociativeAccesParNom.put(m.getName(), m);
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
}
