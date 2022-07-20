print("=-"*10, " Verificar número maior ", "-="*10)

num1 = float(input("Digite um Número: "))
num2 = float(input("Digite outro Número: "))

if (num1>num2):
    print(f"O número {num1} é o maior!")
elif (num2>num1):
    print(f"O número {num2} é o maior!")
else:
    print("Os dois números são iguais")