# Desafio Movieflix Casos de Uso

## Descrição do Projeto

Este projeto implementa funcionalidades para o sistema Movieflix, permitindo aos usuários listar filmes por gênero e visualizar detalhes de cada filme, incluindo avaliações dos usuários. O objetivo é garantir que todos os testes automatizados passem conforme especificado nos casos de uso.

### Listar Filmes

- **Entrada:** O usuário visitante ou membro seleciona opcionalmente um gênero.
- **Saída:** O sistema apresenta uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título. Se um gênero foi selecionado, a listagem é restrita ao gênero escolhido.

### Visualizar Detalhes do Filme

- **Entrada:** O usuário visitante ou membro seleciona um filme.
- **Saída:** O sistema exibe título, subtítulo, ano, imagem, sinopse do filme e uma lista das avaliações dos usuários, incluindo o nome do usuário que fez cada avaliação.
- **Entrada (opcional para membros):** O usuário membro pode adicionar uma avaliação para o filme.
- **Saída:** Após a avaliação, o sistema apresenta os dados atualizados, incluindo a nova avaliação do filme.

#### Exceção 3.1 - Texto Vazio

- **Cenário:** O usuário tenta enviar uma avaliação com texto vazio.
- **Saída:** O sistema exibe uma mensagem informando que não é permitido texto vazio na avaliação.

- ## Tecnologias Utilizadas
- Java
- Spring Boot
- JPA/Hibernate
- Maven
- JUnit

## Ferramentas Utilizadas

- Spring Tool Suite 4 
- Postman (para testar APIs)
