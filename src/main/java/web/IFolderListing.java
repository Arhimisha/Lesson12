package web;

import javax.ejb.Local;

@Local
public interface IFolderListing {

    public String getListing(String folderName);
}
