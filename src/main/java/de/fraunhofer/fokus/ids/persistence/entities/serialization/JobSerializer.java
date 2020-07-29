package de.fraunhofer.fokus.ids.persistence.entities.serialization;

import de.fraunhofer.fokus.ids.persistence.entities.Job;
import de.fraunhofer.fokus.ids.persistence.enums.JobStatus;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import java.text.ParseException;
import java.time.Instant;

public class JobSerializer {

    public JsonObject serialize(Job job){
        return new JsonObject(Json.encode(job));
    }

    public Job deserialize(JsonObject jobJson) throws ParseException {

        Job job = new Job();
        job.setData(jobJson.getJsonObject("data"));
        job.setSourceID(jobJson.getString("sourceid"));
        job.setStatus(JobStatus.valueOf(jobJson.getString("status")));
        job.setSourceType(jobJson.getString("sourcetype"));
        job.setId(jobJson.getLong("id"));
        String created = jobJson.getString("created_at");
        String updated = jobJson.getString("updated_at");
        job.setCreatedAt(Instant.parse(created));
        job.setCreatedAt(Instant.parse(updated));
        return job;
    }
}
