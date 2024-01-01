# Java Aplicado a Teste de Software..
![teste](teste.jpg)

## Este material foi desenvolvido em resposta a disciplina 'Teste de Software', a qual faz parte do curso de Pós Graduação em Tecnologia Java, ministrado pela Universidade Tecnológica Federal do Paraná.
🎉 Os projetos, são exercícios solicitados ao longo do curso que juntos perfazem a nota que compõem a média final.

🥋 Se você está entrando no Java agora, vou deixar um comentário apenas para orientá-lo, caso considere o código deste exercício estranho. Este exercício, foi considerado pelo professor e os demais colegas como HARD. (_😎tirei nota máxima_), contudo, o assunto aqui é TESTE DE SOFTWARE. Isso, por si só, não é nada convencional, pois, grande quantidade de desenvolvedores não estão acostumados com teste. Caso se identifique, considere que TESTE DE SOFTWARE é uma potencialidade do Java explorada por todos que se reservam o direito de escrever código de qualidade.

## Testar

😵 Objetivo:

    - Identificar Defeitos:
        - Encontrar e corrigir defeitos no software antes que ele seja entregue ao cliente.
        - Garantir que o software atenda aos requisitos especificados.
        
    - Assegurar Qualidade:
        - Verificar se o software atende aos padrões de qualidade definidos.
        - Garantir que o software seja confiável, eficiente e fácil de manter.
        
Validar Requisitos:

Certificar-se de que o software implementa corretamente os requisitos do cliente.
Confirmar que o software atende às expectativas do usuário.
Garantir Confiabilidade:

Testar para garantir que o software é robusto e tolerante a falhas.
Verificar o comportamento do software sob diferentes condições.
Melhorar a Manutenção:

Facilitar a detecção e correção de defeitos após o lançamento.
Manter a estabilidade do software durante as atualizações.
Aumentar a Confiança do Cliente:

Demonstrar ao cliente que o software foi testado de maneira abrangente.
Construir a confiança do cliente na qualidade do produto...

🧭 Pontos Principais no Teste de Software em Java:
Testes Unitários:

Testar unidades individuais de código, como métodos ou classes, para garantir que funcionem conforme esperado.
Frameworks populares: JUnit, TestNG.
Testes de Integração:

Verificar a interação entre diferentes módulos ou componentes do sistema.
Garantir que as partes do sistema funcionem bem juntas.
Identificar problemas de comunicação entre componentes.
Testes Funcionais:

Avaliar se o software atende aos requisitos funcionais.
Testar casos de uso do usuário para garantir que o sistema realize as operações esperadas.
Testes Não Funcionais:

Avaliar características não funcionais, como desempenho, segurança, usabilidade.
Garantir que o software atenda aos critérios de desempenho e segurança.
Testes de Regressão:

Executar testes após alterações no código para garantir que as alterações não quebraram funcionalidades existentes.
Automatizar sempre que possível para economizar tempo.
Testes de Aceitação do Usuário (UAT):

Realizados pelo cliente para validar se o software atende às necessidades de negócios.
Confirmar se o software está pronto para produção.
Testes de Desempenho:

Avaliar o desempenho do software sob diferentes condições de carga.
Identificar gargalos e otimizar o desempenho.
Testes de Segurança:

Identificar vulnerabilidades e garantir que o software seja resistente a ataques.
Testar a integridade e confidencialidade dos dados.
Automação de Testes:

Automatizar testes repetitivos para economizar tempo e aumentar a cobertura.
Use ferramentas de automação como Selenium, JMeter, etc.
Documentação de Testes:

Criar e manter documentação abrangente de casos de teste, resultados e procedimentos.
Facilitar a replicação e manutenção dos testes.
Testes de Usabilidade:

Avaliar a facilidade de uso e a experiência do usuário.
Garantir que o software seja intuitivo e amigável.
Ciclo de Vida Contínuo:

