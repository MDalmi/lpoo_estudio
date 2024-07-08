/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.testProduto;

import br.edu.ifsul.cc.lpoo.lpoo_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Alunos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Contratos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.FolhaPagamento;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.FormaPgt;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Modalidades;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pagamentos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pessoas;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.itensContratos;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Pacotes;
import br.edu.ifsul.cc.lpoo.lpoo_danca.model.Professores;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
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

        //buscar objeto
        //Modalidades aux1 = (Modalidades) jpa.find(Modalidades.class, m.getDescricao());
        //verificar se objeto persistido é igual ao criado
        //Assert.assertEquals(m.getDescricao(), aux1.getDescricao());
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

    }

    //@Test
    public void testePersistenciaPacote_Modalidade() throws Exception {

        Pacotes p = new Pacotes();
        Modalidades m = new Modalidades();

        m.setDescricao("Dança da Chuva");
        m.setId(1);

        p.setDescricao("Pacote Danca da Chuva");
        p.setModalidade(m);
        p.setValor(1500.0);

        jpa.persist(m);
        jpa.persist(p);
    }

    @Test
    public void testePersistenciaContrato_Pagamento() throws Exception {

        Pacotes p = new Pacotes();
        Modalidades m = new Modalidades();

        m.setDescricao("Dança da Chuva");
       

        p.setDescricao("Pacote Danca da Chuva");
        p.setModalidade(m);
        p.setValor(1500.0);

        jpa.persist(m);
        jpa.persist(p);
   
        itensContratos ic1 = new itensContratos();
        ic1.setPacote(p);
        
       jpa.persist(ic1);
        
        Alunos a = new Alunos();
        a.setId(1);
        a.setEmail("seucarro.co");
        a.setEndereco("Rua da Calma");
        a.setFone("123123123");
        a.setNome("Suares");
        a.setDataPgm(18);
        a.setDataInicio(Calendar.getInstance());
        
       
        jpa.persist(a);
        

        Contratos contrato = new Contratos();
        
       
        contrato.setValorDesconto(100.0);
        contrato.setFormaPgt(FormaPgt.PIX); // Exemplo de enum FormaPgt
        contrato.setAluno(a);
        contrato.setItensContrato(ic1);

        jpa.persist(contrato);
        
        
        Pagamentos p1 = new Pagamentos();
        
        Calendar c = Calendar.getInstance();
        c.set(2024, 4, 20);
        
        p1.setContrato(contrato);
        p1.setDataPgt(Calendar.getInstance());
        p1.setDataVcto(c);
        p1.setValor(1350.0);
        
        jpa.persist(p1);
       
         List<Modalidades> moda = new ArrayList<>();
         moda.add(m);
         
         
        FolhaPagamento FP = new FolhaPagamento();
       
        FP.setData(c);
        FP.setValorReceber(1500.0);
        FP.setNumeroPag(12);
        List<FolhaPagamento> pag = new ArrayList<>();
        pag.add(FP);
        
        Professores prof = new Professores();
        prof.setDataAniver(c);
        prof.setId(2);
        prof.setDataAdmissao(c);
        prof.setEmail("12312");
        prof.setEndereco("12312");
        prof.setFone("12312");
        
        FP.setProfessor(prof);
        prof.setNome("Cesar");
        prof.setModalidades(moda);
        
        prof.setFolhapagamento(pag);
        
        
        jpa.persist(prof);
        
    
        jpa.persist(FP);
    }   

}
