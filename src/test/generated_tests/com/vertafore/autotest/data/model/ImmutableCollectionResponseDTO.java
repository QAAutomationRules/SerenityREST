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
 * Immutable implementation of {@link CollectionResponseDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCollectionResponseDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "CollectionResponseDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableCollectionResponseDTO
    implements CollectionResponseDTO {
  private final String id;
  private final String name;
  private final String uid;

  private ImmutableCollectionResponseDTO(String id, String name, String uid) {
    this.id = id;
    this.name = name;
    this.uid = uid;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public String id() {
    return id;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code uid} attribute
   */
  @JsonProperty("uid")
  @Override
  public String uid() {
    return uid;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CollectionResponseDTO#id() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCollectionResponseDTO withId(String value) {
    if (this.id.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "id");
    return new ImmutableCollectionResponseDTO(newValue, this.name, this.uid);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CollectionResponseDTO#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCollectionResponseDTO withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "name");
    return new ImmutableCollectionResponseDTO(this.id, newValue, this.uid);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CollectionResponseDTO#uid() uid} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for uid
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCollectionResponseDTO withUid(String value) {
    if (this.uid.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "uid");
    return new ImmutableCollectionResponseDTO(this.id, this.name, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCollectionResponseDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCollectionResponseDTO
        && equalTo((ImmutableCollectionResponseDTO) another);
  }

  private boolean equalTo(ImmutableCollectionResponseDTO another) {
    return id.equals(another.id)
        && name.equals(another.name)
        && uid.equals(another.uid);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}, {@code uid}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + uid.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CollectionResponseDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CollectionResponseDTO")
        .omitNullValues()
        .add("id", id)
        .add("name", name)
        .add("uid", uid)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link CollectionResponseDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CollectionResponseDTO instance
   */
  public static ImmutableCollectionResponseDTO copyOf(CollectionResponseDTO instance) {
    if (instance instanceof ImmutableCollectionResponseDTO) {
      return (ImmutableCollectionResponseDTO) instance;
    }
    return ImmutableCollectionResponseDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCollectionResponseDTO ImmutableCollectionResponseDTO}.
   * @return A new ImmutableCollectionResponseDTO builder
   */
  public static ImmutableCollectionResponseDTO.Builder builder() {
    return new ImmutableCollectionResponseDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCollectionResponseDTO ImmutableCollectionResponseDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_UID = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable String name;
    private @Nullable String uid;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CollectionResponseDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(CollectionResponseDTO instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      name(instance.getName());
      uid(instance.uid());
      return this;
    }

    /**
     * Initializes the value for the {@link CollectionResponseDTO#id() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("id")
    public final Builder id(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link CollectionResponseDTO#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("name")
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link CollectionResponseDTO#uid() uid} attribute.
     * @param uid The value for uid 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("uid")
    public final Builder uid(String uid) {
      this.uid = Objects.requireNonNull(uid, "uid");
      initBits &= ~INIT_BIT_UID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCollectionResponseDTO ImmutableCollectionResponseDTO}.
     * @return An immutable instance of CollectionResponseDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCollectionResponseDTO build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCollectionResponseDTO(id, name, uid);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_UID) != 0) attributes.add("uid");
      return "Cannot build CollectionResponseDTO, some of required attributes are not set " + attributes;
    }
  }
}
