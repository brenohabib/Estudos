Data_Cars <- mtcars

print(Data_Cars)
print("tabela coluna wt")

print(paste("Média: ", mean(Data_Cars$wt)))

print(paste("Mediana: ", median(Data_Cars$wt)))

print(paste("Moda: ", names(sort(-table(Data_Cars$wt))))[1])

print(paste("Minimo: ", min(Data_Cars$wt)))

print(paste("Maximo: ", max(Data_Cars$wt)))

print(paste("Variância: ", var(Data_Cars$wt)))

print(paste("Desvio Padrão: ", sd(Data_Cars$wt)))

print(paste("Distribuição Normal: "
            , dnorm(3.44, mean(Data_Cars$wt), sd(Data_Cars$wt))))

print(paste("Teste de Hipótese: ", t.test(Data_Cars$wt, Data_Cars$cyl)))

print(paste("Análise de variância: ", aov(wt ~ mpg + cyl, data = Data_Cars)))