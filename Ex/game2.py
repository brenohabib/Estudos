import pygame
from sys import exit


def run():
    #inicializando o jogo
    pygame.init()
    pygame.display.set_caption('Teste de Jogo')
    framerate = pygame.time.Clock()
    jogador = pygame.Surface((100,100))
    jogador.fill('Blue')
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                exit()
        pygame.display.update()
        screen.blit(jogador,(100,100))
        framerate.tick(60)

        

w = 800
h = 600
screen = pygame.display.set_mode((w, h))
run()