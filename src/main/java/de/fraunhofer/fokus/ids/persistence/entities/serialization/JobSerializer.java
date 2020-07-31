package de.fraunhofer.fokus.ids.persistence.entities.serialization;

import de.fraunhofer.fokus.ids.persistence.entities.Job;
import de.fraunhofer.fokus.ids.persistence.enums.JobStatus;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import java.text.ParseException;

public class JobSerializer {

    public JsonObject serialize(Job job){
        return new JsonObject(Json.encode(job));
    }

    public Job deserialize(JsonObject jobJson) throws ParseException {

        Job job = new Job();
        JsonObject data;
        try {
            data = jobJson.getJsonObject("data");
        } catch (ClassCastException e){
            data = new JsonObject(jobJson.getString("data"));
        }
        job.setData(data);
        job.setSourceID(jobJson.getString("sourceid"));
        job.setStatus(JobStatus.valueOf(jobJson.getString("status")));
        job.setSourceType(jobJson.getString("sourcetype"));
        job.setId(jobJson.getLong("id"));
        job.setCreatedAt(jobJson.getInstant("created_at"));
        job.setCreatedAt(jobJson.getInstant("updated_at"));
        return job;
    }
}
