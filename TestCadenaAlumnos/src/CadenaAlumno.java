/**
 * LAURA MARTINEZ PRIEGO
 */


import static java.lang.System.out;


/**
 * Clase Cadenas. Contiene una multitud de metodos para trabajar con cadenas de caracteres.
 * @author Laura Martinez priego
 */
public class CadenaAlumno
{

	
	/**
	 * funcion que combierte un string en un vector, array o matriz de caracteres.
	 * ES UNA FUNCION AUXILIAR PARA PODER TRABAJAR LAS DEMAS.
	 * @param cadenaSrt
	 * @return un array que contiene los caracteres del string que nos habian pasado
	 */
	public char[] toCharArray( String cadenaSrt ) //funcion auxiliar para crear las demas, funciona
	{

		   if ( cadenaSrt == null ) {
		     return null;
		   }

		   int longitud = cadenaSrt.length();
		   char[] cadenaChar = new char[longitud];
		   for (int i = 0; i < longitud ; i++) {
			   cadenaChar[i] = new Character(cadenaSrt.charAt(i));
		   }

		   return cadenaChar;
		}
	
	
	
	
	
	
	
	/**
	 * metodo que compara dos cadenas y te dice si son iguales
	 * @param cadena1
	 * @param cadena2
	 * @return true si son iguales
	 */
	public boolean sonIguales(String cadena1, String cadena2) //comprobado funciona
	{
		char[] cd1 = cadena1.toCharArray();
		char[] cd2 = cadena2.toCharArray();
		
		if (cadena1.length() != cadena2.length()) 
			return false;
		
		else 
		{
			for (int i = 0; i < cadena2.length(); i++) 
			{
				if (cd1[i] != cd2[i]) return false;
				//out.println("cd 1 es " + cd1[i] +" y cd2 es "+ cd2[i]);
			}
			
			return true;
		}
		
		
		
		
	}
	
	
	
	
	
	
	/**
	 * metodo que compara dos cadenas y te indica si la primera de ellas es mayor o no
	 * @param cadena1
	 * @param cadena2
	 * @return true si es mayor
	 */
	public boolean esMayor(String cadena1, String cadena2) //comprobado funciona 
	{
		if (cadena1.length() > cadena2.length()) return true;
		else return false;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que compara dos cadenas y te indica si la primera de ellas es menor o no
	 * @param cadena1
	 * @param cadena2
	 * @return true si la primera es menor
	 */
	public boolean esMenor(String cadena1, String cadena2)//comprobado funciona
	{

		if (cadena1.length() < cadena2.length()) return true;
		else return false;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que compara dos cadenas y te dice si son iguales ignorando las mayusculas que pueda haber
	 * @param cadena1
	 * @param cadena2
	 * @return true si son iguales
	 */
	public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2)//comprobado funciona
	{
				
		char[] cd1 = cadena1.toCharArray();
		char[] cd2 = cadena2.toCharArray();
		
		boolean resultado = true;
		
		//si su longitud no es la misma no pueden ser iguales
		if	(cadena1.length() != cadena2.length())
		{
			resultado = false;
		}
		else
		for (int i = 0; i < cadena1.length(); i++) 
		{
			if (cd1[i] < 65 || cd1[i] > 122 || (cd1[i] >90) && (cd1[i] < 97)) //si no es letra comprao directamente
			{
				if (cd1[i] != cd2[i]) resultado = false;
			}
			
			if (cd1[i] <= 90) //en el caaso de que la letra de cadena 1 sea mayusculas
			{
				//miro a ver si la letra equivalente de cadena2 tb es mayusculas 
				if (cd2[i] <= 90) //en el caso de que si lo sea
				{
					//comparo las dos directamente  
					if (cd1[i] != cd2[i]) resultado = false;
				} 
				else //si la letra de cadena2 no es mayusculas comparo pasando cadena 1 a minusculas
				{
					if ((cd1[i] + 32) != cd2[i]) resultado = false;
				}

			} 
			else //si no es mayusculas la letra de cadena1
			{
				//miro a ver si la letra equivalente de cadena2 es mayusculas 
				if (cd2[i] <= 90) //en el caso de que si lo sea comparo pero pasando cadena 2 a minusculas
				{
					 if (cd1[i] != (cd2[i] + 32)) resultado = false;
				}
				
			
			}
		}
				
		return resultado;//empieza siendo true y solo cambia si se da el caso de que no coincide alguna letra
	}
	
	
	
	
	
	
	
	/**
	 * metodo que reemplaza de la cadena: cadena todos los regla/expresion que hay por cambio
	 * @param cadena
	 * @param regla
	 * @param cambio
	 * @return un string con todas las coincidencias cambiadas
	 */
	public String reemplazaTodos(String cadena, String regla, String cambio)  //funciona perfectamente comprobado!!!!
	{
		char[] cad = cadena.toCharArray();
		char[] reg = regla.toCharArray();
		
		String stringFinal = "";//ire sumando char a este string vacio que sera el resultado final
		
		
		for (int i = 0; i < cad.length; i++) //paso por todo los char de la cadena y los comparo con el primer char de la regla
		{
			boolean reglaConfirmada = false; //cada vuelta comienza con la regla no confirmada.
			
			//out.println("cad es "+cad[i]);
			//out.println("reg es "+reg[0]);
			
			if (cad[i] == reg[0])  //coincidencia encontrada
			{
				reglaConfirmada = true; //indico la confirmacinon de la regla como positiva
				
				//out.println("coindden");
				
				
				for (int j = i; j < i + reg.length; j++) 
				{
					//out.println("empiezo a comparar");
					for (int j2 = 0; j2 < reg.length; j2++) //comparo desde la posicion indicada con la regla
					{
						//out.println("empiezo 2for");
						if (cad[j] != reg[j2]) 
						{
							//out.println(cad[j] + " es desigual a "+ reg[j2] );
							reglaConfirmada = false; //y solo en el caso de que los siguientes chars no coincidan lo cambio y termino el for
							//out.println("poniendo a false regla");
						}
						else
						{
							//out.println(cad[j] + " es igual a "+ reg[j2] );
						}
						j++;
					}
				}
				
				if (reglaConfirmada == true) //si al salir del for, resulta que si se encuentra la cadena
				{
					//sumare el cambio de la forma siguiente ->>				
					
					stringFinal += cambio;
					//out.println("sumando el cambio");
					
					i += reg.length-1;//si hemos realizado un cambio, la siguiente vuelta empezara a comparar desde la posicion de despues de la regla.
					
				}
				else 
				{
					stringFinal += cad[i]; //si al final resulta que no era la misma cadena se suma al string final el caracter
				}
				
			}
			//sumare a la cadena el caracter de esta vuelta
			//si ha habido coincidencia no llegara aqui 
			else
			{
				stringFinal += cad[i];
				out.println("el string final ahora vale "+stringFinal);
			}
		}
		

		
		
		
		return stringFinal;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que reemplaza en la cadena// cadena la primera	regla/expresion que hay por cambio
	 * @param cadena
	 * @param regla
	 * @param cambio
	 * @return un string con la primera coincidencia cambiada
	 */
	public String reemplazaPrimero(String cadena, String regla, String	cambio) //working perfectamente comprobado!! :)
	{
		char[] cad = cadena.toCharArray();
		char[] reg = regla.toCharArray();
		
		String stringFinal = "";//ire sumando char a este string vacio que sera el resultado final
		
		boolean questComplete = false;
		
		
		for (int i = 0; i < cad.length; i++) //paso por todo los char de la cadena y los comparo con el primer char de la regla
		{
			boolean reglaConfirmada = false; //cada vuelta comienza con la regla no confirmada.
			
			//out.println("cad es "+cad[i]);
			//out.println("reg es "+reg[0]);
			
			if (cad[i] == reg[0] && !questComplete)  //coincidencia encontrada
			{
				reglaConfirmada = true; //indico la confirmacinon de la regla como positiva
				
				
				//out.println("coindden");
				
				
				for (int j = i; j < i + reg.length; j++) 
				{
					//out.println("empiezo a comparar");
					for (int j2 = 0; j2 < reg.length; j2++) //comparo desde la posicion indicada con la regla
					{
						//out.println("empiezo 2for");
						if (cad[j] != reg[j2])  
						{
							//out.println(cad[j] + " es desigual a "+ reg[j2] );
							reglaConfirmada = false; //y solo en el caso de que los siguientes chars no coincidan lo cambio y termino el for
							//out.println("poniendo a false regla");
						}
						else
						{
							//out.println(cad[j] + " es igual a "+ reg[j2] );
						}
						j++;
					}
				}
				
				if (reglaConfirmada == true) //si al salir del for, resulta que si se encuentra la cadena
				{
					//sumare el cambio de la forma siguiente ->>				
					
					stringFinal += cambio;
					//out.println("sumando el cambio");
					questComplete = true;
					
					i += reg.length-1;//si hemos realizado un cambio, la siguiente vuelta empezara a comparar desde la posicion de despues de la regla.
					
				}
				else 
				{
					stringFinal += cad[i]; //si al final resulta que no era la misma cadena se suma al string final el caracter
				}
				
			}
			//sumare a la cadena el caracter de esta vuelta
			//si ha habido coincidencia no llegara aqui 
			else
			{
				stringFinal += cad[i];
				out.println("el string final ahora vale "+stringFinal);
			}
		}
		

		
		
		
		return stringFinal;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que nos divide una cadena en base a una regla/expresion y un limite que sera el numero total de cadenas que queremos que nos muestre
	 * @param cadena
	 * @param regla
	 * @param limite
	 */
	public void muestraSplitLimite(String cadena, String regla, int limite)//comprobado, funciona
	{
		{
			{
				char[] cad = cadena.toCharArray();
				char[] reg = regla.toCharArray();
				
				String stringFinal = "";//ire sumando char a este string vacio que sera el resultado final
				int coincidencias = 0;
				
				
				for (int i = 0; i < cad.length; i++) //paso por todo los char de la cadena y los comparo con el primer char de la regla
				{
					boolean reglaConfirmada = false; //cada vuelta comienza con la regla no confirmada.
					
					//out.println("cad es "+cad[i]);
					//out.println("reg es "+reg[0]);
					
					if (cad[i] == reg[0] && coincidencias < limite)  //coincidencia encontrada
					{
						reglaConfirmada = true; //indico la confirmacinon de la regla como positiva
						
						
						//out.println("coindden");
						
						
						for (int j = i; j < i + reg.length; j++) 
						{
							//out.println("empiezo a comparar");
							for (int j2 = 0; j2 < reg.length; j2++) //comparo desde la posicion indicada con la regla
							{
								//out.println("empiezo 2for");
								if (cad[j] != reg[j2]) 
								{
									//out.println(cad[j] + " es desigual a "+ reg[j2] );
									reglaConfirmada = false; //y solo en el caso de que los siguientes chars no coincidan lo cambio y termino el for
									//out.println("poniendo a false regla");
								}
								else
								{
									//out.println(cad[j] + " es igual a "+ reg[j2] );
								}
								j++;
							}
						}
						
						if (reglaConfirmada == true) //si al salir del for, resulta que si era la cadena
						{
							//sumare el cambio como un salto de linea que indicara el split y sumo uno a coincidencias->>				
							
							stringFinal += "\n";
							coincidencias++;
							//out.println("sumando el cambio");
													
							i += reg.length-1;//si hemos realizado un cambio, la siguiente vuelta empezara a comparar desde la posicion de despues de la regla.
							
						}
						else 
						{
							stringFinal += cad[i]; //si al final resulta que no era la misma cadena se suma al string final el caracter
						}
						
					}
					//sumare a la cadena el caracter de esta vuelta
					//si ha habido coincidencia no llegara aqui 
					else
					{
						stringFinal += cad[i];
						
					}
				}
				

				
				
				
				out.println(stringFinal);
			}
		}
	}
	
	
	
	
	
	
	
	/**
	 * metodo que nos divide una cadena en base a una regla/expresion
	 * @param cadena
	 * @param regla
	 */
	public void muestraSplit(String cadena, String regla) //funciona, comprobado
	{
		{
			char[] cad = cadena.toCharArray();
			char[] reg = regla.toCharArray();
			
			String stringFinal = "";//ire sumando char a este string vacio que sera el resultado final
			
			
			for (int i = 0; i < cad.length; i++) //paso por todo los char de la cadena y los comparo con el primer char de la regla
			{
				boolean reglaConfirmada = false; //cada vuelta comienza con la regla no confirmada.
				
				//out.println("cad es "+cad[i]);
				//out.println("reg es "+reg[0]);
				
				if (cad[i] == reg[0])  //coincidencia encontrada
				{
					reglaConfirmada = true; //indico la confirmacinon de la regla como positiva
					
					
					//out.println("coindden");
					
					
					for (int j = i; j < i + reg.length; j++) 
					{
						//out.println("empiezo a comparar");
						for (int j2 = 0; j2 < reg.length; j2++) //comparo desde la posicion indicada con la regla
						{
							//out.println("empiezo 2for");
							if (cad[j] != reg[j2]) 
							{
								//out.println(cad[j] + " es desigual a "+ reg[j2] );
								reglaConfirmada = false; //y solo en el caso de que los siguientes chars no coincidan lo cambio y termino el for
								//out.println("poniendo a false regla");
							}
							else
							{
								//out.println(cad[j] + " es igual a "+ reg[j2] );
							}
							j++;
						}
					}
					
					if (reglaConfirmada == true) //si al salir del for, resulta que si era la cadena
					{
						//sumare el cambio como un salto de linea que indicara el split ->>				
						
						stringFinal += "\n";
						//out.println("sumando el cambio");
												
						i += reg.length-1;//si hemos realizado un cambio, la siguiente vuelta empezara a comparar desde la posicion de despues de la regla.
						
					}
					else 
					{
						stringFinal += cad[i]; //si al final resulta que no era la misma cadena se suma al string final el caracter
					}
					
				}
				//sumare a la cadena el caracter de esta vuelta
				//si ha habido coincidencia no llegara aqui 
				else
				{
					stringFinal += cad[i];
					
				}
			}
			

			
			
			
			out.println(stringFinal);
		}
	}
	
	
	
	
	
	
	
	/**
	 * metodo que devuelve un String sin espacios previos/posteriores
	 * @param cadena
	 * @return un string sin los espacios
	 */
	public String quitaEspacios(String cadena)// funciona comprobado
	{
		char[] cd = cadena.toCharArray();
		String cadenaFinal = "";
		
		for (int i = 0; i < cadena.length(); i++) 
		{
			if (cd[i] == ' '); //SI ES UN ESPACIO no lo retorno al String cadena
			else ////SI no es un espacio lo retorno al String cadena
			{
				cadenaFinal += cd[i];
			}
		}
		return cadenaFinal;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que dado un String te devuelve ese mismo pero en mayusculas
	 * @param cadena
	 * @return un string en mayusculas
	 */
	public String convertirMayusculas(String cadena)//comprobado funiona
	{
		char[] cd = cadena.toCharArray();
		String cadenaFinal = "";
	
		
		for (int i = 0; i < cadena.length(); i++) //comprobamos uno por uno los caracteres
		{
			//out.println(cd[i]);
			int numCaracter = (int)cd[i];
			//out.println(numCaracter);
			
			
			if (numCaracter < 65 || numCaracter > 122 || (numCaracter >90 && numCaracter < 97)) //si no es letra aÃ±ado a la cadena final directamente
			{
				cadenaFinal += cd[i];
				//out.println(cadenaFinal);
			}
			else 
			{
				if (numCaracter <= 90) //en el caso de que la letra de cadena  sea mayusculas aÃ±ado directamente
				{
					cadenaFinal += cd[i];
					//out.println(cadenaFinal);

				} 
				else //si no es mayusculas la letra de cadena1 aÃ±ado pasandola a mayusculas previamente
				{
					numCaracter = numCaracter -32;
					char cter = (char)(numCaracter);					
					cadenaFinal += cter;
					//out.println(cadenaFinal);
				
				}
			}
			
		}
			
		return cadenaFinal;
		
	}
	
	
	
	
	
	
	
	/**
	 * metodo que te convierteun string todo a minusculas
	 * @param cadena
	 * @return un string en minusculas
	 */
	public String convertirMinusculas(String cadena) //otra forma de hacerlo diferente a la anterior comprobado
	{
		char[] cd1 = cadena.toCharArray();
		cadena = "";
		
		for (int i = 0; i < cd1.length; i++) //comprobamos uno por uno los caracteres
		{
			if (cd1[i] < 65 || cd1[i] > 122 || (cd1[i] >90) && (cd1[i] < 97)) //si no es letra aÃ±ado a la cadena final directamente
			{
				cadena += cd1[i];
			}
			else 
			{
				if (cd1[i] >=97) //en el caso de que la letra de cadena  sea minusculas aÃ±ado directamente
				{
					cadena += cd1[i];

				} 
				else //si no es mayusculas la letra de cadena1 aÃ±ado pasandola a minusculas previamente
				{
					cd1[i] = (char) (cd1[i] + 32);					
					cadena += cd1[i];
				
				}
			}
			
		}
				
		return cadena;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que te devuelve la longitud de una cadena
	 * @param cadena
	 * @return la longitud de la cadena en un long.
	 */
	public long longitudCadena(String cadena) //comprobado
	{
		
		long longitud = ((long)cadena.length());
		
		return longitud;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que te indica si la cadena comienza con el prefijo dado
	 * @param cadena
	 * @param prefijo
	 * @return true si empieza por ese prefijo o false si no lo hace
	 */
	public boolean empiezaCon(String cadena, String prefijo) //funciona, no distingue may y min
	{
		char[] cd1 = cadena.toCharArray();
		char[] pre = prefijo.toCharArray();
		
		boolean resultado = true;
		
		for (int i = 0; i < prefijo.length(); i++) 
		{
			if (cd1[i] < 65 || cd1[i] > 122 || (cd1[i] >90) && (cd1[i] < 97)) //si no es letra comparo directamente
			{
				if (cd1[i] != pre[i]) resultado = false;
			}
			
			if (cd1[i] <= 90) //en el caaso de que la letra de cadena sea mayusculas
			{
				//miro a ver si la letra equivalente del prefijo tb es mayusculas 
				if (pre[i] <= 90) //en el caso de que si lo sea
				{
					//comparo las dos directamente  
					if (cd1[i] != pre[i]) resultado = false;
				} 
				else //si la letra del prefijo no es mayusculas comparo pasando cadena 1 a minusculas
				{
					if ((cd1[i] + 32) != pre[i]) resultado = false;
				}

			} 
			else //si no es mayusculas la letra de cadena
			{
				//miro a ver si la letra equivalente del prefijo es mayusculas 
				if (pre[i] <= 90) //en el caso de que si lo sea comparo pero pasando el prefijo a minusculas
				{
					 if (cd1[i] != (pre[i] + 32)) resultado = false;
				}
				else //si tampoco es mayusculas comprado directamente 
				{
					if (cd1[i] != pre[i]) resultado = false;
				}
			
			}
		}
				
		return resultado;//empieza siendo true y solo cambia si se da el caso de que no coincida alguna letra
	}
	
	
	
	
	
	
	
	/**
	 * metodo que te indica	si la cadena acaba con el sufijo dado
	 * @param cadena
	 * @param sufijo
	 * @return true si termina en el sufijo, false si no lo hace
	 */
	public boolean acabaEn(String cadena, String sufijo)// comprobado funciona
	{
		char[] cd1 = cadena.toCharArray();
		char[] suf = sufijo.toCharArray();
		
		boolean resultado = true;
		int ptoInicio = cadena.length() - sufijo.length();
		
		//out.println(ptoInicio);
		
		int numSufijo = 0 ;
		
		if (ptoInicio < 0) ; //no pasara nada
		else 
		{
			for (int i = ptoInicio; i < cadena.length(); i++) 
			{
				
				
				if (cd1[i] < 65 || cd1[i] > 122 || (cd1[i] >90) && (cd1[i] < 97)) //si no es letra comparo directamente
				{
					if (cd1[i] != suf[numSufijo]) resultado = false;
				}
				
				if (cd1[i] <= 90) //en el caaso de que la letra de cadena sea mayusculas
				{
					//miro a ver si la letra equivalente del sufijo tb es mayusculas 
					if (suf[numSufijo] <= 90) //en el caso de que si lo sea
					{
						//comparo las dos directamente  
						if (cd1[i] != suf[numSufijo]) resultado = false;
						//out.println("cd es "+cd1[i] + " y sufijo es " +suf[numSufijo]);
					}
					else //si la letra del suffijo no es mayusculas da false pk debe ser como metodo endsWith
					{
						resultado = false;
					}

				} 
				else //si no es mayusculas la letra de cadena
				{
					//miro a ver si la letra equivalente del suffijo es mayusculas 
					if (suf[numSufijo] <= 90) //en el caso de que si lo sea 
					{
						//esta modificaci�n la realizo porque el metodo endsWith si distingue may de min y debo hacerlo igual
						 resultado = false;
					}
					else //si tampoco es mayusculas comprado directamente 
					{
						if (cd1[i] != suf[numSufijo]) resultado = false;
					}
				
				}
				numSufijo++;
			}
			
		}
		
		
				
		return resultado;//empieza siendo true y solo cambia si se da el caso de que no coincida alguna letra
	}
	
	
	
	
	
	
	
	
	/**
	 *  metodo que te devuelve la posicion en la que se encuentra una letra/conjunto de letras en un string
	 * @param cadena
	 * @param letra
	 * @return un -1 si no esta la cadena o char y un numero long que indica l aposicion si esta
	 */
	public long posicionPrimeraCadena(String cadena, String letras) //funciona, comprobado!!
	{
		char[] cad = cadena.toCharArray();
		char[] reg = letras.toCharArray();
		
		
		for (int i = 0; i < cad.length; i++) //paso por todo los char de la cadena y los comparo con el primer char del string o char a buscar
		{
			boolean reglaConfirmada = false; //cada vuelta comienza con la regla no confirmada.
			
			
			if (cad[i] == reg[0])  //coincidencia encontrada 
			{
				reglaConfirmada = true; //indico la confirmacinon de la regla como positiva
				
				
				for (int j = i; j < i + reg.length; j++) 
				{
					
					for (int j2 = 0; j2 < reg.length; j2++) //comparo desde la posicion indicada con la regla
					{
						if (cad[j] != reg[j2]) 
						{
							reglaConfirmada = false; //y solo en el caso de que los siguientes chars no coincidan lo cambio a false
							
						}
						j++;
					}
				}
				
				if (reglaConfirmada == true) //si al salir del for, resulta que si se ha encontrado la cadena
				{
					//devuelvo la posicion en la que se encuentra ->>				
					return i;
					
				}
				 //si al final resulta que no era la misma cadena se sigue compararndo
				
				
			}
			
		}
		return -1;
	}
	
	
	
	
	
	
	
	/**
	 * metodo que te devuelve una parte del string, para ello deberas de indicarle desde donde quieres que te devuelva
	 * @param cadena
	 * @param posicionInicio
	 * @return una cadena de caracteres (string)
	 */
	public String extraerSubstring(String cadena, int posicionInicio) //comprobado funciona
	{
		char[] cd1 = cadena.toCharArray();
		String substring = "";
		
		for (int i = posicionInicio; i < cd1.length; i++) 
		{
			substring += cd1[i];
		}
		return substring;
	}
	
	
	
	
	
	
	
	/**
	 * funcion que te devuelve una parte del string, para ello	deberas de indicarle desde donde quieres que te devuelva y hasta donde
	 * @param cadena
	 * @param posicionInicio
	 * @param posicionFinal
	 * @return una cadena de caracteres (string)
	 */
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal)//comprobado, funciona
	{
		char[] cd1 = cadena.toCharArray();
		String substring = "";
		
		for (int i = posicionInicio; i < posicionFinal; i++) 
		{
			substring += cd1[i];
		}
		return substring;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * metodo elcual te concatena dos cadenas usando el operando +
	 * @param cadena1
	 * @param cadena2
	 * @return una cadena de caracteres (string)
	 */
	public String concatenaCadenas(String cadena1, String cadena2)//comprobado funciona
	{
		char[] cd2 = cadena2.toCharArray();

		for (int i = 0; i < cd2.length; i++) 
		{
			cadena1 += cd2[i];
		}
		
		return cadena1;
		
		
		//otra forma return cadena1 + cadena2;   pero para hacerlo diferente al ejercicio anterior
	}
	
	
}
