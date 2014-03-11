package com.deitel.cannongame.DatosLocal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;


public class DatosLocal {
	
	private String usuario;
	private Date fecha;
	private int tiros;
	private int tiempo;
	
	//para almacenar datos en el archivo
	public void grabar(String s,Date d, int tiro, int tiempo) throws FileNotFoundException{
		
	    try {
	    	File f = new File("C:/Users/usuario/Desktop/CannonGame/LeerFormSincrona.txt");
			OutputStreamWriter osw = new OutputStreamWriter(
		            new FileOutputStream(f));
			osw.write(s+" /t"+ d.toString()+"/t"+tiro+"/t"+tiempo+"/n");
			  osw.flush();
			    osw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	
}
