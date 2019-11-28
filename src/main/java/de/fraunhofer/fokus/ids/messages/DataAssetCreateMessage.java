package de.fraunhofer.fokus.ids.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import de.fraunhofer.fokus.ids.persistence.entities.serialization.JsonObjectDeserialize;
import de.fraunhofer.fokus.ids.persistence.entities.serialization.JsonObjectSerializer;
import io.vertx.core.json.JsonObject;

public class DataAssetCreateMessage {

    @JsonProperty("data")
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserialize.class)
    private JsonObject data;
    private DataSource dataSource;
    private Long dataAssetId;

    public Long getDataAssetId() {
        return dataAssetId;
    }

    public void setDataAssetId(Long dataAssetId) {
        this.dataAssetId = dataAssetId;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
