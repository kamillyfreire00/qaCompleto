1) Título:
Login válido
2) Resumo:
Caso de teste para validar o acesso do login padrão
3) URL:
https://www.saucedemo.com/
4) Passos (Pré-requisitos + Passo-a-passo):
Pré-requisito:
- Entrar na página https://www.saucedemo.com/
Passo-a-passo:
4.1) Inserir em "Username" o usuário "standard_user"
4.2) Inserir em "Password" a senha "secret_sauce"
4.3) Clicar em "Login"

5) Resultado (validações):
- Foi redirecionado para a tela de "Produtos" (Products)

2) Título:
Login inválido - Usuário errado
2) Resumo:
Caso de teste para validar a mensagem de erro do login inválido.
3) URL:
https://www.saucedemo.com/
4) Passos (Pré-requisitos + Passo-a-passo):
Pré-requisito:
- Entrar na página https://www.saucedemo.com/
Passo-a-passo:
4.1) Inserir em "Username" o usuário "standard_errado"
4.2) Inserir em "Password" a senha "secret_sauce"
4.3) Clicar em "Login"

5) Resultado (validações):
- É informada na caixa de erro a mensagem de login inválido


3) Título:
Login inválido - Senha errada
2) Resumo:
Caso de teste para validar a mensagem de erro do login inválido, com senha errada.
3) URL:
https://www.saucedemo.com/
4) Passos (Pré-requisitos + Passo-a-passo):
Pré-requisito:
- Entrar na página https://www.saucedemo.com/
Passo-a-passo:
4.1) Inserir em "Username" o usuário "standard_user"
4.2) Inserir em "Password" a senha "secret_errada"
4.3) Clicar em "Login"

5) Resultado (validações):
- É informada na caixa de erro a mensagem de login inválido

4) Título:
Login inválido - Username em branco
2) Resumo:
Caso de teste para validar a mensagem de erro do login inválido, com username em branco.
3) URL:
https://www.saucedemo.com/
4) Passos (Pré-requisitos + Passo-a-passo):
Pré-requisito:
- Entrar na página https://www.saucedemo.com/
Passo-a-passo:
4.1) Inserir em "Username" o usuário ""
4.2) Inserir em "Password" a senha "secret_errada"
4.3) Clicar em "Login"

5) Resultado (validações):
- É informada na caixa de erro a mensagem de login inválido, exigindo o username


5) Título:
Login inválido - Password em branco
2) Resumo:
Caso de teste para validar a mensagem de erro do login inválido, com password em branco.
3) URL:
https://www.saucedemo.com/
4) Passos (Pré-requisitos + Passo-a-passo):
Pré-requisito:
- Entrar na página https://www.saucedemo.com/
Passo-a-passo:
4.1) Inserir em "Username" o usuário ""
4.2) Inserir em "Password" a senha "secret_errada"
4.3) Clicar em "Login"

5) Resultado (validações):
- É informada na caixa de erro a mensagem de login inválido, exigindo o password.