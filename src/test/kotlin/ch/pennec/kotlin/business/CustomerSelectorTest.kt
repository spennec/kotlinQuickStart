package ch.pennec.kotlin.business

import ch.pennec.kotlin.model.Customer
import org.junit.Test as Test
import org.junit.Assert.*

/**
 * Created by sebastien on 24.06.17.
 */
class CustomerSelectorTest {

    @Test fun simple() {
        val c1 = Customer("name1", "name2");
        val c2 = Customer("name1name1", "name2");
        val selector = CustomerSelector();
        assertEquals(c2, selector.select(listOf(c1, c2)));
    }


}