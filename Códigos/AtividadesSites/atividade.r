# Em um grupo de cinco pessoas, com idades de 19, 23, 25, 28 e 99 anos.
# qual é a Média Aritmética de suas idades?
mean_array <- c(19, 23, 25, 28, 99)
paste("Média: ", mean(mean_array))

#Uma mulher, deu à luz 5 crianças.
#Os pesos dos recém-nascidos foram respectivamente:
#9,2 – 6,4 – 10,5 – 8,1 – 7,8
median_array <- c(9.2, 6.4, 10.5, 8.1, 7.8)
print(paste("Mediana: ", median(median_array)))

#Qual a moda das seguintes idades:
#4 – 5 – 4 – 6 – 5 – 8 – 4 – 4
mode_array <- c(4, 5, 4, 6, 5, 8, 4, 4)
print(paste("Moda: ", names(sort(-table(mode_array))[1])))

#Minimo e máximo da Festa A:
#1 ano – 2 anos – 2 anos – 12 anos – 12 anos e 13 anos
minmax_array <- c(1, 2, 2, 12, 12, 13)
print(paste("Minimo: ", min(minmax_array)))
print(paste("Maximo: ", max(minmax_array)))

#Variância da Festa B:
#5 ano – 6 anos – 7 anos – 7 anos – 8 anos e 9 anos
x <- c(5, 6, 7, 7, 8, 9)
print(paste("Variância: ", var(x)))

#Desvio padrão da Festa B:
x <- c(5, 6, 7, 7, 8, 9)
print(paste("Desvio Padrão: ", sd(x)))

#Para uma distribuição normal dada por:
#X ~ N (u = 100, a² = 25)
x <- c(85, 90, 95, 100, 105, 110, 115)
dis_norm <- pnorm(100, mean(x), sd(x))
print(paste("Distribuição Normal: ", dis_norm))

#Funcionários de uma grande firma de contabilidade afirmam que
#a média dos salários dos contadores é menor do que a de seu concorrente
#que é de $45000. Uma amostra aleatória de 30 contadores da firma mostrou
#a média dos salários é de $43500 e sabe-se de estudos anteriores
#que o desvio padrão é de $5200. Teste a afirmação dos
#funcionários ao nível de 5% de significância
concorrente <- c(38472, 43918, 47609)
amostral <- c(39847, 42125, 45528)
resultado_teste <- t.test(amostral, concorrente, alternative = "less")
print(resultado_teste)

#Analisar o efeito de três tipos diferentes de fertilizantes no
#crescimento de plantas de tomate.
dados <- data.frame(
  altura = c(15, 18, 20, 14, 16, 19, 17, 21, 22, 20,
             12, 14, 16, 13, 15, 18, 20, 21, 19, 23,
             10, 11, 14, 12, 15, 16, 18, 19, 21, 20),
  fertilizante = factor(rep(c("orgânico", "químico", "mineral"), each = 10))
)
anova_fertilizante <- aov(altura ~ fertilizante, data = dados)
print(anova_fertilizante)