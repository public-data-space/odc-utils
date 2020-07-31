package de.fraunhofer.fokus.ids.persistence.entities.serialization;

import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import java.text.ParseException;

public class DataSourceSerializer {

    public static JsonObject serialize(DataSource dataSource){
        return new JsonObject(Json.encode(dataSource));
    }

    public static DataSource deserialize(JsonObject datasourceJson) throws ParseException {

        DataSource dataSource = new DataSource();
        JsonObject data;
        try {
            data = datasourceJson.getJsonObject("data");
        } catch (ClassCastException e){
            data = new JsonObject(datasourceJson.getString("data"));
        }
        dataSource.setData(data);
        dataSource.setDatasourceType(datasourceJson.getString("datasourcetype"));
        dataSource.setDatasourceName(datasourceJson.getString("datasourcename"));
        dataSource.setId(datasourceJson.getLong("id"));
        dataSource.setCreatedAt(datasourceJson.getInstant("created_at"));
        dataSource.setCreatedAt(datasourceJson.getInstant("updated_at"));
        return dataSource;
    }
}
