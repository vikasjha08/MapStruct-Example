package com.project.mapperexample.Entity;

public class Tag {
    private String name;

    Tag(String name) {
        this.name = name;
    }

    public static TagBuilder builder() {
        return new TagBuilder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Tag)) return false;
        final Tag other = (Tag) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Tag;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "Tag(name=" + this.getName() + ")";
    }

    public static class TagBuilder {
        private String name;

        TagBuilder() {
        }

        public TagBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Tag build() {
            return new Tag(this.name);
        }

        public String toString() {
            return "Tag.TagBuilder(name=" + this.name + ")";
        }
    }
}
