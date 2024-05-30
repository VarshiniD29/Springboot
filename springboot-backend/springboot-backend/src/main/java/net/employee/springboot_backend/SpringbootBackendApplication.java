package net.employee.springboot_backend;

import net.employee.springboot_backend.model.Employee;
import net.employee.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/* Employee employee = new Employee();
		employee.setFirstName("Tara");
		employee.setLastName("Singh");
		employee.setEmailId ("tara@cvsr.ac.in");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Ramu");
		employee1.setLastName("Lal");
		employee1.setEmailId ("ramu@cvsr.ac.in");
		employeeRepository.save(employee1);
*/
	}
}
