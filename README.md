# javaChainOfResponsibilityPattern

* Padrão da corrente de responsabilidade, padrão comportamental que permite estabelecer uma corrente entre objetos atraves da qual eh passada uma solicitação, feita por um objeto emissor que não sabe qual é o objeto que poderá responder a ela, dessa forma os objetos receptores passarao essa informação ate qual algum deles saiba como respondê-la.

* Composto por uma classe controladora: Classe Handler, que recebe as solicitações do cliente, inicia a corrente e define como o cliente se comunicará com ela, as subclasses que participam da corrente processam a informação do cliente de acordo com o critério pré-estabelecido.

* PROPOSITO:
  * É um design patterm comportamental que permite que as solicitações passem por uma corrente de manipuladores. Ao receber uma solicitação, cada um deles decide se    vai processa-la ou repassa-la ao próximo manipulador.

* SOLUÇÃO:
  * Criar uma corrente com as classes manipuladoras para processar a solicitação de um cliente. Cada uma possui um campo para armazenar uma referencia ao próximo manipulador na corrente. A solicitação viaja até que todos os manipuladores tenham a chance de processá-la (Os manipuladores podem decidir não aprovar a solicitação e interromper o procedimento)
