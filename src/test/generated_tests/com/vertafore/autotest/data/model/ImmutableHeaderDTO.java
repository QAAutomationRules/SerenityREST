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
 * Immutable implementation of {@link HeaderDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHeaderDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "HeaderDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableHeaderDTO implements HeaderDTO {
  private final @Nullable String key;
  private final @Nullable String value;

  private ImmutableHeaderDTO(@Nullable String key, @Nullable String value) {
    this.key = key;
    this.value = value;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public @Nullable String getKey() {
    return key;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public @Nullable String getValue() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HeaderDTO#getKey() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderDTO withKey(@Nullable String value) {
    if (Objects.equals(this.key, value)) return this;
    return new ImmutableHeaderDTO(value, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HeaderDTO#getValue() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHeaderDTO withValue(@Nullable String value) {
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableHeaderDTO(this.key, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHeaderDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHeaderDTO
        && equalTo((ImmutableHeaderDTO) another);
  }

  private boolean equalTo(ImmutableHeaderDTO another) {
    return Objects.equals(key, another.key)
        && Objects.equals(value, another.value);
  }

  /**
   * Computes a hash code from attributes: {@code key}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(key);
    h += (h << 5) + Objects.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code HeaderDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("HeaderDTO")
        .omitNullValues()
        .add("key", key)
        .add("value", value)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link HeaderDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HeaderDTO instance
   */
  public static ImmutableHeaderDTO copyOf(HeaderDTO instance) {
    if (instance instanceof ImmutableHeaderDTO) {
      return (ImmutableHeaderDTO) instance;
    }
    return ImmutableHeaderDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHeaderDTO ImmutableHeaderDTO}.
   * @return A new ImmutableHeaderDTO builder
   */
  public static ImmutableHeaderDTO.Builder builder() {
    return new ImmutableHeaderDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHeaderDTO ImmutableHeaderDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private @Nullable String key;
    private @Nullable String value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HeaderDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(HeaderDTO instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String keyValue = instance.getKey();
      if (keyValue != null) {
        key(keyValue);
      }
      @Nullable String valueValue = instance.getValue();
      if (valueValue != null) {
        value(valueValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link HeaderDTO#getKey() key} attribute.
     * @param key The value for key (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("key")
    public final Builder key(@Nullable String key) {
      this.key = key;
      return this;
    }

    /**
     * Initializes the value for the {@link HeaderDTO#getValue() value} attribute.
     * @param value The value for value (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("value")
    public final Builder value(@Nullable String value) {
      this.value = value;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHeaderDTO ImmutableHeaderDTO}.
     * @return An immutable instance of HeaderDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHeaderDTO build() {
      return new ImmutableHeaderDTO(key, value);
    }
  }
}
