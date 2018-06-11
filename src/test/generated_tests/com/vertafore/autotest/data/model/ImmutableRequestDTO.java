package com.vertafore.autotest.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link RequestDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRequestDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "RequestDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableRequestDTO implements RequestDTO {
  private final @Nullable String geturl;
  private final @Nullable String method;
  private final @Nullable ImmutableList<HeaderDTO> header;
  private final @Nullable BodyDTO body;
  private final @Nullable String description;

  private ImmutableRequestDTO(
      @Nullable String geturl,
      @Nullable String method,
      @Nullable ImmutableList<HeaderDTO> header,
      @Nullable BodyDTO body,
      @Nullable String description) {
    this.geturl = geturl;
    this.method = method;
    this.header = header;
    this.body = body;
    this.description = description;
  }

  /**
   * @return The value of the {@code geturl} attribute
   */
  @JsonProperty("geturl")
  @Override
  public @Nullable String geturl() {
    return geturl;
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public @Nullable String getMethod() {
    return method;
  }

  /**
   * @return The value of the {@code header} attribute
   */
  @JsonProperty("header")
  @Override
  public @Nullable ImmutableList<HeaderDTO> getHeader() {
    return header;
  }

  /**
   * @return The value of the {@code body} attribute
   */
  @JsonProperty("body")
  @Override
  public @Nullable BodyDTO getBody() {
    return body;
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
   * Copy the current immutable object by setting a value for the {@link RequestDTO#geturl() geturl} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for geturl (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRequestDTO withGeturl(@Nullable String value) {
    if (Objects.equals(this.geturl, value)) return this;
    return new ImmutableRequestDTO(value, this.method, this.header, this.body, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RequestDTO#getMethod() method} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for method (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRequestDTO withMethod(@Nullable String value) {
    if (Objects.equals(this.method, value)) return this;
    return new ImmutableRequestDTO(this.geturl, value, this.header, this.body, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RequestDTO#getHeader() header}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestDTO withHeader(@Nullable HeaderDTO... elements) {
    if (elements == null) {
      return new ImmutableRequestDTO(this.geturl, this.method, null, this.body, this.description);
    }
    @Nullable ImmutableList<HeaderDTO> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableRequestDTO(this.geturl, this.method, newValue, this.body, this.description);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link RequestDTO#getHeader() header}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of header elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRequestDTO withHeader(@Nullable Iterable<? extends HeaderDTO> elements) {
    if (this.header == elements) return this;
    @Nullable ImmutableList<HeaderDTO> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableRequestDTO(this.geturl, this.method, newValue, this.body, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RequestDTO#getBody() body} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for body (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRequestDTO withBody(@Nullable BodyDTO value) {
    if (this.body == value) return this;
    return new ImmutableRequestDTO(this.geturl, this.method, this.header, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RequestDTO#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRequestDTO withDescription(@Nullable String value) {
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableRequestDTO(this.geturl, this.method, this.header, this.body, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRequestDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRequestDTO
        && equalTo((ImmutableRequestDTO) another);
  }

  private boolean equalTo(ImmutableRequestDTO another) {
    return Objects.equals(geturl, another.geturl)
        && Objects.equals(method, another.method)
        && Objects.equals(header, another.header)
        && Objects.equals(body, another.body)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code geturl}, {@code method}, {@code header}, {@code body}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(geturl);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(header);
    h += (h << 5) + Objects.hashCode(body);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code RequestDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RequestDTO")
        .omitNullValues()
        .add("geturl", geturl)
        .add("method", method)
        .add("header", header)
        .add("body", body)
        .add("description", description)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RequestDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RequestDTO instance
   */
  public static ImmutableRequestDTO copyOf(RequestDTO instance) {
    if (instance instanceof ImmutableRequestDTO) {
      return (ImmutableRequestDTO) instance;
    }
    return ImmutableRequestDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRequestDTO ImmutableRequestDTO}.
   * @return A new ImmutableRequestDTO builder
   */
  public static ImmutableRequestDTO.Builder builder() {
    return new ImmutableRequestDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRequestDTO ImmutableRequestDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private @Nullable String geturl;
    private @Nullable String method;
    private ImmutableList.Builder<HeaderDTO> header = null;
    private @Nullable BodyDTO body;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RequestDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(RequestDTO instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable String geturlValue = instance.geturl();
      if (geturlValue != null) {
        geturl(geturlValue);
      }
      @Nullable String methodValue = instance.getMethod();
      if (methodValue != null) {
        method(methodValue);
      }
      @Nullable List<HeaderDTO> headerValue = instance.getHeader();
      if (headerValue != null) {
        addAllHeader(headerValue);
      }
      @Nullable BodyDTO bodyValue = instance.getBody();
      if (bodyValue != null) {
        body(bodyValue);
      }
      @Nullable String descriptionValue = instance.getDescription();
      if (descriptionValue != null) {
        description(descriptionValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link RequestDTO#geturl() geturl} attribute.
     * @param geturl The value for geturl (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("geturl")
    public final Builder geturl(@Nullable String geturl) {
      this.geturl = geturl;
      return this;
    }

    /**
     * Initializes the value for the {@link RequestDTO#getMethod() method} attribute.
     * @param method The value for method (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("method")
    public final Builder method(@Nullable String method) {
      this.method = method;
      return this;
    }

    /**
     * Adds one element to {@link RequestDTO#getHeader() header} list.
     * @param element A header element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHeader(HeaderDTO element) {
      if (this.header == null) {
        this.header = ImmutableList.builder();
      }
      this.header.add(element);
      return this;
    }

    /**
     * Adds elements to {@link RequestDTO#getHeader() header} list.
     * @param elements An array of header elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addHeader(HeaderDTO... elements) {
      if (this.header == null) {
        this.header = ImmutableList.builder();
      }
      this.header.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link RequestDTO#getHeader() header} list.
     * @param elements An iterable of header elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("header")
    public final Builder header(@Nullable Iterable<? extends HeaderDTO> elements) {
      if (elements == null) {
        this.header = null;
        return this;
      }
      this.header = ImmutableList.builder();
      return addAllHeader(elements);
    }

    /**
     * Adds elements to {@link RequestDTO#getHeader() header} list.
     * @param elements An iterable of header elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllHeader(Iterable<? extends HeaderDTO> elements) {
      Objects.requireNonNull(elements, "header element");
      if (this.header == null) {
        this.header = ImmutableList.builder();
      }
      this.header.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link RequestDTO#getBody() body} attribute.
     * @param body The value for body (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("body")
    public final Builder body(@Nullable BodyDTO body) {
      this.body = body;
      return this;
    }

    /**
     * Initializes the value for the {@link RequestDTO#getDescription() description} attribute.
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
     * Builds a new {@link ImmutableRequestDTO ImmutableRequestDTO}.
     * @return An immutable instance of RequestDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRequestDTO build() {
      return new ImmutableRequestDTO(geturl, method, header == null ? null : header.build(), body, description);
    }
  }
}
