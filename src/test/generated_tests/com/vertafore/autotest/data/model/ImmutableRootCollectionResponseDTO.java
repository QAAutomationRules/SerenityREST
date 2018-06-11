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
 * Immutable implementation of {@link RootCollectionResponseDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRootCollectionResponseDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "RootCollectionResponseDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableRootCollectionResponseDTO
    implements RootCollectionResponseDTO {
  private final CollectionResponseDTO collection;

  private ImmutableRootCollectionResponseDTO(CollectionResponseDTO collection) {
    this.collection = collection;
  }

  /**
   * @return The value of the {@code collection} attribute
   */
  @JsonProperty("collection")
  @Override
  public CollectionResponseDTO getCollection() {
    return collection;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RootCollectionResponseDTO#getCollection() collection} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for collection
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRootCollectionResponseDTO withCollection(CollectionResponseDTO value) {
    if (this.collection == value) return this;
    CollectionResponseDTO newValue = Objects.requireNonNull(value, "collection");
    return new ImmutableRootCollectionResponseDTO(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRootCollectionResponseDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRootCollectionResponseDTO
        && equalTo((ImmutableRootCollectionResponseDTO) another);
  }

  private boolean equalTo(ImmutableRootCollectionResponseDTO another) {
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
   * Prints the immutable value {@code RootCollectionResponseDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RootCollectionResponseDTO")
        .omitNullValues()
        .add("collection", collection)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RootCollectionResponseDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RootCollectionResponseDTO instance
   */
  public static ImmutableRootCollectionResponseDTO copyOf(RootCollectionResponseDTO instance) {
    if (instance instanceof ImmutableRootCollectionResponseDTO) {
      return (ImmutableRootCollectionResponseDTO) instance;
    }
    return ImmutableRootCollectionResponseDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRootCollectionResponseDTO ImmutableRootCollectionResponseDTO}.
   * @return A new ImmutableRootCollectionResponseDTO builder
   */
  public static ImmutableRootCollectionResponseDTO.Builder builder() {
    return new ImmutableRootCollectionResponseDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRootCollectionResponseDTO ImmutableRootCollectionResponseDTO}.
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

    private @Nullable CollectionResponseDTO collection;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RootCollectionResponseDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(RootCollectionResponseDTO instance) {
      Objects.requireNonNull(instance, "instance");
      collection(instance.getCollection());
      return this;
    }

    /**
     * Initializes the value for the {@link RootCollectionResponseDTO#getCollection() collection} attribute.
     * @param collection The value for collection 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("collection")
    public final Builder collection(CollectionResponseDTO collection) {
      this.collection = Objects.requireNonNull(collection, "collection");
      initBits &= ~INIT_BIT_COLLECTION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRootCollectionResponseDTO ImmutableRootCollectionResponseDTO}.
     * @return An immutable instance of RootCollectionResponseDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRootCollectionResponseDTO build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRootCollectionResponseDTO(collection);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_COLLECTION) != 0) attributes.add("collection");
      return "Cannot build RootCollectionResponseDTO, some of required attributes are not set " + attributes;
    }
  }
}
