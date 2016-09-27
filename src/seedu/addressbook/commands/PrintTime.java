package seedu.addressbook.commands;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class PrintTime extends Command {

    public static final String COMMAND_WORD = "time";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n" +"Displays current time\n\t"
            + "Example: " + COMMAND_WORD;

    public PrintTime(){}
    
    public static final String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
    @Override
    public CommandResult execute() {
        return new CommandResult(timeStamp);
    }
}
