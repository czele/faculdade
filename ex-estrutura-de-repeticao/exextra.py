cdninicial = int(input("Informe o valor inicial da repetição: "))
nfinal = int(input("Informe o valor final da repetição: "))
somaimpar = 0
somapar = 0
contadorpar = 0
contadorimpar = 0

while ninicial <= nfinal:
# par
    if (ninicial % 2 == 0):
        #Da forma extensa   
        somapar = somapar + ninicial
        contadorpar += 1       
        
# ímpar
    else:
        #Da forma compacta
        somaimpar += ninicial
        contadorimpar += 1          
        
    ninicial += 1

print("A soma dos números pares é ", somapar)
print("A soma dos números ímpares é ",somaimpar)

print("A quantidade que somou pares foi", contadorpar)
print("A quantidade que somou ímpares foi", contadorimpar)