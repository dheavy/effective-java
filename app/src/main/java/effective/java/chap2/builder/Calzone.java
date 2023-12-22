package effective.java.chap2.builder;

public class Calzone extends Pizza {
    private final boolean hasSauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean hasSauceInside = false; // default

        public Builder sauceInside() {
            hasSauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.hasSauceInside = builder.hasSauceInside;
    }
}
