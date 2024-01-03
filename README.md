# ☕ Java Aplicado a Teste de Software..
![teste](teste.jpg)

## Este material foi desenvolvido em resposta a disciplina 'Teste de Software', a qual faz parte do curso de Pós Graduação em Tecnologia Java, ministrado pela Universidade Tecnológica Federal do Paraná.
🎉 Os projetos, são exercícios solicitados ao longo do curso que juntos perfazem a nota que compõem a média final.

🥋 Se você está entrando no Java agora, vou deixar um comentário apenas para orientá-lo, caso considere o código destes exercícios um pouco estranhos. Estes exercícios, compõem a disciplina TESTES e estão dispostos em vários níveis de dificuldade. Desde JUNIOR até HARD. (_😎tirei nota máxima em todos_), contudo, o assunto aqui é TESTE DE SOFTWARE. Isso, por si só, não é nada convencional, pois, grande parte dos desenvolvedores não estão acostumados com teste e os desconsideram. Caso se identifique, considere que TESTE DE SOFTWARE é uma potencialidade do Java explorada por todos que se reservam o direito de escrever código de qualidade. Simplesmente, os TESTES participam de TODO ciclo de vida do projeto.

## 🎯 Por que testar?

        - Encontrar e corrigir defeitos no software antes que ele seja entregue ao cliente.
        - Garantir que o software atenda aos requisitos especificados.        
        - Verificar se o software atende aos padrões de qualidade definidos.
        - Garantir que o software seja confiável, eficiente e fácil de manter.        
        - Certificar-se de que o software implementa corretamente os requisitos do cliente.
        - Confirmar que o software atende às expectativas do usuário.        
        - Testar para garantir que o software é robusto e tolerante a falhas.
        - Verificar o comportamento do software sob diferentes condições.
        - Facilitar a detecção e correção de defeitos após o lançamento.
        - Manter a estabilidade do software durante as atualizações.
        - Demonstrar ao cliente que o software foi testado de maneira abrangente.
        - Construir a confiança do cliente na qualidade do produto...

## 🎯 O que testar?

    - Testar unidades individuais de código, como métodos ou classes, para garantir que funcionem conforme esperado.
        - Frameworks populares: JUnit, TestNG.
        - Verificar a interação entre diferentes módulos ou componentes do sistema.
        - Garantir que as partes do sistema funcionem bem juntas.
        - Identificar problemas de comunicação entre componentes.
        - Avaliar se o software atende aos requisitos funcionais.
    - Testar casos de uso do usuário para garantir que o sistema realize as operações esperadas.
        - Avaliar características não funcionais, como desempenho, segurança, usabilidade.
        - Garantir que o software atenda aos critérios de desempenho e segurança.
        - Executar testes após alterações no código para garantir que as alterações não quebraram funcionalidades existentes.
        - Automatizar sempre que possível para economizar tempo.
        - Realizados pelo cliente para validar se o software atende às necessidades de negócios.
        - Confirmar se o software está pronto para produção.
        - Avaliar o desempenho do software sob diferentes condições de carga.
        - Identificar gargalos e otimizar o desempenho.
        - Identificar vulnerabilidades e garantir que o software seja resistente a ataques.
    - Testar a integridade e confidencialidade dos dados.
        - Automatizar testes repetitivos para economizar tempo e aumentar a cobertura.
        - Use ferramentas de automação como Selenium, JMeter, etc.
        - Criar e manter documentação abrangente de casos de teste, resultados e procedimentos.
        - Facilitar a replicação e manutenção dos testes.
        - Avaliar a facilidade de uso e a experiência do usuário.
        - Garantir que o software seja intuitivo e amigável.
        - Integre testes em todo o ciclo de vida do desenvolvimento.
    - Teste de forma contínua para detectar e corrigir defeitos desde o início.
        
    - Ao adotar uma abordagem abrangente para testes de software em Java, as equipes podem melhorar a qualidade do software, fornecer uma experiência mais confiável aos usuários e garantir a conformidade com os requisitos especificados.

## 🎯 Sobre as atividades..

### 👉 Atividades práticas:

1. **Projeto 1**:
        - [App](Exercicio%2002/identifier/src/main/java/br/identifierApp/App.java)
        - [App](Exercicio%2002/identifier/src/test/java/br/identifierTest/AppTest.java)
   - O programa deve determinar se um Identifier é válido ou não. Um identificador válido deve começar com uma letra e conter apenas letras e/ou dígitos. Além disso, deve ter no mínimo um caractere e no máximo seis caracteres de comprimento.
   - Exemplo:
        abc12 (válido);
        cont*1 (inválido);
        1soma (inválido);
        a123456 (inválido).


- Atividades Teóricas: correspondem a questionários sobre o assunto. Estão em arquivos do tipo .pdf e só podem ser visualizados após serem baixados. Existe uma pasta chamada: Exercícios Teóricos, onde estão os exercícios em forma de relatório, os quais foram solicitados pelo professor.
- Atividades Práticas: correspondem aos exercícios compostos por código executáveis e estão disponibilizados nas pastas com os respectivos nomes que as identificam e são independentes umas das outras. 

 

# Tecnologia utilizada:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Tabela de Conteúdos

- [Instalação](#Instalação)
- [Uso](#Uso)
- [Contribuição](#Contribuição)

## Instalação

1. Clone o repositório ou baixe o arquivo .zip:

```bash
git clone https://github.com/alfecjo/testes.git
```
## Uso

1. Execute em sua IDE de preferência. Contudo, o desenvolvimento foi feito no Eclipse! Você pode começar com: "mvn install", no diretório raiz, que é onde se encontra o arquivo pom.xml. Desta forma, serão baixadas as dependências, caso seja necessário.
2. A idéia central aqui é entender os enunciados que correspondem aos testes, individualmente e montá-los, de preferência na IDE Eclipse, ou caso escolha outra IDE, sempre se faz necessário algumas modificações pontuais. Digo isso porquê já fiz testes no Eclipse (minha preferida para testes) e quando fui aplicar no IntelliJ, VSCode, NetBeans, tive esses problemas.
3. Caso tenha o Java instalado, você precisa apenas lidar com os arquivos .class.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, [convenções de commit](https://www.conventionalcommits.org/en/v1.0.0/), e envie suas alterações em um branch separado.

Muito obrigado!!





