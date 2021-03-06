import static org.junit.Assert.*;


import org.junit.Test;


/**
 * Clase para probar los m�tods de la clase CadenaAlumno.java
 * 
 * @author Laura Martinez Priego 1� DAM
 *
 */
public class CadenaAlumnoTest 
{
	/*@BeforeClass 
	public static void crearCadenas()
	{
		CadenaAlumno c = new CadenaAlumno();
		String cadena1 = "entornos";
	}*/
	
	/*@Before
	public static void crearCadenas()
	{
		CadenaAlumno c = new CadenaAlumno();
		String s1 = "entornos";
		String s2 = "entornos";
	}*/
	
	
	//VALOR STRING
	@Test
	public void testToCharArray1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		char[] resultadoReal = cadena.toCharArray("HOLA");
		
		/*LO USE PARA PROBAR SI REALMENTE ME DAB AERROR CUANDO USABA ASSERTEQUALS
		 * for(int i=0;i<resultadoReal.length;i++)
		{
			System.out.println(resultadoReal[i]);
		}*/
		
		char[] resultadoEsperado = {'H', 'O', 'L', 'A'};
		
		/*
		for(int i=0;i<resultadoReal.length;i++)
		{
			System.out.println(resultadoReal[i]);
		}*/
		
		//al principio usando assertEquals me daba error en la prueba, lo solucione con assertArrayEquals
		assertArrayEquals(resultadoReal, resultadoEsperado);
	}
	//VALOR NULL
	@Test
	public void testToCharArray2()
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		char[] resultadoReal = cadena.toCharArray(null);
		
		char[] resultadoEsperado = null;

		assertArrayEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	@Test
	public void testSonIguales1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "ento";
		
		boolean resultadoReal = cadena.sonIguales(s1,s2);		
		boolean resultadoEsperado = s1.equals(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testSonIguales2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ento";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.sonIguales(s1,s2);		
		boolean resultadoEsperado = s1.equals(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testSonIguales3() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "sonrotne";
		
		boolean resultadoReal = cadena.sonIguales(s1,s2);		
		boolean resultadoEsperado = s1.equals(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testSonIguales4() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.sonIguales(s1,s2);		
		boolean resultadoEsperado = s1.equals(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testEsMayor1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "ento";
		
		boolean resultadoReal = cadena.esMayor(s1,s2);		
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEsMayor2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ento";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.esMayor(s1,s2);		
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEsMayor3() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "sonrotne";
		
		boolean resultadoReal = cadena.esMayor(s1,s2);		
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEsMayor4() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.esMayor(s1,s2);		
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testEsMenor1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "ento";
		
		boolean resultadoReal = cadena.esMenor(s1,s2);		
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEsMenor2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ento";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.esMenor(s1,s2);		
		boolean resultadoEsperado = true;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEsMenor3() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "sonrotne";
		
		boolean resultadoReal = cadena.esMenor(s1,s2);		
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEsMenor4()
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.esMenor(s1,s2);		
		boolean resultadoEsperado = false;
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testComparaIgnorandoMayusculas1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ENTORNOS";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.comparaIgnorandoMayusculas(s1,s2);		
		boolean resultadoEsperado = s1.equalsIgnoreCase(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testComparaIgnorandoMayusculas2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ENTO";
		String s2 = "entornos";
		
		boolean resultadoReal = cadena.comparaIgnorandoMayusculas(s1,s2);		
		boolean resultadoEsperado = s1.equalsIgnoreCase(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testComparaIgnorandoMayusculas3() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "1,34";
		String s2 = "1,34";
		
		boolean resultadoReal = cadena.comparaIgnorandoMayusculas(s1,s2);		
		boolean resultadoEsperado = s1.equalsIgnoreCase(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testComparaIgnorandoMayusculas4() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "ENTORNOS";
		
		boolean resultadoReal = cadena.comparaIgnorandoMayusculas(s1,s2);		
		boolean resultadoEsperado = s1.equalsIgnoreCase(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	
	
	
	

	@Test
	public void testReemplazaTodos1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "supercalifragilisticoespialidoso";
		String s2 = "li";
		String s3 = "lo";
		
		String resultadoReal = cadena.reemplazaTodos(s1,s2,s3);		
		String resultadoEsperado = s1.replaceAll(s2, s3);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testReemplazaTodos2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "laura";
		String s2 = "o";
		String s3 = "j";
		
		String resultadoReal = cadena.reemplazaTodos(s1,s2,s3);		
		String resultadoEsperado = s1.replaceAll(s2, s3);
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testReemplazaPrimero1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "supercalifragilisticoespialidoso";
		String s2 = "li";
		String s3 = "lo";
		
		String resultadoReal = cadena.reemplazaPrimero(s1,s2,s3);		
		String resultadoEsperado = s1.replaceFirst(s2, s3);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testReemplazaPrimero2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "laura";
		String s2 = "ok";
		String s3 = "j";
		
		String resultadoReal = cadena.reemplazaPrimero(s1,s2,s3);		
		String resultadoEsperado = s1.replaceFirst(s2, s3);
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testQuitaEspacios() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "Hola Rosa aqui andamos haciendo pruebas";
		
		String resultadoReal = cadena.quitaEspacios(s1);	
		
		//System.out.println(resultadoReal);
		
		String resultadoEsperado = s1.replaceAll(" ", "");
		
		/*System.out.println(resultadoEsperado);
		 * no se cual es la razon pero con esta prueba vi que s1.trim() 
		 * no eliminaba los espacios, asi que busque otra forma
		 */
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testConvertirMayusculas1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "laura chispas";
		
		String resultadoReal = cadena.convertirMayusculas(s1);	
		
		String resultadoEsperado = s1.toUpperCase();
			
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testConvertirMayusculas2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "LaurA chISpaS";
		
		String resultadoReal = cadena.convertirMayusculas(s1);	
		
		String resultadoEsperado = s1.toUpperCase();
			
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testConvertirMinusculas1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "LAURA CHISPAS";
		
		String resultadoReal = cadena.convertirMinusculas(s1);	
		
		String resultadoEsperado = s1.toLowerCase();
	
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testConvertirMinusculas2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "LaurA chISpaS";
		
		String resultadoReal = cadena.convertirMinusculas(s1);	
		
		String resultadoEsperado = s1.toLowerCase();
	
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testLongitudCadena() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "habia una vez un circo";
		
		long resultadoReal = cadena.longitudCadena(s1);	
		
		long resultadoEsperado = s1.length();
	
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testEmpiezaCon1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "Infrahumano";
		String s2 = "In";
		
		boolean resultadoReal = cadena.empiezaCon(s1, s2);		
		boolean resultadoEsperado = s1.startsWith(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEmpiezaCon2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "Infrahumano";
		String s2 = "fra";
		
		boolean resultadoReal = cadena.empiezaCon(s1, s2);		
		boolean resultadoEsperado = s1.startsWith(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEmpiezaCon3() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "1.894,";
		String s2 = "4,";
		
		boolean resultadoReal = cadena.empiezaCon(s1, s2);		
		boolean resultadoEsperado = s1.startsWith(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEmpiezaCon4() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "NOS";
		
		boolean resultadoReal = cadena.empiezaCon(s1, s2);
		
		//System.out.println(resultadoReal);
	
		
		boolean resultadoEsperado = s1.startsWith(s2);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEmpiezaCon5() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ENTORNOS";
		String s2 = "NOS";
		
		boolean resultadoReal = cadena.empiezaCon(s1, s2);
		
		//System.out.println(resultadoReal);
	
		
		boolean resultadoEsperado = s1.startsWith(s2);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testEmpiezaCon6() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ENTORNOS";
		String s2 = "nos";
		
		boolean resultadoReal = cadena.empiezaCon(s1, s2);
		
		//System.out.println(resultadoReal);
	
		
		boolean resultadoEsperado = s1.startsWith(s2);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testAcabaEn1() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "Escandaloso";
		String s2 = "oso";
		
		boolean resultadoReal = cadena.acabaEn(s1, s2);		
		boolean resultadoEsperado = s1.endsWith(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testAcabaEn2() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "Escandaloso";
		String s2 = "can";
		
		boolean resultadoReal = cadena.acabaEn(s1, s2);		
		boolean resultadoEsperado = s1.endsWith(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testAcabaEn3() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "1.894,";
		String s2 = "4,";
		
		boolean resultadoReal = cadena.acabaEn(s1, s2);		
		boolean resultadoEsperado = s1.endsWith(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testAcabaEn4() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "entornos";
		String s2 = "NOS";
		
		boolean resultadoReal = cadena.acabaEn(s1, s2);
		
		//System.out.println(resultadoReal);
	
		
		boolean resultadoEsperado = s1.endsWith(s2);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testAcabaEn5() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ENTORNOS";
		String s2 = "NOS";
		
		boolean resultadoReal = cadena.acabaEn(s1, s2);
		
		//System.out.println(resultadoReal);
	
		
		boolean resultadoEsperado = s1.endsWith(s2);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testAcabaEn6() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "ENTORNOS";
		String s2 = "nos";
		
		boolean resultadoReal = cadena.acabaEn(s1, s2);
		
		//System.out.println(resultadoReal);
	
		
		boolean resultadoEsperado = s1.endsWith(s2);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testPosicionPrimeraCadena() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "supercalifragilisticoespialidoso";
		String s2 = "li";
		
		long resultadoReal = cadena.posicionPrimeraCadena(s1, s2);
		long resultadoEsperado = s1.indexOf(s2);
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testExtraerSubstringStringInt() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "supercalifragilisticoespialidoso";
		int n1 = 9;
		
		String resultadoReal = cadena.extraerSubstring(s1, n1);
		
		//System.out.println(resultadoReal);
		
		String resultadoEsperado = s1.substring(n1);
		
		//System.out.println(resultadoEsperado);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	@Test
	public void testExtraerSubstringStringIntInt() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "supercalifragilisticoespialidoso";
		int n1 = 9;
		int n2 = 20;
		
		String resultadoReal = cadena.extraerSubstring(s1, n1, n2);
		
		String resultadoEsperado = s1.substring(n1, n2);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	
	
	
	
	@Test
	public void testConcatenaCadenas() 
	{
		CadenaAlumno cadena = new CadenaAlumno();
		
		String s1 = "supercalifragi";
		String s2 = "listicoespialidoso";
		
		String resultadoReal = cadena.concatenaCadenas(s1, s2);
		
		String resultadoEsperado = s1.concat(s2);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

}
