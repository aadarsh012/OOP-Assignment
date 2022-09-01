#include <iostream>
using namespace std;

class Complex
{
    float real, imaginary;

public:
    void set(float r, float i)
    {
        real = r;
        imaginary = i;
    }

    void addition(Complex c1, Complex c2)
    {
        this->real = c1.real + c2.real;
        this->imaginary = c1.imaginary + c2.imaginary;
    }

    void multiplication(Complex c1, Complex c2)
    {
        this->real = c1.real * c2.real;
        this->imaginary = c1.imaginary * c2.imaginary;
    }

    void display()
    {
        if (imaginary < 0)
            cout << real << " - " << abs(imaginary) << "i\n";

        else
            cout << real << " + " << imaginary << "i\n";
    }
};

int main()
{
    Complex c1, c2, c3;

    float a;
    cout << "Enter the real number : ";
    cin >> a;

    float b;
    cout << "Enter the imaginary number : ";
    cin >> b;

    c1.set(a, b);

    float c;
    cout << "Enter the real number : ";
    cin >> c;

    float d;
    cout << "Enter the imaginary number : ";
    cin >> d;

    c2.set(c, d);

    c3.addition(c1, c2);
    cout << "Addition of two complex numbers : ";
    c3.display();

    c3.multiplication(c1, c2);
    cout << "Multiplication of two complex numbers : ";
    c2.display();

    return 0;
}