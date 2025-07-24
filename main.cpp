#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    //const double PI = 3.14159;
    //cout << PI << endl;
    //printf("PI = %.2lf", PI );
    //double r;
    //r=(double)5/2;
    //cout<< r << endl;
    //int a,b = 3;
    //cout << "Variable a: " << a << endl;
    //cout << "Variable b: " << b << endl;
    //char a = 'D';
    //char b = 68;
    //cout << "a is " << a << endl;
    //cout << "b is " << b << endl;
    //printf("a is %c", a);
    int num1, num2, num3,largest;

    cout << "Enter value 1: ";
    cin >> num1;

    cout << "Enter value 2: ";
    cin >> num2;

    cout << "Enter value 3: ";
    cin >> num3;

    if((num1 >= num2) && (num1 >= num3))
    {
      largest = num1;
    }
    else if((num2 >= num1) && (num2 >= num3))
        largest = num2;
    else
        largest = num3;

    cout << "Largest number between " <<num1 <<", "<<num2<<" and "<<num3<<" is "<<largest<<endl;


    return 0;
}
