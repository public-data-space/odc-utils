package de.fraunhofer.fokus.ids.messages;

import de.fraunhofer.fokus.ids.enums.FileType;
import de.fraunhofer.fokus.ids.persistence.entities.DataAsset;
import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import io.vertx.core.json.Json;

import java.io.File;

public class ResourceRequest {

    DataSource dataSource;
    DataAsset dataAsset;
    FileType fileType;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataAsset getDataAsset() {
        return dataAsset;
    }

    public void setDataAsset(DataAsset dataAsset) {
        this.dataAsset = dataAsset;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

}
