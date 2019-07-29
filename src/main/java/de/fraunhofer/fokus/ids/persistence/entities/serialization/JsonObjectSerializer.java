package de.fraunhofer.fokus.ids.persistence.entities.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.vertx.core.json.JsonObject;

import java.io.IOException;

public class JsonObjectSerializer extends JsonSerializer {
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(new JsonObject(o.toString()).toString());
    }
}
