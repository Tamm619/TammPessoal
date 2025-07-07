type aluno = {
    nome: string;
    cursos?: string[];
    idade: number;
}


const alunos: aluno[] = [
    {
        nome: 'Carlos',
        cursos: ['Front-end', 'UX/UI'],
        idade: 27,
    },
    {
        nome: 'Alison',
        cursos: ['Front-end', 'Python'],
        idade: 24,
    }
]


alunos.push({
    nome: 'Ana',
    cursos: ['Dados'],
    idade: 21
})

const novoAluno: aluno = {
    nome: 'Mateus',
    idade: 25
}

function exibeAluno(aluno: aluno){
    console.log(aluno.nome)
}