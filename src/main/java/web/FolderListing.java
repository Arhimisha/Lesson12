package web;

import javax.ejb.Stateless;
import java.io.File;

@Stateless
public class FolderListing implements IFolderListing {

    @Override
    public String getListing(String folderName) {

        return folderName + "\\<br>"+  getContentOfFolder(new File(folderName).getAbsoluteFile(),0).toString();
    }

    private static StringBuffer getContentOfFolder(File currentFile, int level) {
        level++;
        StringBuffer listOfFiles = new StringBuffer();
        if (currentFile != null) {
            File[] files = currentFile.getAbsoluteFile().listFiles();
            for (File file : files) {
                for (int i = 0; i < level*4 ; i++) {
                    listOfFiles.append("&nbsp;");
                }
                listOfFiles.append(file.getName());
                if (file.isDirectory()) {
                    listOfFiles.append("\\");
                }
                listOfFiles.append("<br>").append(System.lineSeparator());
                if (file.isDirectory()) {
                    listOfFiles.append(getContentOfFolder(file, level));
                }
            }
        }
        return listOfFiles;
    }
}
