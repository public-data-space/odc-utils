package de.fraunhofer.fokus.ids.persistence.entities.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.vertx.core.json.JsonObject;

import java.io.IOException;

public class JsonObjectDeserialize extends JsonDeserializer {
    public JsonObject deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        String p = jsonParser.getValueAsString();

        return new JsonObject(p);
    }
}
