package pucrs.si.qp.t1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
	@Test
    public void testIsosceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testVariante3()
    {
        int actual = App.identificaTriangulo(6, 7, 6);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testeValorZero()
    {
        try {
            App.identificaTriangulo(8, 0, 9);
        }catch (RuntimeException e){
            System.out.println("Nenhum lado pode ser igual ou menor a 0. Verifique.");
        }
    }


    @Test
    public void testeValorNegativo()
    {
        try {
            App.identificaTriangulo(2, 3, -4);
        }catch (RuntimeException e){
            System.out.println("Nenhum lado pode ser igual ou menor a 0. Verifique.");
        }
    }

    @Test
    public void testNaoTrian()
    {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testVarianteSete() {
        int actual = App.identificaTriangulo(1, 2, 3);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }

    @Test
    public void testVarianteSete2() {
        int actual = App.identificaTriangulo(3, 1, 2);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }

}