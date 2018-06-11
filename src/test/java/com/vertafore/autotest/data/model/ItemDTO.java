package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;


@Value.Immutable
@JsonSerialize(as = ImmutableItemDTO.class)
@JsonDeserialize(builder = ImmutableItemDTO.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface ItemDTO {


    //String getPostmanID();

    @Nullable
    String getName();

    @Nullable
    String getDescription();

    @Nullable
    RequestDTO getRequest();

}
