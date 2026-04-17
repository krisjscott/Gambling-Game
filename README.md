# Gambling Game

A fun Java-based slot machine gambling game with multiple symbols, betting system, and interactive gameplay.

## Project Overview

This is a console-based gambling game built in Java where players can:
- Start with an initial balance of $100
- Place bets on slot machine spins
- Win payouts based on matching symbol combinations
- Continue playing until they run out of money or choose to quit

## Game Symbols & Payouts

The game features 5 symbols with different payout multipliers:
- 🍌 Banana: 3x bet
- 🍺 Beer: 5x bet
- 🎭 Circus Tent: 10x bet
- 💎 Diamond: 15x bet
- ✴️ Star: 20x bet

**Winning Condition:** Match all 3 symbols in a row to win the corresponding payout!

## Project Structure

```
Gambling-Game/
├── src/
│   └── Main.java          # Main game logic and entry point
├── pratice.iml            # IntelliJ project configuration
└── README.md              # Project documentation
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.) or command line

### Running the Game

**Option 1: Using an IDE**
1. Clone the repository: `git clone https://github.com/krisjscott/Gambling-Game.git`
2. Open the project in your IDE
3. Navigate to `src/Main.java`
4. Click "Run" or press the run button

**Option 2: Using Command Line**
```bash
# Navigate to the project directory
cd Gambling-Game

# Compile the Java file
javac src/Main.java

# Run the game
java -cp src Main
```

## Gameplay Instructions

1. The game starts with a $100 balance
2. Enter your bet amount
3. The slot machine spins 3 symbols
4. If all 3 symbols match, you win the payout multiplier
5. If they don't match, you lose your bet
6. Continue playing or quit by entering 'N' when prompted

## Features

- Interactive console-based user interface
- Random symbol generation for fair gameplay
- Real-time balance tracking
- Input validation for bet amounts
- Play again functionality
- Game-over condition when balance reaches $0

## Code Components

- **spinRow()**: Generates 3 random symbols for the slot machine
- **printRow()**: Displays the spinning result
- **getPayout()**: Calculates winnings based on symbol matches
- **main()**: Game loop and user interaction logic

## License

This project is open source and available for educational purposes.

## Author

krisjscott