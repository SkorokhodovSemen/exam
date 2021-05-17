package exam2.notthis;

import java.io.File;
import java.io.IOException;

abstract public class FileSaveLoad {
    protected File file;

    abstract public boolean writeToFile(byte[] data) throws IOException;
    abstract public byte[] readFromFile() throws IOException ;

}
