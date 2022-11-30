n1 = float(input("Digite a primeira nota do aluno: "))
n2 = float(input("Digite a segunda nota do aluno: "))
n3 = float(input("Digite a terceira nota do aluno: "))

def calcmedia(n1, n2, n3):
    media = (n1 + n2 + n3)/3
    mediafinal = round(media,2)
    if media<7:
        print("Infelizmente você foi reprovado. Sua média foi de", mediafinal)
    else:
        print("Parabéns, você foi aprovado! Sua média foi de", mediafinal)

calcmedia(n1, n2, n3)