Integre testes em todo o ciclo de vida do desenvolvimento.
Teste de forma contínua para detectar e corrigir defeitos desde o início.
Ao adotar uma abordagem abrangente para testes de software em Java, as equipes podem melhorar a qualidade do software, fornecer uma experiência mais confiável aos usuários e garantir a conformidade com os requisitos especificados.

## Enunciado da atividade
👉 Desenvolva uma aplicação baseado na situação-problema: uma cidade está realizando uma eleição. Você é o desenvolvedor que projetará uma aplicação capaz de receber os votos de cada urna espalhada na cidade. Muita atenção neste trecho do enunciado. Estamos emulando uma eleição real. Tal como as urnas eletrônicas funcionam. Lembre-se que programas existem para solucionar situações da vida real, utilizando estudos de caso na vida real. 

Assim, pede-se:

- O servidor RMI deverá estar apto a realizar duas funções:
    - Contar todos os votos;
    - Receber votos (contendo os nomes dos candidatos e os números de votos);

- Cada urna (cliente RMI) deverá enviar os nomes e o número de votos de cada candidato para o servidor.  Esses nomes deverão ser entrados no console. Os números de votos também deverão ser entrados pelo console.

- O servidor deverá exibir a apuração de votos atualizada a cada 5 segundos....

  ### Alguns pontos importantes:
  - Sua aplicação deverá receber candidatos do mundo real (João, Maria, Vitor, etc.)
  - O usuário (o avaliador) deverá interagir com seu programa. O nome do candidato (ou o número do candidato) deverá ser entrado (lembre-se que na urna eletrônica real votamos por     números, mas aqui pode entrar também o nome). Os votos também.
  - Não pré-programe inserção automática de candidatos e votos, no código.
  - O usuário (o avaliador) deverá observar as atualizações no output do servidor que será atualizado a cada 5 segundos.
  - Não quebre padrões de programação. Exemplo: Se seus programas sempre possuem interface em português, não utilize outro idioma. Não faria o menor sentido corporativo, um programador   passar a exibir na sua interface, o idioma russo ou árabe, depois que apresentou 05 programas em português. Isso mesmo com um programa funcionando e atendendo os requisitos solicitados.  Quebrar padrões desfavorece o programador.
  - Evite que seu programa seja um robô que faça tudo automaticamente, com parâmetros passados automaticamente, imperceptíveis ao usuário. Lembre-se que este programa interage.

# Tecnologia utilizada:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Tabela de Conteúdos

- [Instalação](#Instalação)
- [Uso](#Uso)
- [Contribuição](#Contribuição)

## Instalação

1. Clone o repositório ou baixe o arquivo .zip:

```bash
git clone https://github.com/alfecjo/redes.git
```
## Uso

1. Execute em sua IDE de preferência. Contudo, o desenvolvimento foi feito no NetBeans, ideal JDK 11 ao 13! Você pode começar com: "mvn install", no diretório raiz, que é onde se    encontra o arquivo pom.xml. Desta forma, serão baixadas as dependências, caso seja necessário.
2. A idéia central aqui é que usando RMI, o Cliente forneça os dados de entrada para a urna e o efetivo algoritmo do cálculo de contabilização dos votos seja construído no Servidor. Lembrando que o acesso será de várias máquinas simultâneas e que é considerado boa prática, ao encerrar as operações no Cliente com a contabilização total, desligar o servidor através do Cliente com envio do comando partindo do Cliente e interceptado/executado pelo Servidor...(por se tratar de boa prática, não está no enunciado, más é dever do programador incluir esta rotina na execução do código)
3. Caso tenha o Java instalado, você precisa apenas executar os arquivos .class em máquinas distintas. Caso queira, também é possível, através da criação de dois projetos Java simples e em máquinas distintas dispor os devidos .java para máquina1 e máquina2. Observando que a Interface está associada ao Servidor.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, [convenções de commit](https://www.conventionalcommits.org/en/v1.0.0/), e envie suas alterações em um branch separado.

Muito obrigado!!





