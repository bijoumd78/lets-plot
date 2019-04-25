package jetbrains.datalore.base.observable.property

class PropertyChangeEvent<ValueT>(val oldValue: ValueT?, val newValue: ValueT) {

    override fun toString(): String {
        return oldValue.toString() + " -> " + newValue
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PropertyChangeEvent<*>

        if (oldValue != other.oldValue) return false
        if (newValue != other.newValue) return false

        return true
    }

    override fun hashCode(): Int {
        var result = oldValue?.hashCode() ?: 0
        result = 31 * result + (newValue?.hashCode() ?: 0)
        return result
    }
}