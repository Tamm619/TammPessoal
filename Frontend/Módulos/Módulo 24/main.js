const carro = {
    modelo: 'Fiesta',
    fabricante: 'Ford',
    anoModelo: 2020,
    anoFabricacao: 2019,
    acelerar: function(){
        console.log('vrum');
    }
}

function Carro(modelo, fabricante, anoModelo, anoFabricacao) {
    this.modelo = modelo;
    this.fabricante = fabricante;
    this.anoModelo = anoModelo;
    this.anoFabricacao = anoFabricacao;
    this.acelerar = function(){
        console.log('acelerar');
    }
}

const carroJoao = new Carro('Fiesta', 'Ford', 2020, 2019);
const carroMaria = new Carro('Ka', 'Ford', 2021, 2020);

console.log(carroJoao);
console.log(carroMaria);

const nome = 'Mateus'
const idade = 21
const ehMaiorDeIdade = true
const conhecimentos = ['nada']

const pessoa = {
    nome: nome,
    idade: idade,
    ehMaiorDeIdade: ehMaiorDeIdade,
    conhecimentos: conhecimentos,
}


function exibirAtributo(nomeAtributo){
    console.log(pessoa[nomeAtributo])
}

exibirAtributo('nome');

pessoa['sobrenome'] = undefined;

Object.freeze(pessoa);

pessoa.nome = 'joao';

if (pessoa['sobrenome']) {
    console.log("a pesoa tem um sobrenome")
}

if ('sobrenome' in pessoa){
    console.log('tem sobrenome')
}

console.log(pessoa.nome);
console.log(pessoa['nome']);

console.log(Object.keys(pessoa).length)
console.log(Object.values(pessoa))