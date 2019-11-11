import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Campbell", "JT 66 66 G", 700.00, "Board", 10000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Campbell", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JT 66 66 G", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(700.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(10000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.99);
        assertEquals(701.99, director.getSalary(), 0.01);
    }

    @Test
    public void canNotRaiseSalaryNegativeNumber() {
        director.raiseSalary(-1.00);
        assertEquals(700.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(7.00, director.payBonus(), 0.01);
    }
}
