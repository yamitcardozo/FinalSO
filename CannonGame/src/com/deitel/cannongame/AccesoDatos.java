package com.deitel.cannongame;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AccesoDatos extends Activity{
	
	private String etiquetaNombre;
	private Button accesoDatos;
	
	public String getEtiquetaNombre() {
		return etiquetaNombre;
	}

	public void setEtiquetaNombre(String etiquetaNombre) {
		this.etiquetaNombre = etiquetaNombre;
	}

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.obtenerdatos);
		
		llenaPuntaje();
		
	}
	
	public void llenaPuntaje(){
		LayoutInflater li = LayoutInflater.from(this);
		View prompt1 = li.inflate(R.layout.resultados, null);
		
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
		alertDialogBuilder.setView(prompt1);
		
		// Mostramos el mensaje del cuadro de dialogo
		alertDialogBuilder.setCancelable(false).
		setPositiveButton("OK", new DialogInterface.OnClickListener() {
		public void onClick(DialogInterface dialog,int id) {
		// Rescatamos el nombre del EditText y lo mostramos por pantalla
			setEtiquetaNombre(""+R.id.nombre_jugador);
		}
		})
		.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
		public void onClick(DialogInterface dialog,int id) {
		// Cancelamos el cuadro de dialogo
		dialog.cancel();
		}
		});
		 
		// Creamos un AlertDialog y lo mostramos
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();
		
		accesoDatos = (Button) findViewById(R.id.idjugar);
        accesoDatos.setOnClickListener(new OnClickListener(){
        	public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.setComponent(new ComponentName("com.deitel.cannongame.AccesoDatos", "com.deitel.cannongame.CannonGame"));
        		
        		//startActivity(intent);
			}
        });
	}
}
