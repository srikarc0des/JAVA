package datatypes;

public class dataTypes {
   public static void main(String[] args) {
       byte workingHoursPerDay = 8;                  
       short monthlySalary = 25000;                
       int employeeId = 112233;                     
       long officeContactNumber = 918765432100L; 
       float attendancePercentage = 95.5f;           
       double yearlyBonus = 35000.75;              
       char performanceGrade = 'A';                  
       boolean isEmployeePermanent = true;           

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Working Hours per Day: " + workingHoursPerDay);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
        System.out.println("Office Contact Number: " + officeContactNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");
        System.out.println("Yearly Bonus: ₹" + yearlyBonus);
        System.out.println("Performance Grade: " + performanceGrade);
        System.out.println("Permanent Employee: " + isEmployeePermanent);
    }
}