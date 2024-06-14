# Tic-Tac-Toe Game

This project is a simple console-based implementation of the classic Tic-Tac-Toe game. Two players take turns to mark spaces in a 3x3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game. If all nine squares are filled and neither player has three in a row, the game is a draw.

## How to Play

1. **Starting the Game**:
   - The game starts with an empty 3x3 grid.
   - Player X always goes first.

2. **Making a Move**:
   - Players are prompted to enter their move in the format `row column`.
   - For example, entering `0 0` places a mark in the top-left corner of the grid.

3. **Invalid Moves**:
   - If a player tries to mark a cell that is already occupied, they will be prompted to try again.

4. **Winning the Game**:
   - The first player to get three of their marks in a horizontal, vertical, or diagonal row wins the game.
   - A winning message is displayed, and the option to play again is provided.

5. **Drawing the Game**:
   - If all nine cells are filled and no player has three in a row, the game is declared a draw.
   - A draw message is displayed, and the option to play again is provided.

### Example Game

\```
  |   |   
  |   |   
  |   |   
Player X enter : 
0 0
X |   |   
  |   |   
  |   |   
Player O enter : 
1 1
X |   |   
  | O |   
  |   |   
Player X enter : 
1 1
Invalid move. Try again!
X |   |   
  | O |   
  |   |   
Player X enter : 
1 1
Invalid move. Try again!
X |   |   
  | O |   
  |   |   
Player X enter : 
2 2
X |   |   
  | O |   
  |   | X 
Player O enter : 
1 0
X |   |   
O | O |   
  |   | X 
Player X enter : 
1 2
X |   |   
O | O | X 
  |   | X 
Player O enter : 
2 0
X |   |   
O | O | X 
O |   | X 
Player X enter : 
0 1
X | X |   
O | O | X 
O |   | X 
Player O enter : 
0 2
X | X | O 
O | O | X 
O |   | X 
Player O has won!
Play tic-tac-toe? y or n
y
  |   |   
  |   |   
  |   |   
Player X enter : 
1 2
  |   |   
  |   | X 
  |   |   
Player O enter : 
0 1 
  | O |   
  |   | X 
  |   |   
Player X enter : 
1 1
  | O |   
  | X | X 
  |   |   
Player O enter : 
1 0
  | O |   
O | X | X 
  |   |   
Player X enter : 
0 0
X | O |   
O | X | X 
  |   |   
Player O enter : 
2 2
X | O |   
O | X | X 
  |   | O 
Player X enter : 
2 0 
X | O |   
O | X | X 
X |   | O 
Player O enter : 
0 2
X | O | O 
O | X | X 
X |   | O 
Player X enter : 
2 1
X | O | O 
O | X | X 
X | X | O 
DRAW
Play tic-tac-toe? y or n
n

Process finished with exit code 0
\```

## Running the Project (Just copy paste and run)

To run this project, you will need to have a Java environment set up. Simply follow the steps below:

1. **Copy the Code**:
   - Copy the entire code block from the provided example game.

2. **Create a New Java File**:
   - Open your preferred text editor or IDE.
   - Create a new file and name it `tictactoe.java`.

3. **Paste the Code**:
   - Paste the copied code into the `tictactoe.java` file.

4. **Save the File**:
   - Save the `tictactoe.java` file.

5. **Run the Script**:
   - Open your terminal or command prompt.
   - Navigate to the directory where the `tictactoe.java` file is saved.
   - Run the script by typing `java tictactoe.java` and press Enter.

Enjoy the game!

