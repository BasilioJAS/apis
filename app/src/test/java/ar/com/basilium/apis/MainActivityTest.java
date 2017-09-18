package ar.com.basilium.apis;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sader on 16/9/2017.
 */
public class MainActivityTest {
    @Test
    public void test_de_test() throws Exception {
        MainActivity ma = new MainActivity();

        assertEquals(4,ma.test_de_test());
    }

}