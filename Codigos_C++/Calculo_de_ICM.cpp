#include <iostream>
using namespace std;

int main() {
  float altura = 0.0, peso = 0.0, IMC = 0.0;
  cout << "-> Informe a sua altura: ";
  cin >> altura;
  cout << "\n-> Informe seu peso: ";
  cin >> peso;
  IMC = (peso / (altura * altura));
  cout << "\n-> Seu indice de massa corporal é "<< IMC;
    if (IMC < 18.5){
      cout << "\n-> Voce está abaixo do peso";
    } else if ((IMC >= 18.5) && (IMC <= 24.99)){
        cout << "\n-> Voce está normal";
      } else if ((IMC >= 25) && (IMC <= 29.99)){
          cout << "\n-> Voce está com sobrepeso";
        }  else {
            cout << "\n-> Voce está Obesidade";
          }
} 