package com.vertafore.autotest.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;


import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = ImmutableInfoDTO.class)
@JsonDeserialize(builder = ImmutableInfoDTO.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface InfoDTO {


    //String getPostmanID();

    @Nullable
    String getName();

    @Nullable
    String getDescription();

    @Nullable
    String getSchema();

}
