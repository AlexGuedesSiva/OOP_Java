# Encapsulamento

**Encapsulamento** em Java é um dos princípios fundamentais da programação orientada a objetos. Ele envolve a ideia de 
agrupar dados (variáveis) e métodos (funções) relacionados em uma única unidade chamada de classe. O encapsulamento é 
alcançado por meio do uso de modificadores de acesso, como "public", "private" e "protected", que controlam a 
visibilidade dos membros da classe.

A principal ideia por trás do encapsulamento é ocultar a implementação interna dos objetos e fornecer uma interface 
pública consistente para interagir com eles. Isso significa que os detalhes internos da classe, como os valores das 
variáveis de instância, são mantidos privados e não podem ser acessados diretamente de fora da classe. Em vez disso, 
métodos públicos são fornecidos para ler e modificar esses valores, seguindo as regras de validação e lógica definidas 
na classe.

Existem três níveis de acesso em Java:

**Public:** Os membros marcados como "public" são acessíveis a partir de qualquer classe. Eles não têm restrições de 
acesso e podem ser chamados e modificados por qualquer parte do programa.

**Private:** Os membros marcados como "private" são acessíveis somente dentro da própria classe. Eles não podem ser 
acessados diretamente de fora da classe. No entanto, métodos públicos podem ser usados para acessar e modificar os 
membros privados.

**Protected:** Os membros marcados como "protected" são acessíveis dentro da própria classe, bem como em subclasses 
(classes derivadas) e em outras classes do mesmo pacote. Eles não podem ser acessados por classes fora do pacote, a 
menos que sejam subclasses da classe que os contém.

Ao encapsular os membros de uma classe, você pode controlar a forma como eles são acessados e modificados. Isso 
oferece uma série de benefícios, como:

Ocultação de informações: O encapsulamento permite ocultar os detalhes internos de uma classe, fornecendo uma 
interface externa mais simples e clara. Isso facilita o uso da classe por outros desenvolvedores, que não precisam 
conhecer os detalhes de implementação.

Controle de acesso: Ao usar modificadores de acesso, você pode controlar quem pode acessar e modificar os membros da 
classe. Isso ajuda a proteger os dados sensíveis e evita que sejam alterados incorretamente.

Flexibilidade e manutenção: O encapsulamento permite que você altere a implementação interna de uma classe sem afetar 
o código que a utiliza. Desde que a interface pública permaneça a mesma, outras partes do programa não serão afetadas. 
Isso torna o código mais flexível e mais fácil de manter.

Em resumo, o encapsulamento em Java é um conceito fundamental que ajuda a organizar e proteger o código. Ele oferece 
controle sobre a visibilidade dos membros da classe e fornece uma interface consistente para interagir com esses 
membros. O encapsulamento é uma das principais características da programação orientada a objetos e é amplamente 
utilizado para criar código modular, seguro e fácil de usar.