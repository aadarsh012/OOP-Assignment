#include <iostream>
using namespace std;

class Employee
{
public:
    string name;
    int age;
    double salary;
    Employee *next;
};

class EmployeeList
{
    Employee *head;
    Employee *tail;

    int size;

public:
    EmployeeList()
    {
        head = NULL;
        tail = NULL;
        size = 0;
    }

    void addEmployee()
    {
        string name;
        cout << "Enter the name : ";
        cin >> name;

        int age;
        cout << "Enter the age : ";
        cin >> age;

        double salary;
        cout << "Enter the salary : ";
        cin >> salary;

        Employee *newEmployee = new Employee();

        newEmployee->name = name;
        newEmployee->age = age;
        newEmployee->salary = salary;
        newEmployee->next = NULL;

        if (head == NULL)
        {
            head = newEmployee;
            tail = newEmployee;
        }

        else
        {
            tail->next = newEmployee;
            tail = newEmployee;
        }

        size++;
    }
    
    void printEmployeeList()
    {
        Employee *temp = head;
        while (temp != NULL)
        {
            cout << "Employee Name : " << temp->name << "\n";
            cout << "Employee Age : " << temp->age << "\n";
            cout << "Employee Salary : " << temp->salary << "\n";
            temp = temp->next;
        }
    }

    void searchEmployee()
    {
        string name;
        cout << "Enter the name : ";
        cin >> name;

        Employee *temp = head;

        while (temp != NULL)
        {
            if (temp->name == name)
            {
                cout << temp->name << " " << temp->age << " " << temp->salary << "\n";
                return;
            }

            temp = temp->next;
        }

        cout << "Employee not found!!!\n";
    }
};

int main()
{
    EmployeeList *e = new EmployeeList;

    e->addEmployee();
    
    int choice;

    while (true)
    {
        cout << "Do you want to continue? (Press '1' to continue, '0' to break) : ";
        cin >> choice;

        if (choice == 0)
            break;

        else
            e->addEmployee();
    }

    cout << "\nEmployee List :-\n";
    e->printEmployeeList();
    cout << "\n";

    e->searchEmployee();
    e->searchEmployee();

    return 0;
}