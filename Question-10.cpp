#include <iostream>
using namespace std;

class Matrix
{
    int row, column;
    int m[10][10];

public:
    Matrix()
    {
        row = column = 0;
    }

    Matrix(int r, int c)
    {
        row = r;
        column = c;
    }

    void init()
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                cin >> m[i][j];
            }
        }
    }

    void display()
    {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                cout << m[i][j] << " ";
            }
            cout << "\n";
        }
    }

    friend Matrix operator+(Matrix obj1, Matrix obj2);
    friend Matrix operator*(Matrix obj1, Matrix obj2);
};

Matrix operator+(Matrix obj1, Matrix obj2)
{
    Matrix temp;

    temp.row = obj1.row;
    temp.column = obj1.column;

    for (int i = 0; i < obj1.row; i++)
    {
        for (int j = 0; j < obj1.column; j++)
        {
            temp.m[i][j] = obj1.m[i][j] + obj2.m[i][j];
        }
    }

    return temp;
}

Matrix operator*(Matrix obj1, Matrix obj2)
{
    Matrix temp(obj1.row, obj2.column);

    temp.row = obj1.row;
    temp.column = obj1.column;

    for (int i = 0; i < temp.row; i++)
    {
        for (int j = 0; j < temp.column; j++)
        {
            for (int k = 0; k < temp.column; k++)
            {
                temp.m[i][j] = temp.m[i][j] + obj1.m[i][k] + obj2.m[k][j];
            }
        }
    }

    return temp;
}

int main()
{
    int r1, c1, r2, c2;

    cout << "Enter row & column for first matrix : ";
    cin >> r1 >> c1;

    Matrix m1(r1, c1);
    m1.init();

    cout << "Enter row & column for second matrix : ";
    cin >> r2 >> c2;

    Matrix m2(r2, c2);
    m2.init();

    if (r1 != r2 || c1 != c2)
        cout << "Addition is not possible !!!\n";

    else
    {
        Matrix m3 = m1 + m2;
        m3.display();
    }

    if (c1 != r2)
        cout << "Multiplication is not possible !!!\n";

    else
    {
        Matrix m3 = m1 * m2;
        m3.display();
    }

    return 0;
}