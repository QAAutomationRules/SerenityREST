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
 * Immutable implementation of {@link CollectionDTO}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCollectionDTO.builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated("org.immutables.processor.ProxyProcessor")
@org.immutables.value.Generated(from = "CollectionDTO", generator = "Immutables")
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableCollectionDTO implements CollectionDTO {
  private final @Nullable InfoDTO info;
  private final @Nullable ImmutableList<ItemDTO> item;

  private ImmutableCollectionDTO(
      @Nullable InfoDTO info,
      @Nullable ImmutableList<ItemDTO> item) {
    this.info = info;
    this.item = item;
  }

  /**
   * @return The value of the {@code info} attribute
   */
  @JsonProperty("info")
  @Override
  public @Nullable InfoDTO getInfo() {
    return info;
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public @Nullable ImmutableList<ItemDTO> getItem() {
    return item;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CollectionDTO#getInfo() info} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for info (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCollectionDTO withInfo(@Nullable InfoDTO value) {
    if (this.info == value) return this;
    return new ImmutableCollectionDTO(value, this.item);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CollectionDTO#getItem() item}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionDTO withItem(@Nullable ItemDTO... elements) {
    if (elements == null) {
      return new ImmutableCollectionDTO(this.info, null);
    }
    @Nullable ImmutableList<ItemDTO> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableCollectionDTO(this.info, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CollectionDTO#getItem() item}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of item elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionDTO withItem(@Nullable Iterable<? extends ItemDTO> elements) {
    if (this.item == elements) return this;
    @Nullable ImmutableList<ItemDTO> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableCollectionDTO(this.info, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCollectionDTO} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCollectionDTO
        && equalTo((ImmutableCollectionDTO) another);
  }

  private boolean equalTo(ImmutableCollectionDTO another) {
    return Objects.equals(info, another.info)
        && Objects.equals(item, another.item);
  }

  /**
   * Computes a hash code from attributes: {@code info}, {@code item}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(info);
    h += (h << 5) + Objects.hashCode(item);
    return h;
  }

  /**
   * Prints the immutable value {@code CollectionDTO} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CollectionDTO")
        .omitNullValues()
        .add("info", info)
        .add("item", item)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link CollectionDTO} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CollectionDTO instance
   */
  public static ImmutableCollectionDTO copyOf(CollectionDTO instance) {
    if (instance instanceof ImmutableCollectionDTO) {
      return (ImmutableCollectionDTO) instance;
    }
    return ImmutableCollectionDTO.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCollectionDTO ImmutableCollectionDTO}.
   * @return A new ImmutableCollectionDTO builder
   */
  public static ImmutableCollectionDTO.Builder builder() {
    return new ImmutableCollectionDTO.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCollectionDTO ImmutableCollectionDTO}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static final class Builder {
    private @Nullable InfoDTO info;
    private ImmutableList.Builder<ItemDTO> item = null;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CollectionDTO} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(CollectionDTO instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable InfoDTO infoValue = instance.getInfo();
      if (infoValue != null) {
        info(infoValue);
      }
      @Nullable List<ItemDTO> itemValue = instance.getItem();
      if (itemValue != null) {
        addAllItem(itemValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link CollectionDTO#getInfo() info} attribute.
     * @param info The value for info (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("info")
    public final Builder info(@Nullable InfoDTO info) {
      this.info = info;
      return this;
    }

    /**
     * Adds one element to {@link CollectionDTO#getItem() item} list.
     * @param element A item element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addItem(ItemDTO element) {
      if (this.item == null) {
        this.item = ImmutableList.builder();
      }
      this.item.add(element);
      return this;
    }

    /**
     * Adds elements to {@link CollectionDTO#getItem() item} list.
     * @param elements An array of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addItem(ItemDTO... elements) {
      if (this.item == null) {
        this.item = ImmutableList.builder();
      }
      this.item.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link CollectionDTO#getItem() item} list.
     * @param elements An iterable of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("item")
    public final Builder item(@Nullable Iterable<? extends ItemDTO> elements) {
      if (elements == null) {
        this.item = null;
        return this;
      }
      this.item = ImmutableList.builder();
      return addAllItem(elements);
    }

    /**
     * Adds elements to {@link CollectionDTO#getItem() item} list.
     * @param elements An iterable of item elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllItem(Iterable<? extends ItemDTO> elements) {
      Objects.requireNonNull(elements, "item element");
      if (this.item == null) {
        this.item = ImmutableList.builder();
      }
      this.item.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableCollectionDTO ImmutableCollectionDTO}.
     * @return An immutable instance of CollectionDTO
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCollectionDTO build() {
      return new ImmutableCollectionDTO(info, item == null ? null : item.build());
    }
  }
}
