/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.lpoo_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Alunos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Modalidades;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pessoas;
import java.util.Calendar;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 20221PF.CC0003
 */
public class TestePersistencia {

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
    //@Test
    public void testePersistenciaModalidade() throws Exception {
        // criar meu obj

        Modalidades m = new Modalidades();
        m.setDescricao("danca livre");

        //persistir 
        jpa.persist(m);

        //buscar objeto
        Modalidades aux1 = (Modalidades) jpa.find(Modalidades.class, m.getDescricao());

        //verificar se objeto persistido é igual ao criado
        Assert.assertEquals(m.getDescricao(), aux1.getDescricao());

    }

    @Test
    public void testePersistenciaAlunos() throws Exception {
        // criar meu obj

        Calendar c = Calendar.getInstance();
        c.set(2003, 7, 19);

        Alunos a = new Alunos();
        a.setDataAniver(c);
        a.setEmail("seucarro.co");
        a.setEndereco("Rua da anta");
        a.setFone("123123123");
        a.setNome("Jô Suares");
        a.setDataInicio(c);
        a.setDataPgm(18);

        //persistir 
        jpa.persist(a);

        //buscar objeto
        Pessoas aux = (Pessoas) jpa.find(Pessoas.class, a.getNome());

        //verificar se objeto persistido é igual ao criado
        Assert.assertEquals(a.getNome(), aux.getNome());

    }
}
