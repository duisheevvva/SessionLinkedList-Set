package service.serviceImpl;

import model.Employee;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public String saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public String assignEmployeeToPharmacy(Long pharmacyId, Long employeeId) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee(Long pharmacyId) {
        return null;
    }

    @Override
    public Employee getByIdEmployee(Long pharmacyId, Long employeeId) {
        return null;
    }

    @Override
    public String updateEmployeeById(Long pharmacyId, Long employeeId, Employee newEmployee) {
        return null;
    }

    @Override
    public String deleteEmployeeById(Long pharmacyId, Long employeeId) {
        return null;
    }

    @Override
    public List<Employee> filterEmployeeByPosition(String position) {
        return null;
    }
}
