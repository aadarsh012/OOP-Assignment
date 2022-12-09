// Overload + & * operators for matrix addition & multiplication where each matrix is an object of user defined class Matrix.

#include <iostream>
using namespace std;

class Matrix
{
    int row, column;
    int m[10][10];

public:
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

    Matrix operator+(Matrix mat)
    {
        Matrix temp(0, 0);

        temp.row = row;
        temp.column = column;

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                temp.m[i][j] = m[i][j] + mat.m[i][j];
            }
        }

        return temp;
    }

    Matrix operator*(Matrix mat)
    {
        Matrix temp(0, 0);

        temp.row = row;
        temp.column = column;

        for (int i = 0; i < temp.row; i++)
        {
            for (int j = 0; j < temp.column; j++)
            {
                for (int k = 0; k < column; k++)
                    temp.m[i][j] = temp.m[i][j] + (m[i][k] * mat.m[k][j]);
            }
        }

        return temp;
    }
};

int main()
{
    int r1, c1, r2, c2;

    Matrix m1(r1, c1);

    cout << "Enter row & column for first matrix : ";
    cin >> r1 >> c1;

    Matrix m2(r2, c2);

    cout << "Enter row & column for second matrix : ";
    cin >> r2 >> c2;

    Matrix m3(0, 0);

    if (r1 != r2 || c1 != c2)
        cout << "Addition is not possible\n";

    else
    {
        cout << "Input all element for first matrix :\n";
        m1.init();

        cout << "Input all element for second matrix :\n";
        m2.init();

        m3 = m1 + m2;

        cout << "After addition :\n";
        m2.display();
    }

    if (c1 != r2)
        cout << "Multiple is not possible.\n";

    else
    {
        m3 = m1 * m2;

        cout << "After multiplication result is :\n";

        m3.display();
    }

    return 0;
}