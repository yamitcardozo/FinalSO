package com.deitel.cannongame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;


public class Puntos extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.resultados);
		
		llenaPuntaje();
		
	}
	
	public void llenaPuntaje(){
		System.out.println("metodo llena la lista");
	}
}
