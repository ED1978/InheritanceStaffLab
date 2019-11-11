import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mike", "JK 87 45 R", 400.00);
    }

    @Test
    public void hasName() {
        assertEquals("Mike", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JK 87 45 R", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(400.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.99);
        assertEquals(401.99, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(4.00, developer.payBonus(), 0.01);
    }
}
