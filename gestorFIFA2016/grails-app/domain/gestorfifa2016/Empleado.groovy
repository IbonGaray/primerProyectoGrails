package gestorfifa2016

import java.nio.MappedByteBuffer;

class Empleado {

	String codigo
	String nombre
	String apellidoUno
	String apellidoDos
	Date fechaNacimiento
	Double salario
	Departamento departamento 
	static mappedBy = [departamento:"id"]

    static constraints = {
		codigo(nulable:false, unique:true)
		nombre(nulable:false)
		apellidoUno(nulable:false)
		apellidoDos(nulable:false)
		fechaNacimiento(nulable:false)
		salario(nulable:false)
		departamento(nulable:true)
    }
	
	static mapping = {
		table: 'empleados'
		version: false
	}
}
