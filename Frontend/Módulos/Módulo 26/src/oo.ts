class Pessoa {
    nome: string;
    renda?: number;

    constructor(nome: string, renda?: number){
        this.nome = nome;
        this.renda = renda;
    }

    dizOla(): string{
        return `${this.nome} disse oi`
    }
}


class ContaBancaria{
    protected saldo: number = 0;
    numeroConta: number;

    constructor(numeroDaConta: number){
        this.numeroConta = numeroDaConta;
    }

    static retornaNumeroDoBanco(){
        return 125;
    }

    private getSaldo(){
        return this.saldo;
    }

    depSaldo(valor: number){
        this.saldo += valor;
    }
}

class ContaBancariaPessoaFisica extends ContaBancaria{
    depSaldo(valor: number): void {
        this.saldo = valor * 2;
    }
}

const contaDoPedro = new ContaBancariaPessoaFisica(123345)
// contaDoPedro.
ContaBancaria.retornaNumeroDoBanco
