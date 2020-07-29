package de.fraunhofer.fokus.ids.persistence.entities;

import de.fraunhofer.fokus.ids.enums.FileType;
import de.fraunhofer.fokus.ids.persistence.enums.DataAssetStatus;

import java.util.Set;

public class Dataset extends Resource {

    private Long sourceid;
    private Set<Distribution> distributions;
    private DataAssetStatus status;
    private Set<String> tags;
    private String version;

    public Long getSourceid() {
        return sourceid;
    }

    public void setSourceid(Long sourceid) {
        this.sourceid = sourceid;
    }

    public Set<Distribution> getDistributions() {
        return distributions;
    }

    public void setDistributions(Set<Distribution> distributions) {
        this.distributions = distributions;
    }

    public DataAssetStatus getStatus() {
        return status;
    }

    public void setStatus(DataAssetStatus status) {
        this.status = status;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
