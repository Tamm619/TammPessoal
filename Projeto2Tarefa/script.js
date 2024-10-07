const form = document.getElementById('form-contatos');
const contatos = [];
let linhas = '';

form.addEventListener('submit', function(e) {
    e.preventDefault();
    
    const inputNomeContato = document.getElementById('nome-contato');
    const inputNumeroContato = document.getElementById('numero-contato');

    if (contatos.some(contato => contato.nome === inputNomeContato.value)) {
        alert('Este contato já foi adicionado!');
    } else {
        adicionaLinha(inputNomeContato.value, inputNumeroContato.value);
        atualizaTabela();
    }

    inputNomeContato.value = '';
    inputNumeroContato.value = '';
});

function adicionaLinha(nome, numero) {
    const novoContato = { nome, numero };
    contatos.push(novoContato);

    let linha = '<tr>';
    linha += `<td>${nome}</td>`;
    linha += `<td>${numero}</td>`;
    linha += '</tr>';

    linhas += linha;
}

function atualizaTabela() {
    const corpoTabela = document.querySelector('tbody');
    corpoTabela.innerHTML = linhas;
}
