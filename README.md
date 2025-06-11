Para esse sistema foram criados dois códigos Java: UF (classe) e Sistema (programa principal). Na classe criada, foram declarados três atributos String: nome, sigla e regiao, representando uma Unidade Federativa.
Nessa mesma classe foi criado um constructor e um método toString que retorna os valores das variáveis no seguinte formato:
  Nome: (String nome)
  Sigla: (String sigla)
  Região: (String regiao)

No programa principal, é criado um HashMap para armazenar os objetos UF, tendo a sigla como chave e o objeto UF como valor. O usuário deve fazer a entrada dos dados dos estados que deseja criar, terminando a leitura quando
digitar "sair" no nome do estado. O sistema cria um objeto UF toda vez que o usuário preenche os dados, adicionando-o ao HashMap criado.
Após terminada a entrada de dados, o programa pede que o usuário digite "sigla" ou "regiao" para começar uma busca pelos estados no HashMap (o programa também é finalizado quando é digitado "sair").
Se escolher "sigla", o programa pede que o usuário digite a sigla do estado que deseja buscar, e retorna os dados (nome, sigla e região) do estado encontrado, começando novamente o processo de busca até que o usuário digite "sair".
Se escolher "regiao", o programa pede que o usuário digite a região que deseja buscar. Após lida a região, o sistema retorna os dados (nome, sigla e região) de todos os estados encontrados nessa região, repetindo o processo de busca até que seja digitado "sair".
