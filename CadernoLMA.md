# Tesouro do Pirata

## Modelos de Análise em UML

### Diagrama de Casos de Uso

>💡 Escreva um diagrama de casos de uso em PlantUML que melhor descreva as seguintes afirmações:
>
> 1. O jogo do "Tesouro do Pirata" contém uma caverna com um explorador, uma chave e um baú de jóias.
> 2. Em cada jogada, o explorador pode tocar na chave ou no baú.
> 3. O explorador fica com a chave quando toca nela.
> 4. O explorador fica com o baú quando toca nele e possui a chave.
> 5. O jogo termina quando o explorador possui o baú.

Com ajuda da ferramenta IA, foi produzido o seguinte modelo de casos de uso:

![Primeiro modelo de Casos de Uso](image\1.png)

```sh
@startuml
actor Explorador
left to right direction
 
package "<<system>>\nJogo Tesouro do Pirata" {

usecase "<<use case>>\nInício do Jogo" as UC1
usecase "<<use case>>\nTocar na Chave" as UC2
usecase "<<use case>>\nTocar no Baú" as UC3
usecase "**Terminar Jogo**" as UC4

}
 
Explorador -- UC1
Explorador -- UC2
Explorador -- UC3
Explorador -- UC4
 
@enduml
```

#### Arquitetura

- __Início do jogo__ representa a operação que coloca o sistema em estado inicial de uso.
- __Toque na chave__ e __Toque no baú__ correspondem, respectivamente à ação de toque na chave e no baú, realizadas pelo _Explorador_.
- __Término do jogo__ encontra-se no modo de operação que conduz ao seu estado final.

### Diagrama de Atividades

>💡 Escreva um diagrama de atividades em "PlantUML" que melhor descreva as seguintes afirmações referentes ao "Tesouro do Pirata". Enfatize a ordem de ocorrência das atividades e as eventuais condições que controlam o fluxo de controle comportamental:
>
> 1. No estado inicial de operação, o jogo do "Tesouro do Pirata" contém uma caverna com um explorador, uma chave e um baú de jóias.
> 2. Em cada jogada, o explorador pode tocar na chave ou no baú, exclusivamente.
> 3. O explorador fica com a chave quando toca nela.
> 4. O explorador fica com o baú quando toca nele e possui a chave.
> 5. O jogo termina quando o explorador possui o baú.

Com ajuda da ferramenta IA, foram produzidos os seguintes modelos:

```sh
@startuml
|Início|
start

:Inicializar jogo;
:Colocar caverna com explorador, chave e baú;

repeat
  :Explorador toca na chave ou no baú;
  
  if (Explorador toca na chave?) then (Sim)
    :Adicionar chave ao inventário do explorador;
  else (Não)
    if (Explorador toca no baú?) then (Sim)
      if (Explorador possui a chave?) then (Sim)
        :Adicionar baú ao inventário do explorador;
        :Terminar jogo;
        stop
      else (Não)
        :Nada muda no inventário;
      endif
    else (Não)
      :Nada muda no inventário;
    endif
  endif

repeat while (Explorador não possui o baú)
@enduml
```

```sh
@startuml
start

:Início do Jogo;
:Explorador, Chave e Baú na Caverna;

repeat
  :Explorador Toca na Chave ou no Baú;
  
  if (Explorador toca na Chave?) then (sim)
    :Explorador pega a Chave;
  else
    if (Explorador toca no Baú?) then (sim)
      if (Explorador possui a Chave?) then (sim)
        :Explorador pega o Baú;
        stop
      else (não)
        :Explorador não pode pegar o Baú;
      endif
    else (não)
      :Nada acontece;
    endif
  endif

repeat while (Explorador não possui o Baú)

@enduml
```

```sh
@startuml
start
:Explorador, Chave, Baú de jóias;
while (Explorador não possui o baú) is (true)
  :Explorador toca na chave;
  if (Explorador possui a chave?) then (yes)
    :Explorador fica com a chave;
  else (no)
    :Explorador toca no baú;
    if (Explorador possui a chave?) then (yes)
      :Explorador fica com o baú;
    endif
  endif
endwhile
stop
@enduml
```

#### Arquitetura

- __Início do jogo__ representa a operação que coloca o sistema em estado inicial de uso.
- __Toque na chave__ e __Toque no baú__ correspondem, respectivamente à ação de toque na chave e no baú, realizadas pelo _Explorador_.
- __Término do jogo__ encontra-se no modo de operação que conduz ao seu estado final.

Considerando a análise da proposta, é possível notar que os casos de uso acima não estão inteiramente corretos.

#### Minha versão

```sh
@startuml
|Início|
start

:Inicializar jogo;
:Criar caverna contendo: **explorador, chave, baú**;

:Explorador realiza uma jogada;
  
  if (Jogada do Explorador) then (Toca na Chave)
    :Adicionar chave ao inventário do explorador;
  else (Toca no Baú)
    if (Explorador possui chave?) then (Sim)
        :Adicionar baú ao inventário do explorador;
    else (Não)
    endif
  endif

if (Explorador possui: **chave, baú?**) then (Sim)
    :Fim de jogo;
else (Não)
    -> :Explorador realiza uma jogada;

@enduml
```

### Diagrama de Atividades

>💡  Escreva um código na linguagem de marcação CREOLE que represente a definição da operação "tocar" usando uma tabela.
>
>  No jogo "Tesouro do Pirata", a variável "t" representa qual coisa foi tocada pelo explorador: ou chave (representada pelo valor "CHA") ou baú de jóias (representado pelo valor "BAÚ").
> O inventário do explorador consiste de uma sequência de coisas tocadas.
> A variável "s" representa esse inventário. Inicialmente, o valor "s" é "/>" (a sequência vazia de coisas), representando um inventário vazio. 
> Quando se aplica a operação "tocar" com "t = CHA" e "s = />", obtém-se a sequência "<"CHA">". Sucessivas aplicações de "tocar" com "t = CHA" e "s = <"CHA">" produzem esse mesmo resultado.
> Quando se aplica a operação "tocar" com entradas "t = BAÚ" e "s = />", obtém-se a sequência "/>".
> Quando "t = BAÚ" e "s = <"CHA">", a operação "tocar" retorna "<"CHA", "BAÚ">".

Com ajuda da ferramenta IA, foram produzidos os seguintes modelos de casos de uso:

``` sh
'@startuml
title
<Código CREOLE>
|= t | = s | = Resultado |
| CHA | <> | <"CHA"> |
| CHA | <"CHA"> | <"CHA"> |
| BAÚ | <> | <> |
| BAÚ | <"CHA"> | <"CHA", "BAÚ"> |
end title
@enduml
```

``` sh
'@startuml
title
<Código CREOLE>
|| t || s || Resultado ||
| CHA | <> | <CHA> |
| CHA | <CHA> | <CHA> |
| BAÚ | <> | <> |
| BAÚ | <CHA> | <CHA, BAÚ> |
end title
@enduml
```

### Vista de Desenho

Diagramas de classes

Diagramas de atividades

Outros diagramas

### Vista de Cenários

Manual do usuário

## Código-fonte e Bibliotecas
### Componentes da Aplicação
### Componentes de Teste
### Componentes Externos