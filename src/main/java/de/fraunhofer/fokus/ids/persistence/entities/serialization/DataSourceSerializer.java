package de.fraunhofer.fokus.ids.persistence.entities.serialization;

import de.fraunhofer.fokus.ids.persistence.entities.DataSource;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import java.text.ParseException;
import java.time.Instant;

public class DataSourceSerializer {

    public static JsonObject serialize(DataSource dataSource){
        return new JsonObject(Json.encode(dataSource));
    }

    public static DataSource deserialize(JsonObject datasourceJson) throws ParseException {

        DataSource dataSource = new DataSource();
        dataSource.setData(datasourceJson.getJsonObject("data"));
        dataSource.setDatasourceType(datasourceJson.getString("datasourcetype"));
        dataSource.setDatasourceName(datasourceJson.getString("datasourcename"));
        dataSource.setId(datasourceJson.getLong("id"));
        String created = datasourceJson.getString("created_at");
        String updated = datasourceJson.getString("updated_at");
        dataSource.setCreatedAt(Instant.parse(created));
        dataSource.setCreatedAt(Instant.parse(updated));
        return dataSource;
    }
}
