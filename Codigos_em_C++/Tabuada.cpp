#include <iostream>
using namespace std;

int main (){
    int cont = 0, T = 0;
    cout << ("\n=====================================================\n");
    cout << ("\n-> Informe o valor que deseja saber a tabuada: ");
    cin >> T;
    cout << ("\n=====================================================\n");
        for (cont = 1; cont <= 10; cont++){
            cout <<"\n" << T << " x "<< cont << " = "<< T * cont;
        }
    cout << ("\n");
    cout << ("\n=====================================================\n");
}
