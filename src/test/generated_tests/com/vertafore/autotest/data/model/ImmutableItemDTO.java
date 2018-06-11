package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ItemDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableItemDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "ItemDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableItemDTO implements ItemDTO {
  private final @Nullable String name;
  private final @Nullable String description;
  private final @Nullable RequestDTO request;

  private ImmutableItemDTO(
      @Nullable String name,
      @Nullable String description,
      @Nullable RequestDTO request) {
    this.name = name;
    this.description = description;
    this.request = request;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public @Nullable String getName() {
    return name;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public @Nullable String getDescription() {
    return description;
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public @Nullable RequestDTO getRequest() {
    return request;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ItemDTO#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItemDTO withName(@Nullable String value) {
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableItemDTO(value, this.description, this.request);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ItemDTO#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItemDTO withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableItemDTO(this.name, value, this.request);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ItemDTO#getRequest() request} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for request (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableItemDTO withRequest(@Nullable RequestDTO value) {
    if (this.request == value) return this;
    return new ImmutableItemDTO(this.name, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableItemDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableItemDTO
        && equalTo((ImmutableItemDTO) another);
  }

  private boolean equalTo(ImmutableItemDTO another) {
    return Objects.equals(name, another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(request, another.request);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code description}, {@code request}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(request);
    return h;
  }

  /**
   * Prints the immutable value {@code ItemDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ItemDTO")
        .omitNullValues()
        .add("name", name)
        .add("description", description)
        .add("request", request)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ItemDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ItemDTO instance
   */
  public static ImmutableItemDTO copyOf(ItemDTO instance) {
    if (instance instanceof ImmutableItemDTO) {
      return (ImmutableItemDTO) instance;
    }
    return ImmutableItemDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableItemDTO ImmutableItemDTO}.
   * @return A new ImmutableItemDTO builder
   */
  public static ImmutableItemDTO.Builder builder() {
    return new ImmutableItemDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableItemDTO ImmutableItemDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable RequestDTO request;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ItemDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ItemDTO instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String nameValue = instance.getName();
      if (nameValue != null) {
        name(nameValue);
      }
      @Nullable String descriptionValue = instance.getDescription();
      if (descriptionValue != null) {
        description(descriptionValue);
      }
      @Nullable RequestDTO requestValue = instance.getRequest();
      if (requestValue != null) {
        request(requestValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link ItemDTO#getName() name} attribute.
     * @param name The value for name (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("name")
    public final Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }

    /**
     * Initializes the value for the {@link ItemDTO#getDescription() description} attribute.
     * @param description The value for description (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("description")
    public final Builder description(@Nullable String description) {
      this.description = description;
      return this;
    }

    /**
     * Initializes the value for the {@link ItemDTO#getRequest() request} attribute.
     * @param request The value for request (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("request")
    public final Builder request(@Nullable RequestDTO request) {
      this.request = request;
      return this;
    }

    /**
     * Builds a new {@link ImmutableItemDTO ImmutableItemDTO}.
     * @return An immutable instance of ItemDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableItemDTO build() {
      return new ImmutableItemDTO(name, description, request);
    }
  }
}
