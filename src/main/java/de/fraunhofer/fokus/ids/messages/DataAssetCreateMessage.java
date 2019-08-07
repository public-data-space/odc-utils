package de.fraunhofer.fokus.ids.messages;

import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import de.fraunhofer.fokus.ids.persistence.entities.Job;

public class DataAssetCreateMessage {

    private Job job;
    private DataSource dataSource;
    private Long dataAssetId;

    public Long getDataAssetId() {
        return dataAssetId;
    }

    public void setDataAssetId(Long dataAssetId) {
        this.dataAssetId = dataAssetId;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
