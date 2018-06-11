package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link RootCollectionDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRootCollectionDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "RootCollectionDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableRootCollectionDTO implements RootCollectionDTO {
  private final CollectionDTO collection;

  private ImmutableRootCollectionDTO(CollectionDTO collection) {
    this.collection = collection;
  }

  /**
   * @return The value of the {@code collection} attribute
   */
  @JsonProperty("collection")
  @Override
  public CollectionDTO getCollection() {
    return collection;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RootCollectionDTO#getCollection() collection} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for collection
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRootCollectionDTO withCollection(CollectionDTO value) {
    if (this.collection == value) return this;
    CollectionDTO newValue = Objects.requireNonNull(value, "collection");
    return new ImmutableRootCollectionDTO(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRootCollectionDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRootCollectionDTO
        && equalTo((ImmutableRootCollectionDTO) another);
  }

  private boolean equalTo(ImmutableRootCollectionDTO another) {
    return collection.equals(another.collection);
  }

  /**
   * Computes a hash code from attributes: {@code collection}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + collection.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RootCollectionDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RootCollectionDTO")
        .omitNullValues()
        .add("collection", collection)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RootCollectionDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RootCollectionDTO instance
   */
  public static ImmutableRootCollectionDTO copyOf(RootCollectionDTO instance) {
    if (instance instanceof ImmutableRootCollectionDTO) {
      return (ImmutableRootCollectionDTO) instance;
    }
    return ImmutableRootCollectionDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRootCollectionDTO ImmutableRootCollectionDTO}.
   * @return A new ImmutableRootCollectionDTO builder
   */
  public static ImmutableRootCollectionDTO.Builder builder() {
    return new ImmutableRootCollectionDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRootCollectionDTO ImmutableRootCollectionDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private static final long INIT_BIT_COLLECTION = 0x1L;
    private long initBits = 0x1L;

    private @Nullable CollectionDTO collection;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RootCollectionDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(RootCollectionDTO instance) {
      Objects.requireNonNull(instance, "instance");
      collection(instance.getCollection());
      return this;
    }

    /**
     * Initializes the value for the {@link RootCollectionDTO#getCollection() collection} attribute.
     * @param collection The value for collection 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("collection")
    public final Builder collection(CollectionDTO collection) {
      this.collection = Objects.requireNonNull(collection, "collection");
      initBits &= ~INIT_BIT_COLLECTION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRootCollectionDTO ImmutableRootCollectionDTO}.
     * @return An immutable instance of RootCollectionDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRootCollectionDTO build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRootCollectionDTO(collection);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_COLLECTION) != 0) attributes.add("collection");
      return "Cannot build RootCollectionDTO, some of required attributes are not set " + attributes;
    }
  }
}
