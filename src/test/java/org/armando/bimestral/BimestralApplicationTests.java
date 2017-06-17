package org.armando.bimestral;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BimestralApplicationTests {
        @Autowired
        RepositorioDireccion repoDireccion;

	@Test
	public void contextLoads() {
	}
            @Test
            public void probarSuma() throws Exception{
            
            int suma=2+2;
            assertEquals(4,suma);
            }
         //   @Test
            public void ProbarInsertDireccion() throws Exception{
      Direccion dir=  repoDireccion.save(new Direccion(777, "calle 13", 551301L,"Ecatepec"));
                assertEquals(new Long(1),dir.getId());
            }
            //@Test
            public void probarBuscarPorId() throws Exception{
            
            Direccion dir=repoDireccion.findOne(1L);
                assertEquals("Ecatepec",dir.getMunicipio());
            }
           // @Test
            public void buscarTodos() throws Exception{
            
           ArrayList<Direccion> dir=(ArrayList <Direccion>) repoDireccion.findAll();
                assertEquals(1,dir.size());
            }
            
            //@Test
            public void eliminar() throws Exception{
            repoDireccion.delete(1L);
            assertEquals(null,repoDireccion.findOne(1L));
            
            
            }
             //@Test
            public void actualizar() throws Exception{
      Direccion dir=  repoDireccion.save(new Direccion(2L,12, "calle 13", 777l,"Ecatepec"));
                assertEquals("Ecatepec",dir.getMunicipio());
}
}
