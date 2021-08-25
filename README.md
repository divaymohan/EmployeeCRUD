# EmployeeCRUD
## Requests :
 * ### Get Request
    * Get all employees :
                    
            http://65.0.108.144:8080/api/employees/

    * Get One employee using id:
            
            
            http://65.0.108.144:8080/api/employees/(id)
    

* ## Post Request
    * To add employee in database 
            
          http://65.0.108.144:8080/api/employees/

         body:
       ```json 
         {
          "employeeId":12,
          "employeeName":"Divay",
          "employeeSalary": 60000,
          "employeeExperience": 3,
          "employeePost":"cloud Engineer",
          "employeeDepartment":"leadership"

          }
        ```
* ## Put Request
    * To update a employee data
    
             http://65.0.108.144:8080/api/employees/(id)

         body ( you can skip any property ):
       ```json 
         {
          "employeeId":12,
          "employeeName":"Divay",
           "employeeSalary": 60000,
           "employeeExperience": 3,
           "employeePost":"cloud Engineer",
           "employeeDepartment":"leadership"

          }
        ```
* ## Delete Request
    * To delete a employee by it's id

          http://65.0.108.144:8080/api/employees/(id)
          
