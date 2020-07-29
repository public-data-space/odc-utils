package de.fraunhofer.fokus.ids.persistence.entities;

import de.fraunhofer.fokus.ids.enums.FileType;

public class Distribution extends Resource {

    private String filename;
    private FileType filetype;


    public FileType getFiletype() {
        return filetype;
    }

    public void setFiletype(FileType filetype) {
        this.filetype = filetype;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

}
