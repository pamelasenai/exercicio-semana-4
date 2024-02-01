![logo.png](logo.png)

# Exercícios da Semana 4
#### _(29/01/2024 a 02/02/2024)_
> - Para testar o funcionamento do código do exercício 5 basta rodar o método main. <br>
> - No arquivo foi adicionado o método popularListas apenas para incluir dados e facilitar os testes, podendo ser removido sem afetar o funcionamento do código. <br>
> - Os exercícios de 1 a 4 possuem commit com seu nome para facilitar a busca do código do respectivo exercício. 
---

## 📖 [M1S04] Ex 1 - Lista de Cursos e Professores
Criar dois ArrayList para armazenar lista de cursos e professores. <br>
Utilizando um laço de repetição, pedir ao usuário que informe alguns cursos/professores ou um comando para sair (pode ser "0", mas fique à vontade para mudar). <br>
Para isso, criar funções para:
- Adicionar curso/professores na lista
- Ao sair listar os cursos/professores inseridos

## 📖 [M1S04] Ex 2 - Lista de cursos e professores - Com menu de opções
Vamos melhorar nosso sistema!<br>
O usuário precisa manipular as listas de cursos e professores, portanto precisaremos adicionar a funcionalidade de um menu de opções: <br>

Opções (números são sugestões para executar as ações): <br>
(1) Listar <br>
(2) Adicionar <br>
(0) Sair <br>

- Quando a opção escolhida for "Listar", utilizar a função de listagem criada no Exercício 1.
- Quando a opção escolhida for "Adicionar", utilizar a função criada para adicionar no Exercício 1.
- Altere a função listar para que seja exibido o índice ao lado de cada item, usaremos posteriormente.

## 📖 [M1S04] Ex 3 - Lista de cursos e professores - Nova opção no menu
Após esta refatoração realizada no Exercício 2, adicione uma opção no menu para que o curso/professores seja removido. <br>

Nova opção (números são sugestões para executar as ações): <br>
(3) Remover

Criar 3 novas funções (nomes das funções são apenas sugestões): <br>
1. "listarPedirIndice":
    - utilizar a função de listagem (com índices - conforme alterado no Exercício 2).
    - pedir ao usuário que escolha um item da lista
    - retornar o índice escolhido
2. "removerItemLista":
    - utilizar a função "listarPedirIndice"
    - utilizar a função "removerItem" (próxima função a ser criada) e passar como parâmetro o índice retornado da função "listarPedirIndice"
3. "removerItem":
    - precisa receber o índice por parâmetro
    - na sequência realizar a remoção do item existente no índice

## 📖 [M1S04] Ex 4 - Lista de cursos concluídos
Continuando nosso projeto! <br>
Vamos criar uma nova lista para armazenar os cursos que já foram concluídos pelo usuário. <br>
Após criar a lista, será necessário adicionar mais opções no menu: <br>

Novas opção (números são sugestões para executar as ações): <br>
(4) Marcar como concluído
(5) Listar concluídos

Criar novas função (nome da função é apenas sugestão): <br>
1. "marcarComoConcluído":
    - utilizar a função "listarPedirIndice" (criada no Exercício 3)
    - adicionar na nova lista de concluídos o curso escolhido pelo usuário
    - remover item da lista de cursos utilizando a função "removerItem" (criada no Exercício 3). Dessa forma o curso/professores será movido para a nova lista.

## 📖 [M1S04] Ex 5 - (POO Abstração) Criar classes de curso e professor
Vamos adicionar um pouco de Orientação à Objetos em nosso projeto.  <br>

1. Crie uma classe de curso com ao menos:
    - Atributos:-> Nome-> Descrição-> Professores-> Carga horária
    - Métodos:-> Progresso-> Notas-> Participação <br>

_Obs.: Os métodos podem conter apenas textos que imprimam no console_

2. Crie uma classe de professor com ao menos:
    - Atributos:-> Nome-> Especialidade
    - Métodos:-> Ensinar <br>

_Obs.: Os métodos podem conter apenas textos que imprimam no console_