/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.InputStream;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tomi_
 */
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
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
     * Test of buscar method, of class ProductoDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 7;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = null;
        Producto result = instance.buscar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     /**
     * Test of actualizarStock method, of class ProductoDAO.
     */
//    @Test
//    public void testDescripcion(){
//        System.out.println("test descripcion");
//        String nombre = "producto 1";
//        ProductoDAO obj1 = new ProductoDAO();
//        String expResult = "es un producto";
//        String result = ob1.descripcion("")
//        
//        
//    }
    

    /**
     * Test of actualizarStock method, of class ProductoDAO.
     */
//    @Test
//    public void testActualizarStock() {
//        System.out.println("actualizarStock");
//        int id = 7;
//        int stock = 3;
//        ProductoDAO instance = new ProductoDAO();
//        int expResult = 3;
//        int result = instance.actualizarStock(id, stock);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        if (!result.equals(expResult)){
//            fail("The test case is a prototype.");
//        }
//        
//    }

    /**
     * Test of listarId method, of class ProductoDAO.
     */
    @Test
    public void testListarId() {
        System.out.println("listarId");
        int id = 1;
        ProductoDAO instance = new ProductoDAO();
        Producto expResult = new Producto(id, "n",null,"p",20,5);
        Producto result = instance.listarId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult.equals(result)){
            fail("Error");
        }
    }

    /**
     * Test of listar method, of class ProductoDAO.
     */
//    @Test
//    public void testListar() {
//        System.out.println("listar");
//        ProductoDAO instance = new ProductoDAO();
//        List expResult = null;
//        List result = instance.listar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of listarImg method, of class ProductoDAO.
     */
//    @Test
//    public void testListarImg() {
//        System.out.println("listarImg");
//        int id = 7;
//        HttpServletResponse response = null;
//        ProductoDAO instance = new ProductoDAO();
//        instance.listarImg(id, response);
//        // TODO review the generated test code and remove the default call to fail.
//        
//        
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of agregar method, of class ProductoDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Producto p = new Producto(1,"Producto 7",null,"es el producto 7", 12.000,7);
        ProductoDAO instance = new ProductoDAO();
        int expResult = 1;
        int result = instance.agregar(p);
        

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("Error al agregar");
        }
    }

    /**
     * Test of actualizar method, of class ProductoDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Producto p = new Producto(1,"Prod 7", null, "No es el producto 7", 13.000, 8);
        ProductoDAO instance = new ProductoDAO();
        int expResult = 0;
        int result = instance.actualizar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
        
            fail("Error el prueba de actualizar");
        }
       }
        

    /**
     * Test of delete method, of class ProductoDAO.
     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        int id = 0;
//        ProductoDAO instance = new ProductoDAO();
//        instance.delete(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
