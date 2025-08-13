// Função para a barra de pesquisa
document.querySelector('.search-btn').addEventListener('click', function() {
    const searchTerm = document.querySelector('.search-input').value.toLowerCase();
    alert(`Você pesquisou por: "${searchTerm}"\nFuncionalidade de busca será implementada aqui.`);
});

// Permitir busca com Enter
document.querySelector('.search-input').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        document.querySelector('.search-btn').click();
    }
});

// Efeito de hover nos cards
document.querySelectorAll('.movie-card').forEach(card => {
    card.addEventListener('click', function() {
        const title = this.querySelector('.movie-title').textContent;
        alert(`Assistindo trailer de "${title}"\nPlayer de vídeo será implementado aqui.`);
    });
});
