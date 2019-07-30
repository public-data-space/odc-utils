package de.fraunhofer.fokus.ids.persistence.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.fraunhofer.fokus.ids.persistence.entities.serialization.JsonObjectDeserialize;
import de.fraunhofer.fokus.ids.persistence.entities.serialization.JsonObjectSerializer;
import io.vertx.core.json.JsonObject;

public class DataSource extends BaseEntity {
    @JsonProperty("datasourcename")
    private String datasourceName;
    @JsonProperty("datasourcetype")
    private String datasourceType;

    @JsonProperty("data")
    @JsonSerialize(using = JsonObjectSerializer.class)
    @JsonDeserialize(using = JsonObjectDeserialize.class)
    private JsonObject data;

    public void setData(JsonObject data) {
        this.data = data;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    public JsonObject getData() {
        return JsonObject.mapFrom(data);
    }

    public String getDatasourceName() {
        return datasourceName;
    }

    public String getDatasourceType() {
        return datasourceType;
    }

}
