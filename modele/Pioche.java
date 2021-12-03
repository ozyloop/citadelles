package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pioche {

	private ArrayList<Quartier> liste;

        public Pioche(){
            this.liste= new ArrayList<Quartier>();
        }
	public Quartier piocher() {

            Quartier tempo_var = new Quartier();

            if(liste.size()==0){

                return null;

            }

            else{

                tempo_var=liste.get(0);

                liste.remove(0);

                return tempo_var;

            }

}
	


	public void ajouter(Quartier nouveau) {
		liste.add(nouveau);
	}


	public int nombreElements() {
		return liste.size();
	}


	public void melanger() {
	int nbelement = nombreElements();
        Random generateur = new Random();
    
        for(int k=0;k<liste.size();k++){	 
                
                int i = generateur.nextInt(nbelement);
                int j = generateur.nextInt(nbelement);
            
                Collections.swap(liste,i,j);
        } 
	}

}
       