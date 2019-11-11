import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dave", "JJ 99 56 E", 200.00, "DevOps");
    }

    @Test
    public void hasName() {
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JJ 99 56 E", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(200.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void canChangeNameNotNull() {
        manager.changeName("Scott");
        assertEquals("Scott", manager.getName());
    }

    @Test
    public void canChangeNameNull() {
        manager.changeName(null);
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1.99);
        assertEquals(201.99, manager.getSalary(), 0.01);
    }

    @Test
    public void canNotRaiseSalaryNegativeNumber() {
        manager.raiseSalary(-1.00);
        assertEquals(200.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2.00, manager.payBonus(), 0.01);
    }
}
