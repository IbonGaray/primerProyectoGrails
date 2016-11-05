package gestorfifa2016

class Departamento {

	String id
	String nombre
    static constraints = {
		nombre(nulable:false,unique:true)
    }
	
	static mapping = {
		table 'departamentos'
		id columna: 'codigo', type: 'text'
		version false
	}
	
	String toString(){
		"${nombre}"
	}
}
