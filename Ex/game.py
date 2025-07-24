import pygame
import random
cor = 1
# Initialize pygame
pygame.init()
pygame.mixer.init()

# Set the window size
width = 800
height = 800

# Create the window
window = pygame.display.set_mode((width, height))

# Set the title of the window
pygame.display.set_caption("DVD")

# Create the ball and set its initial position
ball = pygame.Surface((50, 50))

ball_rect = ball.get_rect()
ball_rect.x = 320
ball_rect.y = 240
ball = pygame.image.load('dvd-logo-png-31.png')

# Set the initial velocity of the ball
vx = random.uniform(-5, 5)
vy = random.uniform(-5, 5)

# Set frame limit
clock = pygame.time.Clock()

# DVD logo
def DVD():
    window.blit(ball,(ball_rect.x, ball_rect.y))

# Run the game loop
running = True
while running:

    for event in pygame.event.get():
        if event == pygame.QUIT:
            running = False
    

    # Clear the window
    window.fill((0, 0, 0))

    # Update the position of the ball
    ball_rect.x += vx
    ball_rect.y += vy
    
    # Check if the ball has hit a wall
    if ball_rect.left <= 0 or ball_rect.right >= width - 240:
        vx = -vx

        if cor == 1:
            ball = pygame.image.load('dvd-logo-png-31B.png')
        if cor == 2:
            ball = pygame.image.load('dvd-logo-png-31Y.png')
        if cor == 3:
            ball = pygame.image.load('dvd-logo-png-31.png')
            cor = 0
        cor += 1
        
    if ball_rect.top <= 0 or ball_rect.bottom >= height - 190:
        vy = -vy

        if cor == 1:
            ball = pygame.image.load('dvd-logo-png-31B.png')
        if cor == 2:
            ball = pygame.image.load('dvd-logo-png-31Y.png')
        if cor == 3:
            ball = pygame.image.load('dvd-logo-png-31.png')
            cor = 0
        cor += 1
        
    # Draw the ball on the window
    DVD()
    
    # Update the display
    pygame.display.update()
    clock.tick(90)
    
# Quit pygame
pygame.quit()
