import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class CadenaAlumnoTest 
{
	/*@BeforeClass 
	public static void crearCadenas()
	{
		CadenaAlumno c = new CadenaAlumno();
		String cadena1 = "entornos";
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
	public void testEsMayor() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testEsMenor() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testComparaIgnorandoMayusculas() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testReemplazaTodos() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testReemplazaPrimero() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testMuestraSplitLimite() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testMuestraSplit() 
	{
		fail("No implementado aun");
	}

	@Test
	public void testQuitaEspacios() {
		fail("No implementado aun");
	}

	@Test
	public void testConvertirMayusculas() {
		fail("No implementado aun");
	}

	@Test
	public void testConvertirMinusculas() {
		fail("No implementado aun");
	}

	@Test
	public void testLongitudCadena() {
		fail("No implementado aun");
	}

	@Test
	public void testEmpiezaCon() {
		fail("No implementado aun");
	}

	@Test
	public void testAcabaEn() {
		fail("No implementado aun");
	}

	@Test
	public void testPosicionPrimeraCadena() {
		fail("No implementado aun");
	}

	@Test
	public void testExtraerSubstringStringInt() {
		fail("No implementado aun");
	}

	@Test
	public void testExtraerSubstringStringIntInt() {
		fail("No implementado aun");
	}

	@Test
	public void testConcatenaCadenas() {
		fail("No implementado aun");
	}

}
