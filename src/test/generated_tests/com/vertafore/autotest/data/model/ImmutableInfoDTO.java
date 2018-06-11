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
 * Immutable implementation of {@link InfoDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInfoDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "InfoDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableInfoDTO implements InfoDTO {
  private final @Nullable String name;
  private final @Nullable String description;
  private final @Nullable String schema;

  private ImmutableInfoDTO(
      @Nullable String name,
      @Nullable String description,
      @Nullable String schema) {
    this.name = name;
    this.description = description;
    this.schema = schema;
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
   * @return The value of the {@code schema} attribute
   */
  @JsonProperty("schema")
  @Override
  public @Nullable String getSchema() {
    return schema;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InfoDTO#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInfoDTO withName(@Nullable String value) {
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableInfoDTO(value, this.description, this.schema);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InfoDTO#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInfoDTO withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableInfoDTO(this.name, value, this.schema);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link InfoDTO#getSchema() schema} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for schema (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableInfoDTO withSchema(@Nullable String value) {
    if (Objects.equals(this.schema, value)) return this;
    return new ImmutableInfoDTO(this.name, this.description, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInfoDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInfoDTO
        && equalTo((ImmutableInfoDTO) another);
  }

  private boolean equalTo(ImmutableInfoDTO another) {
    return Objects.equals(name, another.name)
        && Objects.equals(description, another.description)
        && Objects.equals(schema, another.schema);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code description}, {@code schema}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(schema);
    return h;
  }

  /**
   * Prints the immutable value {@code InfoDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("InfoDTO")
        .omitNullValues()
        .add("name", name)
        .add("description", description)
        .add("schema", schema)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link InfoDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InfoDTO instance
   */
  public static ImmutableInfoDTO copyOf(InfoDTO instance) {
    if (instance instanceof ImmutableInfoDTO) {
      return (ImmutableInfoDTO) instance;
    }
    return ImmutableInfoDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableInfoDTO ImmutableInfoDTO}.
   * @return A new ImmutableInfoDTO builder
   */
  public static ImmutableInfoDTO.Builder builder() {
    return new ImmutableInfoDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableInfoDTO ImmutableInfoDTO}.
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
    private @Nullable String schema;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code InfoDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(InfoDTO instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String nameValue = instance.getName();
      if (nameValue != null) {
        name(nameValue);
      }
      @Nullable String descriptionValue = instance.getDescription();
      if (descriptionValue != null) {
        description(descriptionValue);
      }
      @Nullable String schemaValue = instance.getSchema();
      if (schemaValue != null) {
        schema(schemaValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link InfoDTO#getName() name} attribute.
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
     * Initializes the value for the {@link InfoDTO#getDescription() description} attribute.
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
     * Initializes the value for the {@link InfoDTO#getSchema() schema} attribute.
     * @param schema The value for schema (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("schema")
    public final Builder schema(@Nullable String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Builds a new {@link ImmutableInfoDTO ImmutableInfoDTO}.
     * @return An immutable instance of InfoDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableInfoDTO build() {
      return new ImmutableInfoDTO(name, description, schema);
    }
  }
}
