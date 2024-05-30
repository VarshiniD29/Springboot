import axios from "axios"; // Correct import statement

const EMPLOYEE_BASE_REST_API_URL = 'http://localhost:8080/api/v1/employees';

class EmployeeService {

    getAllEmployees(){
        return axios.get(EMPLOYEE_BASE_REST_API_URL); // Correct usage of axios
    }
}

export default new EmployeeService();
