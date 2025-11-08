package epam.tasks.Collections_task15_ParcelMgmt;

import java.util.*;

public interface NewPostOfficeManagement {

	Optional<Box> getBoxById(int id);
    String getDescSortedBoxesByWeight();
    String getAscSortedBoxesByCost();
    List<Box> getBoxesByRecipient(String recipient);
}
