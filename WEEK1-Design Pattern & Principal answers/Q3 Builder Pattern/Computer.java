public class Computer {
    // Attributes of the Computer
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    // Private constructor to enforce the use of the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    // Getters for the attributes
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGPU() { return GPU; }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        // Methods to set each attribute
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        // Method to build the Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
