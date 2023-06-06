package com.endava.Ex49;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> listOfValuesToBeStored);
}
