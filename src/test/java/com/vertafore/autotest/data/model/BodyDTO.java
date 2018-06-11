package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import javax.annotation.Nullable;
import java.util.List;


@Value.Immutable
@JsonSerialize(as = ImmutableBodyDTO.class)
@JsonDeserialize(builder = ImmutableBodyDTO.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface BodyDTO {

    @Nullable
    String getMode();

    @Nullable
    String getRaw();

}
