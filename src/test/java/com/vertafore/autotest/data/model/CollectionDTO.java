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
@JsonSerialize(as = ImmutableCollectionDTO.class)
@JsonDeserialize(builder = ImmutableCollectionDTO.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface CollectionDTO {

    @Nullable
    InfoDTO getInfo();

    @Nullable
    List<ItemDTO> getItem();

}

