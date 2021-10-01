	Resumo do conteudo digital
AGREGAÇÃO E PARTICIONAMENTO.
PARTICIONAMENTO: Dividido o código complexo em classes menores para maior facilidade de codificar, manuntenção e para reutilização de códigos.
AGREGAÇÃO: Quando agregamos várias classes em uma nova classe.

ENCAPSULAMENTO.
Serve para segurança do seu código, evitando acesso direto as variáveis e metodos, permitindo assim que, as informações sejam tratadas antes para depois serem validadas.
TIPOS:
PUBLIC: Sem proteção, acesso livre - qualuqer classe ou aplicação.
VAZIO: Sem proteção, acesso a todos do pacote.
PROTECT: Pode ser acessado por membros da própria classe ou sub classes.
PRIVATE: Os atributos são acessados pela própria classe. sub classes não tem visibilidade, somente tendo acesso atraves dos métodos get e set.

MODIFICADORES STATIC E FINAL.
Referência THIS é um ponteiro de forma implicita do endereçamento do objeto.
o THIS altera a identificação do objeto pelo seu identificador (nome) e só pode referenciar membros da classe.
STATIC:  Quando aplicada em um atributo, o atributo passa a ser atributo da classe e não mais atributo do objeto. O valor do atributo passa a ser compartilhado por todas as instancias, ou seja, qualquer objeto que modifique o valor deste atributo, ele modificará para todos os objetos ja instaciados também.
Quando este modificador Static é aplicado em um método, o método pode ser usado sem que haja necessidade de instanciar um objeto.
FINAL: Aplicado no atributo tornea este atributo constante, ou seja, não poderá ser modificado sem valor.
Se aplicado no método,  este nao poderá ser subscrito. Se aplicado a uma classe, não poderá ser estendido para outras sub classes.

CLASSES ABSTRATAS.
Classes abstratas determinam um conjunto de métodos (regras de negócios), que deverão ser implementadas. Todas as suas sub classes são obrigadas a implementarem estes métodos. Uma classe abstrata não pode ser diretamente instanciada.
MÉTODOS ABSTRATOS: Um método abstrato é apenas declarador, não tem sua implementação codificada.

INTERFACES.
As interfaces se assemelham as classes abstratas, com a diferença de ter somente os métodos declarados. Não possuem atributos, mas se uma classe implementar esta interface, deverá conter todos os métodosdeclarados na interface implementados na classe.

