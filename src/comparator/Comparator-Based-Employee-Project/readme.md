# Comparator Interface Example
![Screenshot (182)](https://github.com/sidz111/Java-Projects/assets/119784108/9ed6f467-32bc-45bb-9376-aec9c2bba3fa)
![Screenshot (178)](https://github.com/sidz111/Java-Projects/assets/119784108/b3b8642c-7dcb-47d4-90ec-b48ed74cb894)
![Screenshot (179)](https://github.com/sidz111/Java-Projects/assets/119784108/71087412-8e8e-4beb-9154-a97ce355aaca)
![Screenshot (180)](https://github.com/sidz111/Java-Projects/assets/119784108/dc62349f-2bdc-4b9e-a5f9-fd7d310f4c84)
![Screenshot (181)](https://github.com/sidz111/Java-Projects/assets/119784108/93b764d9-b8ca-409c-942f-1fad801dccda)


This Java project demonstrates the usage of the Comparator interface, allowing sorting objects based on custom criteria. In this project, we have an `Emp` class representing an employee with attributes such as id, name, and salary. Additionally, there are three comparator classes (`IdComparator`, `NameComparator`, and `SalaryComparator`) that allow sorting `Emp` objects based on their id, name, and salary, respectively.

## Classes

- **Emp.java**: 
  - Represents an employee with id, name, and salary attributes.
  - Provides methods for setting and getting attributes, as well as a `toString()` method for displaying employee information.

- **IdComparator.java**:
  - Implements the Comparator interface to compare `Emp` objects based on their ids.
  - Defines a `compare()` method that compares two `Emp` objects based on their ids.

- **NameComparator.java**:
  - Implements the Comparator interface to compare `Emp` objects based on their names.
  - Defines a `compare()` method that compares two `Emp` objects based on their names.

- **SalaryComparator.java**:
  - Implements the Comparator interface to compare `Emp` objects based on their salaries.
  - Defines a `compare()` method that compares two `Emp` objects based on their salaries.

## Usage

You can use these comparator classes to sort lists of `Emp` objects based on different criteria such as id, name, or salary.

#### Example Usage:

```java
List<Emp> empList = new ArrayList<>();
// Add Emp objects to empList

// Sort by id
Collections.sort(empList, new IdComparator());

// Sort by name
Collections.sort(empList, new NameComparator());

// Sort by salary
Collections.sort(empList, new SalaryComparator());
