# MakeChangeProject
leave zero dollars off of the change 0.25 is bad .25 is good
maybe avoid using loops because we are going to improve it later
## How To Run

Initialize variables:

  speed = 0

  acceleration = 1

  distance = 0



Start a loop (representing continuous movement):

  If a "Run" command is received:

    Increase speed by acceleration

  Else if a "Stop" command is received:

    Decrease speed by deceleration

    If speed < 0:

      Set speed to 0  # Ensure speed doesn't go negative

  Calculate distance covered in this time step:

    distance = distance + speed

  Output current speed and distance

  Pause for a short time (representing a time step)



End loop when "Stop" command is received.


## Project Desc

## Technologies Used

## Lessons Learned
