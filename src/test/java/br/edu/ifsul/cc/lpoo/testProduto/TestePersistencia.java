/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.lpoo_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Alunos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Contratos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.FormaPgt;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Modalidades;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pagamentos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pessoas;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.itensContratos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pacotes;
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
        
        if(jpa.conexaoAberta()){
            
            System.out.println("Conexão Aberta");
            
        }
    }

    @After // o que fazer depois da persistencia
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistenciaModalidade() throws Exception {
        // criar meu obj

        

        //persistir 
        //jpa.persist(m);

        //buscar objeto
        //Modalidades aux1 = (Modalidades) jpa.find(Modalidades.class, m.getDescricao());
        //verificar se objeto persistido é igual ao criado
        //Assert.assertEquals(m.getDescricao(), aux1.getDescricao());
    }

    //@Test
    public void testePersistenciaPagamentos() throws Exception {

        Pagamentos pg = new Pagamentos();
        Contratos c = new Contratos();
        Alunos a = new Alunos();
        itensContratos iC = new itensContratos();

        Calendar c1 = Calendar.getInstance();

        c1.set(2003, 12, 2);

        a.setDataAniver(c1);
        a.setDataInicio(c1);
        a.setDataPgm(15);

        c.setAluno(a);
        c.setDataInicio(c1);
        c.setFormaPgt(FormaPgt.PIX);
        c.setId(1);
        c.setValorDesconto(105.5);

        iC.setContrato(c);
        iC.setIdContrato(Integer.MIN_VALUE);
        iC.setIdPacote(Integer.MIN_VALUE);

        //c.setItensContrato();
        pg.setContrato(c);
        pg.setDataPgt(c1);
        pg.setDataVcto(c1);
        pg.setId(1);
        pg.setValor(205.5);

        jpa.persist(pg);

    }

    //@Test
    public void testePersistenciaAlunos() throws Exception {
        // criar meu obj

        Calendar c = Calendar.getInstance();
        c.set(2003, 7, 19);

        Alunos a = new Alunos();
        a.setDataAniver(c);
        a.setEmail("seucarro.co");
        a.setEndereco("Rua da Calma");
        a.setFone("123123123");
        a.setNome("Suares");
        a.setDataInicio(c);
        a.setDataPgm(18);

        //persistir 
        jpa.persist(a);

        //buscar objeto
        Pessoas aux = (Pessoas) jpa.find(Pessoas.class, a.getNome());

        //verificar se objeto persistido é igual ao criado
        Assert.assertEquals(a.getNome(), aux.getNome());

    }

    //@Test
    public void testePersistenciaPacote_Modalidade() throws Exception {

        Pacotes p = new Pacotes();
        Modalidades m = new Modalidades();

        m.setDescricao("Dança da Chuva");

        p.setDescricao("Pacote Danca da Chuva");
        p.setModalidade(m);
        p.setValor(1500.0);

        jpa.persist(p);
    }

}
