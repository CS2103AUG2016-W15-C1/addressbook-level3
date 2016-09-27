package seedu.addressbook.commands;

public class VersionCommand extends Command {

    public static final String COMMAND_WORD = "version";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" +"Shows program version.\n\t"
            + "Example: " + COMMAND_WORD;

    public static final String VERSION = "v0.1";

    public VersionCommand() {}

    @Override
    public CommandResult execute() {
        return new CommandResult(VERSION);
    }
}
