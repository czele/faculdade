escolha=input("Qual o procedimento que deseja (soma, subtração, multiplicação ou divisão): ")
a=int(input("Qual o primeiro valor: "))
b=int(input("Qual o segundo valor: "))

def soma():
    c = a + b
    return c

def subtracao():
    c = a - b
    return c

def multiplicacao():
    c = a * b
    return c

def divisao():
    c = a / b
    return c

if(escolha=="soma"):
    print(soma())    
elif(escolha=="subtracao"):
    print(subtracao())
elif(escolha=="multiplicacao"):
    print(multiplicacao())
elif(escolha=="divisao"):
    print(divisao())



