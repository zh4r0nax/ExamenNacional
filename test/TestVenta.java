/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Venta;
import Dao.DaoVentaImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juang
 */
public class TestVenta {
    
    private Venta v;
    private DaoVentaImpl DV;
    
    public TestVenta() {
    }
    
    @Before
    public void setUp() {
        DV = new DaoVentaImpl();
        v = new Venta();
        
    }
    
    @Test
    public void Insertar() {
        boolean result=false;
        v.setIDCliente(1);
        v.setIDTipoVenta(1);
        v.setMonto(5000);
        result = DV.Registrar(v);
        assertTrue(result);
    }
}
