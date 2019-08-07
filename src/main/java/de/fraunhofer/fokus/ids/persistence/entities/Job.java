package de.fraunhofer.fokus.ids.persistence.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.fraunhofer.fokus.ids.persistence.entities.serialization.JsonObjectDeserialize;
import de.fraunhofer.fokus.ids.persistence.entities.serialization.JsonObjectSerializer;
import de.fraunhofer.fokus.ids.persistence.enums.JobStatus;
import io.vertx.core.json.JsonObject;

public class Job extends BaseEntity {

    @JsonProperty("data")
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserialize.class)
    private JsonObject data;
    @JsonProperty("sourceid")
    private String sourceId;
    @JsonProperty("status")
    private JobStatus status;
    @JsonProperty("sourcetype")
    private String sourceType;

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public String getSourceID() {
        return sourceId;
    }

    public void setSourceID(String sourceID) {
        this.sourceId = sourceID;
    }

    public JsonObject getData() {
        return JsonObject.mapFrom(data);
    }

    public void setData(JsonObject data) {
        this.data = data;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

}
