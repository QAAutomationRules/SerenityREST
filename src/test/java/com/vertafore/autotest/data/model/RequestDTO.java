package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;


@Value.Immutable
@JsonSerialize(as = ImmutableRequestDTO.class)
@JsonDeserialize(builder = ImmutableRequestDTO.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface RequestDTO {


    @Nullable
    String geturl();

    @Nullable
    String getMethod();

    @Nullable
    List<HeaderDTO> getHeader();

    @Nullable
    BodyDTO getBody();

    @Nullable
    String getDescription();

}
