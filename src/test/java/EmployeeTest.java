import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Dave", "JJ 99 56 E", 200.00);
    }

    @Test
    public void hasName() {
        assertEquals("Dave", employee.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JJ 99 56 E", employee.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(200.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(1.99);
        assertEquals(201.99, employee.getSalary(), 0.01);
    }


}
