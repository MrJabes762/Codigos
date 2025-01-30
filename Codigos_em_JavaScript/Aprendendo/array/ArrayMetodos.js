const pilotos = ['vetel', 'alonso', 'Raikkonen', 'Massa']

console.log(pilotos);

// O método Pop remove o ultimo elemento do array
pilotos.pop(); 

console.log(pilotos);

// Já este método adicona na ultima posição 

pilotos.push('Senna');

console.log(pilotos);

//O método Shift remove a primeira posição 

pilotos.shift();

console.log(pilotos);

//Ao contrario do shift ele adiciona na primeira posição 

pilotos.unshift('Hamilton');

console.log(pilotos);

// O Splice pode adicnonar / remover elementos em determinadas posições 
// adicionar

pilotos.splice(2,0,'Botas','Ibraimovick')// O zero é indicativo de não haver eliminação 

console.log(pilotos);

//Remover

pilotos.splice(4,1);// vou remover o elemento de indice 4 e apenas 1

console.log(pilotos);

//O metodo slice retorna um novo array a partir do indice informado

const algunsPilotos  = pilotos.slice(2);

console.log(pilotos);

console.log(algunsPilotos);

const algunsPilotos2 = pilotos.slice(1,4);// nesse exemplo ele pega retorna o array entre o primeiro indice informado ate o ultimo (segundo indice)

console.log(algunsPilotos2);