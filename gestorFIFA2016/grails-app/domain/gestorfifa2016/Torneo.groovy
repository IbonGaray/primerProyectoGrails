package gestorfifa2016

class Torneo {

	String nombreTorneo
	Date dateCreated
	int numJugadores
	
	String nombreAdministrador
	
    static constraints = {
		numJugadores max: 32, min:1 
    }
}
