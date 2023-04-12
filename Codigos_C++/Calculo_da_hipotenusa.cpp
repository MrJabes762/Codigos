#include <iostream>
#include <math.h> 
using namespace std;

int main() {
  float A = 0.0, B = 0.0, H = 0.0;
  cout << "-> Informe a medida dos catetos: \n";
  cin >> A >> B;
  H = sqrt ((pow (A,2) + pow (B,2)));
  cout << "\n-> A medida de Hipotenusa é "<< H;
} 