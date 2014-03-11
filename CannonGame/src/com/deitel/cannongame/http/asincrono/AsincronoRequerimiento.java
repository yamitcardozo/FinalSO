package com.deitel.cannongame.http.asincrono;

import java.util.Date;

import android.content.Context;
import android.os.AsyncTask;

public class AsincronoRequerimiento extends AsyncTask<Void, Void, Void> {

	private Context context;
	private String serviceURL;
	private String usuario;
	private Date fecha;
	private int tiros;
	private int tiempo;
	
	//private AssetsPropertyReader assetsPropertyReader;
	
	public AsincronoRequerimiento(Context context, String user, Date date, int valor,int valor2){
		this.context = context;
		this.usuario = user;
		this.fecha = date;
		this.tiros = valor;
		this.tiempo = valor2;
	}
	
	@Override
	protected Void doInBackground(Void... arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
