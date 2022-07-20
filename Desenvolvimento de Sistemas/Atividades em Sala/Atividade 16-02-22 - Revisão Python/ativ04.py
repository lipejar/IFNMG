print("=-"*10, " Soma números digitados ", "-="*10)

lista = []
while True:
    num = float(input("Digite um valor: "))
    lista.append(num)

    if (num == 0):
        break

print (f"A soma dos números digitados é {sum(lista)}")
