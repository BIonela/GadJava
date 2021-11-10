package lab4;

public class Computer {

    private boolean bluetooth;
    private int ram;
    private int memory;
    private String cpu;
    private String video;

    private Computer(int ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

//    @Override
//    public String toString() {
//        return "Computer{" +
//                "bluetooth=" + bluetooth +
//                ", ram=" + ram +
//                ", memory=" + memory +
//                ", cpu='" + cpu + '\'' +
//                ", video='" + video + '\'' +
//                '}';
//    }

    public String toString(){
        return "computer with: " + cpu + ", ram " + ram;
    }

    public static class Builder {
        private boolean bluetooth;
        private int ram;
        private int memory;
        private String cpu;
        private String video;

        public Builder(String cpu) {
            this.cpu=cpu;
        }

        public void setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Computer build () {
            Computer toReturn = new Computer(this.ram, this.cpu);
            toReturn.bluetooth = this.bluetooth;
            toReturn.video = this.video;
            toReturn.memory = this.memory;
            return toReturn;
        }
    }
}
