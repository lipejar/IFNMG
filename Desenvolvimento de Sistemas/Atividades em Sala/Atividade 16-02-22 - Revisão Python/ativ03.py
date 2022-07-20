print("=-"*10, " Potenciação ", "-="*10)

x = float(input("Digite um Número: "))
y = float(input("Digite outro Número: "))

def funcao(x, y):
    result = x**y
    return (result)

print(f"O valor de {x} elevado a {y} é {funcao(x,y)}")