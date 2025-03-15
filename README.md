# Java-Guesser

## Pseudocode 
FUNCTION main()
    CREATE scanner for input
    DECLARE choice as integer

    DO
        PRINT menu options
        READ user choice

        IF choice is 1 THEN
            CALL humanGuesser()
        ELSE IF choice is 2 THEN
            CALL computerGuesser()
    
    WHILE choice is not 0

    CLOSE scanner
END FUNCTION

FUNCTION humanGuesser()
    GENERATE random number between 1 and 100 (target)
    DECLARE guess and attempts as integers
    SET attempts to 0

    PRINT "Human Guesser Mode: Try to guess the number!"

    DO
        INCREMENT attempts
        PRINT "Enter your guess:"
        READ guess

        IF guess < target THEN
            PRINT "Too low..."
        ELSE IF guess > target THEN
            PRINT "Too high..."
        ELSE
            PRINT "Got it! Very good!"

    WHILE guess is not equal to target
END FUNCTION

FUNCTION computerGuesser()
    DECLARE low as 1, high as 100
    DECLARE guess and attempts as integers
    DECLARE response as string
    SET attempts to 0

    PRINT "Think of a number between 1 and 100."

    DO
        INCREMENT attempts
        SET guess to midpoint of (low + high)

        PRINT "I guess <guess>. Too (H)igh, too (L)ow, or (C)orrect?"
        READ response

        IF response is "H" THEN
            SET high to guess - 1
        ELSE IF response is "L" THEN
            SET low to guess + 1
        ELSE IF response is "C" THEN
            PRINT "Yay! The computer guessed your number in <attempts> attempts."
        ELSE
            PRINT "Invalid input. Please enter H, L, or C."

    WHILE response is not "C"
END FUNCTION
