/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;
import java.util.Comparator;
/**
 *
 * @author jayra
 */
public class EmployeeComparator implements Comparator<Employee>{
    // over riding the compare method to sort the list of employees by their salary
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.annualPay(), e2.annualPay());
    }
}
//end of code