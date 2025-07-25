document.addEventListener('DOMContentLoaded', function() {
    const buttons = document.querySelectorAll('[data-tab-button]');
    const questions = document.querySelectorAll('[data-faq-question]');
    const heroSection = document.querySelector('.hero');
    const alturaHero = heroSection.clientHeight;

    //Cabeçalho
    window.addEventListener('scroll', function() {
        const posicaoAtual = window.scrollY;

        if (posicaoAtual < alturaHero){
            ocultaElementosDoHeader();
        } else{
            exibeElementosdoHeader();
        }
    });

    if (window.scrollY < alturaHero) {
        ocultaElementosDoHeader();
    } else {
        exibeElementosdoHeader();
    }

//Atrações, abas
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].addEventListener('click', function(botao) {
            const abaAlvo = botao.target.dataset.tabButton;
            const aba = document.querySelector(`[data-tab-id=${abaAlvo}]`)
            escondeTodasAbas();
            aba.classList.add('versoes-jogos__list--is--active');
            removeBotaoAtivo();
            botao.target.classList.add('versoes-jogos__tabs__button--is--active');
        })
    }

    //Seção FAQ
    for (let i = 0; i < questions.length; i++) {
        questions[i].addEventListener('click', abreOuFechaResposta)
    }
})

function ocultaElementosDoHeader(){
    const header = document.querySelector('header');
    header.classList.add('header--is--hidden');
}
function exibeElementosdoHeader(){
    const header = document.querySelector('header');
    header.classList.remove('header--is--hidden');
}

function abreOuFechaResposta(elemento)
{
    const classe = 'faq__questions__item--is--open';
    const elementoPai = elemento.target.parentNode;

    elementoPai.classList.toggle(classe);
}
function removeBotaoAtivo () {
    const buttons = document.querySelectorAll('[data-tab-button]');
    for (let i = 0; i < buttons.length; i++) {
        buttons[i].classList.remove('versoes-jogos__tabs__button--is--active');
    }
}


function escondeTodasAbas () {
    const tabsContainer = document.querySelectorAll('[data-tab-id]');

    for (let i = 0; i < tabsContainer.length; i++) {
        tabsContainer[i].classList.remove('versoes-jogos__list--is--active');
    }
}