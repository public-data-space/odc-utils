package de.fraunhofer.fokus.ids.persistence.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.fraunhofer.fokus.ids.persistence.enums.DatasourceType;
import io.vertx.core.json.JsonObject;

public class DataSource extends BaseEntity {

    @JsonProperty("data")
    private Object data;
    @JsonProperty("datasourcename")
    String datasourceName;
    @JsonProperty("datasourcetype")
    DatasourceType datasourceType;

    public JsonObject getData() {
        return JsonObject.mapFrom(data);
    }

    public void setData(Object data) {
        this.data = data;
    }


    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    public DatasourceType getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceType datasourceType) {
        this.datasourceType = datasourceType;
    }

}
