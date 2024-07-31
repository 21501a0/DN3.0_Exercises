package computer;

public class Computer {
    private String processor;
    private String memory;
    private String graphicsCard;
    private String diskSpace;

    private Computer(ComputerBuilder builder){
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.graphicsCard = builder.graphicsCard;
        this.diskSpace = builder.diskSpace;
    }

    public String getProcessor() { return processor; }
    public String getMemory() { return memory; }
    public String getDiskSpace() { return diskSpace; }
    public String getGraphicsCard() { return graphicsCard; }

    public String displayInfo() {
        return String.format("Processor: %s%nMemory: %s%nDisk Space: %s%nGraphics Card: %s%n",
        processor, memory, diskSpace, graphicsCard);
    }

    public static class ComputerBuilder {
        private String processor;
        private String memory;
        private String diskSpace;
        private String graphicsCard;

        public ComputerBuilder withProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        public ComputerBuilder withMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public ComputerBuilder withDiskSpace(String diskSpace) {
            this.diskSpace = diskSpace;
            return this;
        }
        public ComputerBuilder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
