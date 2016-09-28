package seedu.addressbook.commands;

import java.util.List;

import seedu.addressbook.data.person.ReadOnlyPerson;

public class SizeCommand extends Command{
	
	public static final String COMMAND_WORD = "size";
	
	public static final String MESSAGE_USAGE = COMMAND_WORD + ":\n"
			+ "Displays only the number of people in address book.\n\t" 
			+ "Example: " + COMMAND_WORD;
	
	public static final String MESSAGE_SIZE = "Size of address book: ";

	
	@Override
	public CommandResult execute() {
		List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
		return new CommandResult(MESSAGE_SIZE + allPersons.size());
	}
}
