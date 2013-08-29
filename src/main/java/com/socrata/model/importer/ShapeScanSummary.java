package com.socrata.model.importer;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Object returned from scanning a shape file from the import process.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ShapeScanSummary
{
    final public long totalFeatureCount;
    final public List<ShapeLayerSummary> layers;

    @JsonCreator
    public ShapeScanSummary(final @JsonProperty("totalFeatureCount") long totalFeatureCount,
                            final @JsonProperty("layers") List<ShapeLayerSummary> layers)
    {
        this.totalFeatureCount = totalFeatureCount;
        this.layers = layers;
    }

    /**
     * Total number of features in this file
     * @return
     */
    public long getTotalFeatureCount()
    {
        return totalFeatureCount;
    }

    /**
     * List of all the layers that were discovered.
     * @return
     */
    public List<ShapeLayerSummary> getLayers()
    {
        return layers;
    }
}
