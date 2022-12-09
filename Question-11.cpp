// Create a class student Attributes are :-

// name, roll, department, avarage marks

// NOTE :- All members are private

#include <iostream>
using namespace std;

class Student
{
    string name;
    int roll;
    string dept;
    double avgMarks;

public:
    Student()
    {
        cout << "Name : ";
        cin >> name;

        cout << "Roll : ";
        cin >> roll;
        cout << "Department : ";
        cin >> dept;
        cout << "Avarage Marks : ";
        cin >> avgMarks;
    }

    void display()
    {
        cout << "Name : " << name << "\n";
        cout << "Roll : " << roll << "\n";
        cout << "dept : " << dept << "\n";
        cout << "Avarage Marks : " << avgMarks << "\n";
    }
};

class StudentList
{
    int size;
    Student **list;

public:
    StudentList(int n)
    {
        size = n;
        list = new Student *[size];
    }

    void input()
    {
        for (int i = 0; i < size; i++)
        {
            list[i] = new Student();
        }
    }

    void output()
    {
        for (int i = 0; i < size; i++)
        {
            list[i]->display();
        }
    }
};

int main()
{
    int n;
    cout << "Enter the no. of students : ";
    cin >> n;

    StudentList st(n);
    st.input();
    st.output();

    return 0;
}