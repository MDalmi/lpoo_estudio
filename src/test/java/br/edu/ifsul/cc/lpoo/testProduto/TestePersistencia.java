
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.lpoo_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_danca.dao.PersistenciaJPA;
import junit.framework.Assert;
 import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20221PF.CC0003
 */
public class TestePersistencia{
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    
    
    public TestePersistencia() {
    }
    
    
    @Before // o que fazer antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After // o que fazer depois da persistencia
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testePersistencia() throws Exception {
         // criar meu obj
         
         
         
           
     }
}
