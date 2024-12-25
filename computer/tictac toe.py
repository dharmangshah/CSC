def drawcircle():
    import turtle
    t=turtle.Turtle()
    r=40
    t.circle(r)

def drawx():
    import turtle
    t=turtle.Turtle()
    t.right(45)
    t.pendown()
    t.setposition(50,-50)
    t.penup()
    t.left(45)
    t.setposition(0,-50)
    t.pendown()
    t.setposition(50,10)


def tictactoe():
    import turtle
    t=turtle.Turtle()
    t.pendown()
    t.setposition(0,50)
tictactoe()
