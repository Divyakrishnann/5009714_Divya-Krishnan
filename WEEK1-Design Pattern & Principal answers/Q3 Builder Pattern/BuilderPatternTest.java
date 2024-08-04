public class BuilderPatternTest {
        public static void main(String[] args) {
            Computer c1 = new Computer.Builder()
            .setCPU("Intel i7")
            .setRAM("16GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA GTX 3080")
            .build();
            Computer c2 = new Computer.Builder()
            .setCPU("AMD Ryzen 5")
            .setRAM("8GB")
            .setStorage("512GB SSD")
            .build();
            System.out.println("Computer 1: CPU = " + c1.getCPU()+",RAM = "+c1.getRAM()+", Storage= "+ c1.getStorage()+", Graphics=  "+c1.getGPU());
            System.out.println("Computer 2: CPU = " + c2.getCPU()+",RAM = "+c2.getRAM()+", Storage ="+ c2.getStorage());
        } 
        
    }
    