package ca.mcscert.se2aa4.demos.tennis;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(MyClass.class);

    public static int PLAYER1_STRENGTH;
    public static int PLAYER2_STRENGTH;

    public static void main(String[] args) {
        logger.error("** Starting Tennis Counter Assistant");
        logger.error("**** Reading Command-Line Arguments");
        Options options = new Options();
        options.addOption("p1", true, "Strength of Player 1 in [0,100]");
        options.addOption("p2", true, "Strength of Player 2 in [0,100]");
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            PLAYER1_STRENGTH = Integer.parseInt(cmd.getOptionValue("p1","50"));
            logger.error("****** P1's Strength is " + PLAYER1_STRENGTH+"/100");
            PLAYER2_STRENGTH = Integer.parseInt(cmd.getOptionValue("p2","50"));
            logger.error("****** P2's Strength is " + PLAYER2_STRENGTH+"/100");
        } catch (ParseException pe) {
            System.err.println("An error has occurred");
        }
        logger.error("**** Starting game");
        logger.error("** TODO...");
        logger.error("** Closing Tennis Counter Assistant");
    }
}
