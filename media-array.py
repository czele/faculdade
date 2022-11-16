alunosclasse=int(input("Qual o número de alunos que a classe possuí: "))
medf = []
medsala = 0

# Média de cada aluno com for. O append é a função do Python para adicionar itens em um array

for x in range(alunosclasse):
    nota1=float(input(f"Qual a nota da 1ª prova do aluno nº {x+1}: ")) 
    while (nota1<0 or nota1>10):
        nota1 = float(input("Nota inválida, por favor, digite uma nota entre 0 e 10: "))     

    nota2=float(input(f"Qual a nota da 2ª prova do aluno nº {x+1}: "))
    while (nota2<0 or nota2>10):
        nota2 = float(input("Nota inválida, por favor, digite uma nota entre 0 e 10: ")) 

    med = (nota1 + nota2)/2
    medf.append(med)
print("A lista com a nota dos alunos é: ", medf)

# # Média da sala com for
for x in medf:
    medsala = medsala + x
print("A média da sala é: ", medsala/alunosclasse)
    
# Função do Python que lê o maior número de um array
print("A maior média da sala foi ", max(medf))