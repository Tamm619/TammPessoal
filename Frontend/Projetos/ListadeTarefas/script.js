$(document).ready(function() {
    $('#form-tarefa').on('submit', function(event) {
        event.preventDefault();
        
        const tarefa = $('#nome-tarefa').val();
        
        if (tarefa) {
            $('#lista-tarefas').append(`<li>${tarefa}</li>`);
            $('#nome-tarefa').val('');
        }
    });

    $('#lista-tarefas').on('click', 'li', function() {
        $(this).toggleClass('completed');
    });
});
