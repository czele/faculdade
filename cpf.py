from curses.ascii import isdigit

# Caso o programa dê erro instale a lib: pip install windows-curses
cpf = input("Digite seu cpf (apenas números): ")
soma = 0

while cpf.isdigit() == False:
    cpf = input("Por favor, digite apenas números: ")
if cpf.isdigit() == True:
# Achando a soma dos valores do cpf
    for x in cpf:
        soma = soma + int(x)
    print(soma)
# Verificando se o cpf é válido
    if str(soma)[0] == str(soma)[1]:
        print("Seu cpf é válido")
    else:
        print("Seu cpf não é válido")
