package net.bonvio.service.entityImplementation;

import net.bonvio.model.Employee;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.entityInterface.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class EmployeeServiceImpl extends GenericServiceImpl<Employee> implements EmployeeService {

}