package kata09;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SomaTeste {

    
    private List<Item> itens;
    private Verifica verifica;
    
    @Before
    public void inicializa() {
        itens = new ArrayList<Item>();  
        verifica = new Verifica();
    }

    @Test
    public void somaItemComPrecoEspecial() {
    
        itens.add(Item.A);
        itens.add(Item.A);
        itens.add(Item.A);
         
        Assert.assertEquals(130.0, verifica.soma(itens),0.00001);        
        
    }
    
    @Test
    public void somaItemComPrecoUnitario() {
    
        itens.add(Item.C);
        itens.add(Item.C);
        itens.add(Item.C);
        
        Assert.assertEquals(60.0, verifica.soma(itens),0.00001);        
        
    }
    
    @Test
    public void somaItemComPrecoUnitarioComPrecoEspecial() {
    
        itens.add(Item.B);
        itens.add(Item.B);
        itens.add(Item.B);
        
        Assert.assertEquals(75.0, verifica.soma(itens),0.00001);        
        
    }
    
    @Test
    public void somaItemComPrecoUnitarioComOutroItemComPrecoUnitario() {
    
        itens.add(Item.C);
        itens.add(Item.D);
        
        Assert.assertEquals(35.0, verifica.soma(itens),0.00001);        
        
    }
    
    @Test
    public void  somaItemComPrecoEspecialComOutroItemComPrecoEspecial() {
    
        itens.add(Item.A);
        itens.add(Item.A);
        itens.add(Item.A);
        itens.add(Item.B);
        itens.add(Item.B);
        
        Assert.assertEquals(175.0, verifica.soma(itens),0.00001);        
        
    }
    
    @Test
    public void  somaItemComPrecoEspecialComOutroItemComPrecoUnitario() {
    
        itens.add(Item.B);
        itens.add(Item.B);
        itens.add(Item.C);
        
        Assert.assertEquals(65.0, verifica.soma(itens),0.00001);        
        
    }

}