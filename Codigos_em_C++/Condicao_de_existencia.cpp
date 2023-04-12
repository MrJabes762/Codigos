#include <iostream>
using namespace std;


int main (){
    float L1 = 0.0, L2 = 0.0, L3 = 0.0;
    cout << "\n-> Informe os 3 Lados do Triângulo: ";
    cin >> L1 >> L2 >> L3;
    cout << ("\n================================================\n");
        if ((L1 > (L2 - L3)) && (L1 < (L2 + L3)) && (L2 > (L1 - L3)) && (L2 < (L1 + L3)) && (L3 > (L1 - L2)) && (L3 < (L1 + L2))) {
            cout << ("\n-> De acordo com a condição de existência. \n");
            cout << ("\n-> Os lados informados formam um triângulo. \n");
            cout << ("\n-> Tipo: ");
                if ((L1 != L2) && (L1 != L3) && (L2 != L1) && (L2 != L3) && (L3 != L1) && (L3 != L2)){
                    cout << (" ESCALENO.\n");
                }
                else if ((L1 = L2 = L3)) {
                    cout << (" EQUILATERO.\n");
                }
                else {
                    cout << (" ISÒCELES.\n");
                }
            cout << ("\n================================================");
        }
        else {
            cout << ("\n-> De acordo com a condição de existência. \n");
            cout << ("\n-> Os lados informados não formam um triângulo. \n");
            cout << ("\n================================================");
        }
    return 0;
}


