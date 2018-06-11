package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Set;


@Value.Immutable
@JsonSerialize(as = ImmutableCollectionResponseDTO.class)
@JsonDeserialize(builder = ImmutableCollectionResponseDTO.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface CollectionResponseDTO {

    String id();

    String getName();

    String uid();
}
