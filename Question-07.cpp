
// Define a class pattern in C++. Data members in pattern class is :-

// n = number of line

// Methods / Patterns in class are :-

// a. set() to initialize the value of n.

// b. pattern() prints the following 3 patterns in a menu driven program.

// *
// * *
// * * *
// * * * *
// * * * * *
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//       *
//      * *
//     * * *
//    * * * *
//     * * *
//      * *
//       *

#include <iostream>
using namespace std;

class Solution
{
public:
    void patternOne(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                cout << "* ";
            }
            cout << "\n";
        }
    }

    void patternTwo(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (j < n - i - 1)
                    cout << " ";

                else
                    cout << "* ";
            }
            cout << "\n";
        }
    }

    void patternThree(int n)
    {
        int star = 1, space = n / 2;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= space; j++)
            {
                cout << " ";
            }

            for (int j = 0; j < star; j++)
            {
                cout << "* ";
            }

            if (i <= n / 2)
            {
                star++;
                space--;
            }

            else
            {
                star--;
                space++;
            }

            cout << "\n";
        }
    }
};

int main()
{
    cout << "Enter '1' for first pattern, '2' for second pattern, '3' for third pattern & any key for exit.\n";

    int flag = 1;

    while (flag == 1)
    {
        int choice;
        cout << "Enter your choice : ";
        cin >> choice;

        Solution obj;

        if (choice == 1)
        {
            int n;
            cout << "Enter the number of lines : ";
            cin >> n;

            obj.patternOne(n);
            cout << "\n";
        }

        else if (choice == 2)
        {
            int n;
            cout << "Enter the number of lines : ";
            cin >> n;

            obj.patternTwo(n);
            cout << "\n";
        }

        else if (choice == 3)
        {
            int n;
            cout << "Enter the number of lines : ";
            cin >> n;

            obj.patternThree(n);
            cout << "\n";
        }

        else
        {
            flag = 0;
            break;
        }
    }

    return 0;
}