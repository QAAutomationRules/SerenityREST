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
 * Immutable implementation of {@link BodyDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBodyDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "BodyDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableBodyDTO implements BodyDTO {
  private final @Nullable String mode;
  private final @Nullable String raw;

  private ImmutableBodyDTO(@Nullable String mode, @Nullable String raw) {
    this.mode = mode;
    this.raw = raw;
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public @Nullable String getMode() {
    return mode;
  }

  /**
   * @return The value of the {@code raw} attribute
   */
  @JsonProperty("raw")
  @Override
  public @Nullable String getRaw() {
    return raw;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BodyDTO#getMode() mode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mode (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBodyDTO withMode(@Nullable String value) {
    if (Objects.equals(this.mode, value)) return this;
    return new ImmutableBodyDTO(value, this.raw);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BodyDTO#getRaw() raw} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for raw (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBodyDTO withRaw(@Nullable String value) {
    if (Objects.equals(this.raw, value)) return this;
    return new ImmutableBodyDTO(this.mode, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBodyDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBodyDTO
        && equalTo((ImmutableBodyDTO) another);
  }

  private boolean equalTo(ImmutableBodyDTO another) {
    return Objects.equals(mode, another.mode)
        && Objects.equals(raw, another.raw);
  }

  /**
   * Computes a hash code from attributes: {@code mode}, {@code raw}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(raw);
    return h;
  }

  /**
   * Prints the immutable value {@code BodyDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BodyDTO")
        .omitNullValues()
        .add("mode", mode)
        .add("raw", raw)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link BodyDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BodyDTO instance
   */
  public static ImmutableBodyDTO copyOf(BodyDTO instance) {
    if (instance instanceof ImmutableBodyDTO) {
      return (ImmutableBodyDTO) instance;
    }
    return ImmutableBodyDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBodyDTO ImmutableBodyDTO}.
   * @return A new ImmutableBodyDTO builder
   */
  public static ImmutableBodyDTO.Builder builder() {
    return new ImmutableBodyDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBodyDTO ImmutableBodyDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private @Nullable String mode;
    private @Nullable String raw;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BodyDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(BodyDTO instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String modeValue = instance.getMode();
      if (modeValue != null) {
        mode(modeValue);
      }
      @Nullable String rawValue = instance.getRaw();
      if (rawValue != null) {
        raw(rawValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link BodyDTO#getMode() mode} attribute.
     * @param mode The value for mode (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("mode")
    public final Builder mode(@Nullable String mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Initializes the value for the {@link BodyDTO#getRaw() raw} attribute.
     * @param raw The value for raw (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("raw")
    public final Builder raw(@Nullable String raw) {
      this.raw = raw;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBodyDTO ImmutableBodyDTO}.
     * @return An immutable instance of BodyDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBodyDTO build() {
      return new ImmutableBodyDTO(mode, raw);
    }
  }
}
