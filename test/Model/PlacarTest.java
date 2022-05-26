/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramom
 */
public class PlacarTest {
    
    private Placar placar;
    
    public PlacarTest() {
        placar = new Placar("Equipe1", "Equipe2","22:00");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEquipe1 method, of class Placar.
     */
    @Test
     public void verificaTime1VencedorSet() {
        System.out.println("Verifica se há times vencedores - Placar: 26 - 25 - Set 1");
        int vencedor = placar.VerificaVencedorSet(26, 25,1);
        assertEquals(0,vencedor);
    }
    @Test
     public void verificaTime2VencedorSet() {
        System.out.println("Verifica se time vencedor é o time2- Placar: 25 - 27 - Set 2");
        int vencedor = placar.VerificaVencedorSet(25, 27, 2);
        assertEquals(2,vencedor);
    }
    @Test
     public void verificaTimeVencedorSet5() {
        System.out.println("Verifica se time vencedor é o time2- Placar: 14 - 15 - Set 5");
        int vencedor = placar.VerificaVencedorSet(14, 15, 5);
        assertEquals(0,vencedor);
    }
    @Test
     public void verificaTime2VencedorSet5() {
        System.out.println("Verifica se time vencedor é o time2- Placar: 14 - 16 - Set 5");
        int vencedor = placar.VerificaVencedorSet(14, 16, 5);
        assertEquals(2,vencedor);
    }
       @Test
     public void verificaTime1VencedorJogo() {
        System.out.println("Verifica se time vencedor é o time1 no Jogo");
        int vencedor = placar.VerificaVencedor(3, 0);
        assertEquals(1,vencedor);
    }
     @Test
    public void verificaTime2VencedorJogo() {
        System.out.println("Verifica se time vencedor é o time2 no Jogo");
        int vencedor = placar.VerificaVencedor(0, 3);
        assertEquals(2,vencedor);
    }
    @Test
    public void verificaTimeVencedorJogo() {
        System.out.println("Verifica há times vencedores no Jogo");
        int vencedor = placar.VerificaVencedor(0, 0);
        assertEquals(0,vencedor);
    }
    @Test
      public void verificaAdicionaPontosTime1() {
        System.out.println("Verifica está adicionando pontos");
        placar.addEquipe1();
        assertEquals(1,placar.getPontosEquipe1());
    }
    @Test
    public void verificaAdicionaPontosTime2() {
        System.out.println("Verifica está adicionando pontos");
        placar.addEquipe2();
        assertEquals(1,placar.getPontosEquipe2());
    }
    @Test
    public void verificaAdicionaSet2() {
        System.out.println("Verifica está adicionando Sets");
        placar.addEquipe2();
        assertEquals(1,placar.getPontosEquipe2());
    }
    @Test
    public void verificaAdicionaSet1() {
        System.out.println("Verifica está adicionando Sets");
        placar.addEquipe1();
        assertEquals(1,placar.getPontosEquipe1());
    }
    
    
}
