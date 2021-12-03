package modele;

import java.util.ArrayList;
import java.util.Random;
import modele.Quartier;


public class Joueur {

	private String nom;
	private int tresor;
	private Quartier[] cite = new Quartier[8];
	private int nbQuartiers;
	private ArrayList<Quartier> main;
	private boolean possedeCouronne;


	public Joueur(String nom) {
            this.nom = nom;
            this.tresor=0;
                this.nbQuartiers=0;
                this.possedeCouronne=false;
              
                this.main = new ArrayList<Quartier>();
                for(int i=0;i<8;i++){
                    cite[i]=new Quartier();
                }
	}
        
        public String getNom() {
		return this.nom;
	}
        public int nbPieces() {
		return this.tresor;
	}
        public int nbQuartiersDansCite() {
		return this.nbQuartiers;
	}

	public Quartier[] getCite(){
		return this.cite;
	}
        public Quartier getCite(int place){
            
            return this.cite[place];
        }
        public ArrayList<Quartier> getMain() {
		return this.main;
	}
        public int nbQuartiersDansMain(){
            return main.size();
        }
        public boolean getPossedeCouronne() {
            return this.possedeCouronne;
        }
        public void setPossedeCouronne(boolean b) {
		this.possedeCouronne=b;
	}

	public void ajouterPieces(int nbPieces) {
		if(nbPieces>0){
            this.tresor = this.tresor + nbPieces;
                }
	}


	public void retirerPieces(int nbPieces) {
	if(nbPieces>0){	
            if(nbPieces<=tresor){
            this.tresor = this.tresor - nbPieces;
            if(nbPieces==tresor){
                    this.tresor=0;
                    }
	}
        }
        }


	public void ajouterQuartierDansCite(Quartier quartier) {
            if(nbQuartiers<8){
                
                cite[nbQuartiers] = quartier;
                nbQuartiers = nbQuartiers + 1;
        }
	}

	public boolean quartierPresentDansCite(String nom) {
	boolean verif =false;
            for(int i = 0;i<this.nbQuartiers;i++){

            if(cite[i].getNom().equals(nom)){
                verif =true;
           }

        }
        return verif;
        }

	public Quartier retirerQuartierDansCite(String nom) {
	Quartier  ret = new Quartier();
        Quartier replace = new Quartier();
            for(int i = 0;i<nbQuartiers;i++){
            if(cite[i].getNom().equals(nom)){
         
                ret = cite[i];
                cite[i]=replace;
                
                nbQuartiers =nbQuartiers - 1;
            }
        }
            return ret;
	}


	public void ajouterQuartierDansMain(Quartier quartier) {
            main.add(quartier);
            
	}


	public Quartier retirerQuartierDansMain() {
            Random rand = new Random();
            int alea = rand.nextInt(main.size());
            Quartier  retire =new Quartier();
            retire = main.get(alea);
            main.remove(alea);
            return retire;
	}

	public void reinitialiser() {
		this.tresor=0;
                this.nbQuartiers=0;
                this.possedeCouronne=false;
                //trouver method pour clear une Quartier[]
                
                for(int i=0;i<8;i++){
                    cite[i]=null;
                }
                this.main.clear();
	}

}