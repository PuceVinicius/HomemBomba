extends KinematicBody2D

const SPEED_FACTOR = 64

export(int) var speed = 0.2

func _ready():
	set_process_input(true)
	

func _input(event):
	if event.is_action("ui_right"):
		move(Vector2(1,0) * speed * SPEED_FACTOR)

	if event.is_action("ui_left"):
		move(Vector2(-1,0) * speed * SPEED_FACTOR)

	if event.is_action("ui_up"):
		move(Vector2(0,-1) * speed * SPEED_FACTOR)

	if event.is_action("ui_down"):
		move(Vector2(0,1) * speed * SPEED_FACTOR)