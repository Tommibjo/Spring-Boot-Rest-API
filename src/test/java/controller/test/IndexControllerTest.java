 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.test;

import com.yritys.boardtwo.controllers.IndexController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Tommi
 */
public class IndexControllerTest {

    public IndexControllerTest() {
    }

    @Test
    public void homeMetodReturnsIndex() {
        IndexController controller = new IndexController();
        String vastaus = controller.home();

        assertEquals("index", vastaus);
    }
}
