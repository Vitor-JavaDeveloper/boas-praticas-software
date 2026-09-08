### 1. Qual era o principal problema do código original?
O código original utilizava variáveis com nomes genéricos e pouco descritivos (`n`, `a`, `b`, `c`), além de concentrar toda a lógica (cálculos, validações e exibição de dados) dentro do método `main`, violando os princípios de legibilidade e separação de responsabilidades.

### 2. Quais melhorias você realizou?
- **Renomeação de Variáveis:** As variáveis receberam nomes legíveis e autoexplicativos (`nomeAluno`, `nota1`, `nota2`, `media`).
- **Modularização:** A lógica foi dividida nos métodos `calcularMedia`, `verificarSituacao` e `exibirRelatorio`.
- **Padronização:** Aplicação das convenções do Java (camelCase para métodos e variáveis) e alinhamento do código.

### 3. Como a modularização facilitou a organização do código?
A modularização permitiu isolar cada responsabilidade. O cálculo da média fica restrito ao método `calcularMedia`, a regra de aprovação ao `verificarSituacao`, e a exibição de saída ao `exibirRelatorio`. Isso facilita a manutenção, reutilização e possibilita a criação de testes unitários no futuro.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu manter a versão original preservada no histórico da branch `main`, enquanto as alterações de refatoração foram desenvolvidas em uma branch isolada (`melhoria-boas-praticas`). Através do Pull Request e do Merge, foi possível analisar com clareza a evolução do código e integrar o código final de maneira limpa e rastreável.