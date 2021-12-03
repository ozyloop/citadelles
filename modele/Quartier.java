package modele;

public class Quartier {

	public static final String[] TYPE_QUARTIERS = {"RELIGIEUX","MILITAIRE","NOBLE","COMMERCANT","MERVEILLE"};
	private String nom;
	private String type;
	private int coutConstruction;
	private String caracteristiques;
        

	public Quartier(String nom,String type, int coutConstruction,String caracteristiques) {
		this.nom=nom;
                this.type=type;
                this.coutConstruction=coutConstruction;
                this.caracteristiques=caracteristiques;
	}
        
        public Quartier(String nom,String type, int coutConstruction){
                this.nom=nom;
                this.type=type;
                this.coutConstruction=coutConstruction;
                this.caracteristiques="";
        }
        public Quartier(){
            this.nom="";
            this.type="";
            this.caracteristiques="";
            this.coutConstruction=0;
    
        }



	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return this.type;

	}

	public void setType(String type) {
		
                if(type=="RELIGIEUX" || type=="MILITAIRE" || type=="NOBLE" || type=="COMMERCANT" || type=="MERVEILLE") {
			this.type = type;}
		else{
			type="";
		}
	}

	public int getCout() {
		return this.coutConstruction;
	}

	public void setCout(int coutConstruction) {
		
                if(coutConstruction>6 || coutConstruction<0) {
                    this.coutConstruction=0;
		}
                else{
                    this.coutConstruction = coutConstruction;
                }
	}

	public String getCaracteristiques() {
		return this.caracteristiques;
	}

	public void setCaracteristiques(String caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

}