import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Simon", "KK 99 77 P", 300.00);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", dataBaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("KK 99 77 P", dataBaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(300.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        dataBaseAdmin.raiseSalary(1.99);
        assertEquals(301.99, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(3.00, dataBaseAdmin.payBonus(), 0.01);
    }
}
