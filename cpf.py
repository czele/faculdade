cpf = input("Digite seu cpf: ")
soma = 0

# try:
# Achando a soma dos valores do cpf
for x in cpf:
    soma = soma + int(x)
    print(soma)
# Verificando se o cpf é válido
if str(soma)[0] == str(soma)[1]:
    print("Seu cpf é válido")
else:
    print("Seu cpf não é válido")
  
# else:
#     print("Digite seu cpf sem pontos e números")

