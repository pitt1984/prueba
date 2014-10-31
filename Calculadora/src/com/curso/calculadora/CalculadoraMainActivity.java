package com.curso.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraMainActivity extends Activity {
	/**
	 * Declaracion de variables
	 */
	
	private TextView pantalla; 
	private Button calculadora_btn_0,calculadora_btn_1,calculadora_btn_2,calculadora_btn_3,calculadora_btn_4,calculadora_btn_5,
	calculadora_btn_6,calculadora_btn_7,calculadora_btn_8,calculadora_btn_9,calculadora_btn_mas,calculadora_btn_menos,calculadora_btn_por,
	calculadora_btn_entre,calculadora_btn_igual,calculadora_btn_limpiar;
	private String memoria=null;
	private String tipoOperacion=null;
	private final String SUMA="";
	private final String RESTA="";
	private final String ENTRE="";
	private final String POR="";
	private final String IGUAL="";
	private String operador=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculadora_main);
		
		/**Instancia objeto TextView*/
		pantalla=(TextView)findViewById(R.id.calculadora_main_tv_pantalla);
		
		/**Instancia objeto Boton_0*/
		calculadora_btn_0=(Button)findViewById(R.id.calculadora_main_btn_0);
		calculadora_btn_0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_0));
			}
		});
		
		/**Instancia objeto Boton_1*/
		calculadora_btn_1=(Button)findViewById(R.id.calculadora_main_btn_1);
		calculadora_btn_1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_1));
			}
		});
		
		/**Instancia objeto Boton_2*/
		calculadora_btn_2=(Button)findViewById(R.id.calculadora_main_btn_2);
		calculadora_btn_2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_2));
			}
		});
		
		/**Instancia objeto Boton_3*/
		calculadora_btn_3=(Button)findViewById(R.id.calculadora_main_btn_3);
		calculadora_btn_3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_3));
			}
		});
		
		/**Instancia objeto Boton_4*/
		calculadora_btn_4=(Button)findViewById(R.id.calculadora_main_btn_4);
		calculadora_btn_4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_4));
			}
		});
		
		/**Instancia objeto Boton_5*/
		calculadora_btn_5=(Button)findViewById(R.id.calculadora_main_btn_5);
		calculadora_btn_5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_5));
			}
		});
		
		/**Instancia objeto Boton_6*/
		calculadora_btn_6=(Button)findViewById(R.id.calculadora_main_btn_6);
		calculadora_btn_6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_6));
			}
		});
		
		/**Instancia objeto Boton_7*/
		calculadora_btn_7=(Button)findViewById(R.id.calculadora_main_btn_7);
		calculadora_btn_7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_7));
			}
		});
		
		/**Instancia objeto Boton_8*/
		calculadora_btn_8=(Button)findViewById(R.id.calculadora_main_btn_8);
		calculadora_btn_8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_8));
			}
		});
		
		/**Instancia objeto Boton_9*/
		calculadora_btn_9=(Button)findViewById(R.id.calculadora_main_btn_9);
		calculadora_btn_9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ponerNumero(getResources().getString(R.string.calculadora_main_btn_9));
			}
		});
		
		/**Instancia objeto Boton_mas*/
		calculadora_btn_mas=(Button)findViewById(R.id.calculadora_main_btn_mas);
		calculadora_btn_mas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				memoria=pantalla.getText().toString();
				tipoOperacion=SUMA;
			}
		});
		
		/**Instancia objeto Boton_menos*/
		calculadora_btn_menos=(Button)findViewById(R.id.calculadora_main_btn_menos);
		calculadora_btn_menos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				memoria=pantalla.getText().toString();
				tipoOperacion=RESTA;
			}
		});
		
		/**Instancia objeto Boton_por*/
		calculadora_btn_por=(Button)findViewById(R.id.calculadora_main_btn_por);
		calculadora_btn_por.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				memoria=pantalla.getText().toString();
				tipoOperacion=POR;
			}
		});
		
		/**Instancia objeto Boton_entre*/
		calculadora_btn_entre=(Button)findViewById(R.id.calculadora_main_btn_entre);
		calculadora_btn_entre.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				memoria=pantalla.getText().toString();
				tipoOperacion=ENTRE;
			}
		});
		
		/**Instancia objeto Boton_igual*/
		calculadora_btn_igual=(Button)findViewById(R.id.calculadora_main_btn_igual);
		calculadora_btn_igual.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("Si entro");
				Log.d("TAG","dshbjkdjfskb");
				if(memoria !=null && operador !=null ){
					Log.d("calculadora","Operaciones");
					if(operador.equals(SUMA)){
						System.out.println("Suma peter");
						pantalla.setText((Integer.parseInt(memoria) + Integer.parseInt(pantalla.getText().toString())) + "");
					}if(operador.equals(RESTA)){
						pantalla.setText((Integer.parseInt(memoria) - Integer.parseInt(pantalla.getText().toString())) + "");
					}if(operador.equals(POR)){
						pantalla.setText((Integer.parseInt(memoria) * Integer.parseInt(pantalla.getText().toString())) + "");
					}if(operador.equals(ENTRE)){
						if(!pantalla.getText().toString().equals("0")){
						pantalla.setText((Integer.parseInt(memoria) / Integer.parseInt(pantalla.getText().toString())) + "");
						}
					}
				}
				
				tipoOperacion=IGUAL;
			}
		});
		
		/**Instancia objeto Boton_limpiar*/
		calculadora_btn_limpiar=(Button)findViewById(R.id.calculadora_main_btn_limpiar);
		calculadora_btn_limpiar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pantalla.setText(getResources().getString(R.string.calculadora_main_btn_0));
				memoria=null;
				tipoOperacion=null;
				operador=null;
				
			}
		});
		
	}//Termina Clase
	
	/** */
	public void ponerNumero(String numero){
		if(pantalla.getText().toString().equals("0"))
		{
			pantalla.setText(numero);
		}else{
			if(tipoOperacion!=null){
				pantalla.setText(numero);
					if(tipoOperacion.equals(IGUAL)){
						operador=null;
						tipoOperacion=null;
					}else{
						operador=tipoOperacion;
						tipoOperacion=null;
					}
			}else{
				pantalla.append(numero);
			}
		}
	}
}
