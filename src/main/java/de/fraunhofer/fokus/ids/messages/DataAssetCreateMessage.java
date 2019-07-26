package de.fraunhofer.fokus.ids.messages;

import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import de.fraunhofer.fokus.ids.persistence.entities.Job;
import de.fraunhofer.fokus.ids.persistence.enums.DatasourceType;
import de.fraunhofer.fokus.ids.persistence.enums.JobStatus;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

public class DataAssetCreateMessage {

    Job job;
    DataSource dataSource;

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

    public static void main(String[] args) {
        DataAssetCreateMessage m = new DataAssetCreateMessage();
        Job j = new Job();
        DataSource ds = new DataSource();
        j.setStatus(JobStatus.RUNNING);
        j.setSourceID("1");
        j.setSourceType(DatasourceType.CKAN);
        j.setData(new JsonObject("{\"resourceId\":\"326ef0d6-60ce-490d-86eb-aa728d45013e\"}"));
        j.setId(1L);

        ds.setDatasourceType(DatasourceType.CKAN);
        ds.setDatasourceName("IDS-Backend");
        ds.setData(new JsonObject("{\"ckanApiUrl\":\"http://ids-backend.fokus.fraunhofer.de/api/3/action/\",\"ckanPort\":\"80\"}"));
        ds.setId(1L);
        m.setJob(j);
        m.setDataSource(ds);
        System.out.println(Json.encode(m));
    }
}
