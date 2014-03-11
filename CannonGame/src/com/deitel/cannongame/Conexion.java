package com.deitel.cannongame;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;

public class Conexion extends Activity{
	//private Button bt;
	//private EditText edit;
	//Creamos el handler puente para mostrar
	//el mensaje recibido del servidor
	//private Handler puente = new Handler() {
	 //@Override
	 //public void handleMessage(Message msg) {
	 //Mostramos el mensage recibido del servido en pantalla
	 //Toast.makeText(getApplicationContext(), (String)msg.obj, 
	 //  Toast.LENGTH_LONG).show();
	 //}
	private  void hilo(){
		Thread t = new Thread();
		//String respStr = requestGET("http://ws.audioscrobbler.com/2.0/?method=artist.getinfo&artist="+""+"&api_key=74915715bead533968da6f59b2b54a65&format=json");
		 
		//JSONObject respJSON = new JSONObject(respStr);
		//t.start();  
	} 
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		
	}
}

