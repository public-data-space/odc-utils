package de.fraunhofer.fokus.ids.messages;

import de.fraunhofer.fokus.ids.enums.FileType;
import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import de.fraunhofer.fokus.ids.persistence.entities.Distribution;

public class ResourceRequest {

    DataSource dataSource;
    Distribution distribution;
    FileType fileType;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Distribution getDataAsset() {
        return distribution;
    }

    public void setDataAsset(Distribution dataAsset) {
        this.distribution = dataAsset;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

}
